package com.davpen79.saborexpress.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.davpen79.saborexpress.R
import com.davpen79.saborexpress.seeder.PlatosSeeder
import com.davpen79.saborexpress.ui.component.ColumnaDirecciones
import com.davpen79.saborexpress.ui.component.ColumnaDireccionesData
import com.davpen79.saborexpress.ui.component.TarjetaPlato
import com.davpen79.saborexpress.ui.component.TarjetaPlatoData

data class PantallaSeleccionPlatoData(
    val localizacionTienda: String,
    val localizacionEnvio: String,
    val platosList: List<TarjetaPlatoData>
)

@Composable
fun PantallaSeleccionPlato(
    data: PantallaSeleccionPlatoData,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color.White),
        //horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)

    ) {

        ColumnaDirecciones(
            data = ColumnaDireccionesData(
                direccionTienda = data.localizacionTienda,
                direccionEnvio = data.localizacionEnvio
            ),
            modifier = Modifier.padding(8.dp)
        )

        Text(
            text = stringResource(R.string.hazseleccion),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 22.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(10.dp, 10.dp, 10.dp, 0.dp)
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
                .background(Color.White)
                .border(width = 1.dp, Color.Black, shape = RoundedCornerShape(10.dp)),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(4.dp)
        ) {
            items(data.platosList) { plato ->
                TarjetaPlato(
                    data = plato,
                    //modifier = Modifier.padding(horizontal = 8.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaSeleccionPlatoPreview() {
    MaterialTheme() {
        PantallaSeleccionPlato(
            data = PantallaSeleccionPlatoData(
                localizacionEnvio = "Gran Via, 4",
                localizacionTienda = "Calle Mayor, 12",
                platosList = PlatosSeeder.obtenerListaPlatos()
            )
        )
    }
}