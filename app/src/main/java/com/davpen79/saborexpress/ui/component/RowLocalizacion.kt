package com.davpen79.saborexpress.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.davpen79.saborexpress.R

data class RowLocalizacionData(
    val localizacionTitulo: String,
    val localizacionDescripcion: String
)

@Composable
fun RowLocalizacion(
    data: RowLocalizacionData,
    modifier: Modifier = Modifier
) {
    Card(modifier = Modifier
        .border(width = 1.dp, Color.Black, shape = RoundedCornerShape(10.dp))) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            ColumnaDescripcion(
                data = ColumnaDescripcionData(
                    titulo = data.localizacionTitulo,
                    descripcion = data.localizacionDescripcion,
                    fontSizeTitulo = 12.sp,
                    fontWeightTitulo = FontWeight.Normal,
                    fontSizeDescripcion = 18.sp,
                    fontWeightDescripcion = FontWeight.ExtraBold
                ),
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f)
            )
            BotonPrincipal(
                data = BotonPrincipalData(
                    texto = stringResource(R.string.cambiarLocalizacion),
                    onBotonClick = {}
                ),
                modifier = Modifier
                    .widthIn(max = 150.dp)
                    .padding(start = 8.dp, top = 10.dp, end = 12.dp, bottom = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RowLocalizacionPreview() {
    RowLocalizacion(
        data = RowLocalizacionData(
            localizacionTitulo = stringResource(R.string.tituloTienda),
            localizacionDescripcion = "Calle Mayor, 14"
        )
    )
}