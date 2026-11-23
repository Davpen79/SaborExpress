package com.davpen79.saborexpress.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.davpen79.saborexpress.R
import com.davpen79.saborexpress.model.PlatoModel
import com.davpen79.saborexpress.seeder.listaPlatos
import com.davpen79.saborexpress.ui.component.ColumnaDirecciones
import com.davpen79.saborexpress.ui.component.ColumnaDireccionesData
import com.davpen79.saborexpress.ui.component.TarjetaPlato
import com.davpen79.saborexpress.ui.component.TarjetaPlatoData
import com.davpen79.saborexpress.viewmodel.PlatosListVM
import com.example.compose.SaborExpressTheme

@Composable
fun PantallaSeleccionPlato(
    viewModel: PlatosListVM = viewModel(),
    onCardClick: (Int) -> Unit,
    modifier: Modifier = Modifier
) {

    val state by viewModel.uiState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.cargar()
    }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White),
        //horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)

    ) {

        ColumnaDirecciones(
            data = ColumnaDireccionesData(
                direccionTienda = state.localizacionTienda,
                direccionEnvio = state.localizacionEnvio
            ),
            modifier = Modifier.padding(8.dp)
        )

        Text(
            text = stringResource(R.string.hazseleccion),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(5.dp, 5.dp, 5.dp, 0.dp)
        )

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.White)
                .border(width = 1.dp, Color.Black, shape = RoundedCornerShape(10.dp)),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(4.dp)
        ) {
            items(state.platosList.size) { index ->
                TarjetaPlato(
                    data = platoModel2TarjetaPlatoData(listaPlatos[index]),
                    onVistazo = onCardClick
                    //modifier = Modifier.padding(horizontal = 8.dp)
                )
            }
        }
    }

}

fun platoModel2TarjetaPlatoData(platoModel: PlatoModel): TarjetaPlatoData{

    return TarjetaPlatoData(
        id = platoModel.id,
        imagenPlato = platoModel.imagenPlato,
        nombrePlato = platoModel.nombrePlato,
        descripcion = platoModel.descripcion,
        precio = platoModel.precio,
        moneda = platoModel.moneda,
        onAnhadir = platoModel.onAnhadir)
}


@Preview(showBackground = true)
@Composable
fun PantallaSeleccionPlatoPreview() {
    SaborExpressTheme() {
        PantallaSeleccionPlato(
            onCardClick = {})

    }
}