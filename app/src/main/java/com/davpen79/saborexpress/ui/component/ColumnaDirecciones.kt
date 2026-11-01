package com.davpen79.saborexpress.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davpen79.saborexpress.R

data class ColumnaDireccionesData(
    val direccionTienda: String,
    val direccionEnvio: String,
)

@Composable
fun ColumnaDirecciones(
    data: ColumnaDireccionesData,
    modifier: Modifier = Modifier
) {
    Column( modifier = Modifier.fillMaxWidth().padding(8.dp),verticalArrangement = Arrangement.spacedBy(8.dp)) {

        RowLocalizacion(
            data = RowLocalizacionData(
                localizacion = stringResource(R.string.tiendaLocalizacion),
                localizacionDescripcion = data.direccionTienda
            )
        )

        RowLocalizacion(
            data = RowLocalizacionData(
                localizacion = stringResource(R.string.envioLocalizacion),
                localizacionDescripcion = data.direccionEnvio
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ColumnaDireccionesPreview() {
    MaterialTheme() {
        ColumnaDirecciones(
            data = ColumnaDireccionesData(
                direccionTienda = "Calle Mayor , 14",
                direccionEnvio = "Gran Via, 1"
            )
        )
    }
}