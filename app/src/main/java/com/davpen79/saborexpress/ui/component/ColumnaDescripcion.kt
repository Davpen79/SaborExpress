package com.davpen79.saborexpress.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

data class ColumnaDescripcionData(

    val titulo: String,
    val descripcion: String
)

@Composable
fun ColumnaDescripcion(
    data: ColumnaDescripcionData,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(text = data.titulo,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold)

        Text(text = data.descripcion,
            fontSize = 15.sp,
            maxLines = 2,
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