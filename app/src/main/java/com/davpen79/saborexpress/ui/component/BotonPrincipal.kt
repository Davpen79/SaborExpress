package com.davpen79.saborexpress.ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davpen79.saborexpress.R
import com.example.compose.SaborExpressTheme


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
        shape = RoundedCornerShape(10.dp),
        modifier = modifier,
        contentPadding = PaddingValues(
            horizontal = 10.dp,
            vertical = 8.dp
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,//Color(0xFFFF9800)
            contentColor = MaterialTheme.colorScheme.onPrimary
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

            Text(text = data.texto, modifier = Modifier)
        }
    }

}

@Preview
@Composable
fun BotonPrincipalPreview() {
    SaborExpressTheme() {
        BotonPrincipal(
            data = BotonPrincipalData(
                icono = R.drawable.carrito,
                texto = "Añadir al carrito",
                onBotonClick = {}

            )
        )
    }
}