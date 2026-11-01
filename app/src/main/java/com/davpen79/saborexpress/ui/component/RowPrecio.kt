package com.davpen79.saborexpress.ui.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.davpen79.saborexpress.R


data class RowPrecioData (

    val precioArticulo: String,
    val simboloMoneda: Int

)

@Composable
fun RowPrecio(
    data: RowPrecioData,
    modifier: Modifier = Modifier,
    precioFontSize: TextUnit = 14.sp,
    monedaFontSize: TextUnit = 16.sp,
    precioFontWeight: FontWeight = FontWeight.Normal,
    monedaFontWeight: FontWeight = FontWeight.Normal

) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = data.precioArticulo,
            fontSize = precioFontSize,
            fontWeight = precioFontWeight
        )

        Text(
            text = stringResource( data.simboloMoneda),
            fontSize = monedaFontSize,
            fontWeight = monedaFontWeight,
            modifier = Modifier.padding(0.dp, 4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun RowPrecioPreview(){
    RowPrecio(
        data = RowPrecioData(
            precioArticulo = "10",
            simboloMoneda = R.string.simboloMoneda
        )
    )
}