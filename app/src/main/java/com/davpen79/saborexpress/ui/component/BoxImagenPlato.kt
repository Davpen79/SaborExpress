package com.davpen79.saborexpress.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davpen79.saborexpress.R

data class BoxImagenPlatoData(
    @DrawableRes val imagenPlato: Int,
    val onIconoDerecho: () -> Unit,
    val onIconoIzquierdo: () -> Unit
)

@Composable
fun BoxImagenPlato(
    data: BoxImagenPlatoData,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier
        .fillMaxWidth()
        .height(200.dp)){

        Image(
            painter = painterResource(data.imagenPlato),
            contentDescription = stringResource(R.string.imagen_de_plato),
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        IconButton(onClick = data.onIconoIzquierdo,
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(8.dp)) {
            Icon(painter = painterResource(R.drawable.backbutton),
                contentDescription = stringResource(R.string.backButton),
                tint = Color(0xFFFF9800),
                modifier = Modifier
                    .size(30.dp)
                    .background(
                        color = Color.White,
                        shape = CircleShape
                    )
                    .padding(2.dp)
            )
        }

        IconButton(onClick = data.onIconoDerecho,
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(8.dp)) {
            Icon(painter = painterResource(R.drawable.favoritebutton),
                contentDescription = stringResource(R.string.favoriteButton),
                tint = Color(0xFFFFC0CB),
                modifier = Modifier
                    .size(30.dp)
                    .background(
                        color = Color.White,
                        shape = CircleShape
                    )
                    .padding(1.dp)
            )
        }
    }

}

@Preview
@Composable
fun BoxImagenPlatoPreview(){
    MaterialTheme() {
        BoxImagenPlato(
            data = BoxImagenPlatoData(
                imagenPlato = R.drawable.burguer3,
                onIconoIzquierdo = {},
                onIconoDerecho = {}
            )
        )
    }
}