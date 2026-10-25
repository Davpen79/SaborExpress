package com.davpen79.saborexpress.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class ColumnaDescripcionData(

    val titulo: String,
    val descripcion: String,
    val fontSizeTitulo: TextUnit = 20.sp,
    val fontWeightTitulo: FontWeight = FontWeight.ExtraBold,
    val fontSizeDescripcion: TextUnit = 15.sp,
    val fontWeightDescripcion: FontWeight = FontWeight.Normal
)

@Composable
fun ColumnaDescripcion(
    data: ColumnaDescripcionData,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = data.titulo,
            fontSize = data.fontSizeTitulo,
            fontWeight = FontWeight.ExtraBold,
            maxLines = 1,
            autoSize = TextAutoSize.StepBased(
                minFontSize = 12.sp,
                maxFontSize = data.fontSizeTitulo,
                stepSize = 1.sp
            ),
            overflow = TextOverflow.Ellipsis)

        Spacer(modifier = Modifier.size(6.dp))

        Text(text = data.descripcion,
            fontSize = data.fontSizeDescripcion,
            fontWeight = data.fontWeightDescripcion,
            //maxLines = 2,
            overflow = TextOverflow.Ellipsis)
    }

}

@Preview
@Composable
fun ColumnaDescripcionPreview() {
    MaterialTheme() {
        ColumnaDescripcion(
            data = ColumnaDescripcionData(
                titulo = "Titulo",
                descripcion = "Descripcion",
            ),
        )
    }
}