package com.davpen79.saborexpress.ui.component

import android.graphics.drawable.Icon
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davpen79.saborexpress.R

data class BotonPrincipalData(

    val icono: Int? = null,
    val texto: String,
    val onBotonClick: () -> Unit
)

@Composable
fun BotonPrincipal(
    data: BotonPrincipalData,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = data.onBotonClick,
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFFF9800),
            contentColor = Color.White
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            data.icono?.let { icono ->
                Icon(
                    painter = painterResource(icono),
                    contentDescription = stringResource(R.string.icono),
                    modifier = Modifier.size(ButtonDefaults.IconSize)
                )
                Spacer(modifier = Modifier.width(ButtonDefaults.IconSpacing))
            }

            Text(text = data.texto)
        }
    }

}

@Preview
@Composable
fun BotonPrincipalPreview() {
    MaterialTheme() {
        BotonPrincipal(
            data = BotonPrincipalData(
                icono = R.drawable.carrito,
                texto = "Añadir al carrito",
                onBotonClick = {}

            )
        )
    }
}