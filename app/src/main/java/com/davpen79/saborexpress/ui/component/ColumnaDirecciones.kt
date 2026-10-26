package com.davpen79.saborexpress.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davpen79.saborexpress.R

data class ColumnaDireccionesData(
    val tituloTienda: String,
    val localizacionTienda: String,
    val tituloDomicilio: String,
    val localizacionDomicilio: String
)

@Composable
fun ColumnaDirecciones(
    data: ColumnaDireccionesData,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = Modifier
            .padding(6.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(6.dp)
    ) {
        RowLocalizacion(
            data = RowLocalizacionData(
                localizacionTitulo = data.tituloTienda,
                localizacionDescripcion = data.localizacionTienda
            )
        )
        RowLocalizacion(
            data = RowLocalizacionData(
                localizacionTitulo = data.tituloDomicilio,
                localizacionDescripcion = data.localizacionDomicilio
            )
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ColumnaDireccionesPreview() {
    ColumnaDirecciones(
        data = ColumnaDireccionesData(
            tituloTienda = stringResource(R.string.tituloTienda),
            localizacionTienda = "Calle Mayor, 14",
            tituloDomicilio = stringResource(R.string.tituloDomicilio),
            localizacionDomicilio = "Gran Via, 12"
        )
    )
}