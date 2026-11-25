package com.davpen79.saborexpress.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.davpen79.saborexpress.R
import com.davpen79.saborexpress.ui.component.BotonPrincipal
import com.davpen79.saborexpress.ui.component.BotonPrincipalData
import com.davpen79.saborexpress.ui.component.BoxImagenPlato
import com.davpen79.saborexpress.ui.component.BoxImagenPlatoData
import com.davpen79.saborexpress.ui.component.ColumnaDescripcion
import com.davpen79.saborexpress.ui.component.ColumnaDescripcionData
import com.davpen79.saborexpress.ui.component.RowPrecio
import com.davpen79.saborexpress.ui.component.RowPrecioData
import com.example.compose.SaborExpressTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.davpen79.saborexpress.viewmodel.PlatoDetalleVM

@Composable
fun PantallaDetalle(
    id: Int,
    onGoBack: () -> Unit,
    viewModel: PlatoDetalleVM = viewModel(),
    modifier: Modifier = Modifier
) {

    val state by viewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.cargar(id)
    }

    val comida = state.comida

    if (comida != null) {

        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(16.dp)
                .background(MaterialTheme.colorScheme.onPrimary),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(6.dp),

            ) {

            BoxImagenPlato(
                data = BoxImagenPlatoData(
                    imagenPlato = comida.imagenPlato,
                    onIconoDerecho = viewModel::onIconoDerechoClick,
                    onIconoIzquierdo = {onGoBack()}
                ),
                modifier = Modifier.fillMaxWidth()
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .fillMaxHeight()
                    .weight(1f),
                //verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                ColumnaDescripcion(
                    data = ColumnaDescripcionData(
                        titulo = comida.titulo,
                        descripcion = comida.descripcion,
                        fontSizeTitulo = 24.sp
                    ),
                    componenteScrolleable = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp)
                        .weight(0.35f)
                )

                ColumnaDescripcion(
                    data = ColumnaDescripcionData(
                        titulo = stringResource(R.string.tituloingredientes),
                        descripcion = comida.ingredientes
                            .joinToString("\n") { "- $it" }
                    ),
                    componenteScrolleable = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp)
                        .weight(0.35f)
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.1f),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(R.string.titulocalorias),
                        fontSize = 16.sp,
                        textAlign = TextAlign.Left,
                        modifier = Modifier.padding(10.dp)
                    )

                    Text(
                        comida.caloriasValue,
                        textAlign = TextAlign.Right
                    )

                    Text(
                        text = stringResource(R.string.calorias),
                        textAlign = TextAlign.Right,
                        modifier = Modifier
                            .padding(2.dp, 10.dp)
                        //.align(Alignment.CenterVertically)
                    )
                }

                ColumnaDescripcion(
                    data = ColumnaDescripcionData(
                        titulo = stringResource(R.string.tituloalergenos),
                        descripcion = comida.alergenos
                    ),
                    componenteScrolleable = true,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp)
                        .weight(0.2f)
                )

            }

            //Spacer(modifier = Modifier.weight(1f))

            Column(modifier = Modifier) {
                Row(
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(6.dp)
                ) {
                    Text(
                        text = stringResource(R.string.precio),
                        fontSize = 16.sp,
                        textAlign = TextAlign.Right,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )

                    RowPrecio(
                        data = RowPrecioData(
                            precioArticulo = comida.precio,
                            simboloMoneda = R.string.simboloMoneda
                        ),
                        modifier = Modifier.padding(8.dp),
                        precioFontSize = 20.sp,
                        monedaFontSize = 22.sp,
                        monedaFontWeight = FontWeight.ExtraBold
                    )

                }
                BotonPrincipal(
                    data = BotonPrincipalData(
                        icono = R.drawable.carrito,
                        texto = stringResource(R.string.anhadiralcarrito),
                        onBotonClick = viewModel::onBotonClick
                    ),
                    modifier = Modifier
                        .padding(6.dp)
                        .fillMaxWidth()
                )

            }

        }

    } else {
        Text("Cargando el Plato...")
        return
    }
}


@Preview(showBackground = true)
@Composable
fun PantallaDetallePreview() {
    SaborExpressTheme() {
        PantallaDetalle(
            id = 7,
            onGoBack = {}
        )
    }
}