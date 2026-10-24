package com.davpen79.saborexpress.ui.component

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.davpen79.saborexpress.R

data class TarjetaPlatoData(

    @DrawableRes val imagenPlato: Int,
    val nombrePlato: String,
    val descripcion: String,
    val precio: String,
    val onAnhadir: () -> Unit,
    val onVistazo: () -> Unit

)

@Composable
fun TarjetaPlato(
    data: TarjetaPlatoData,
    modifier: Modifier = Modifier
){
    Card(modifier = modifier.fillMaxWidth()) {
        Row(verticalAlignment =  Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)) {

            Image(
                painter = painterResource(data.imagenPlato),
                contentDescription = stringResource(R.string.imagen_de_plato),
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(80.dp)
            )

            ColumnaDescripcion(
                data = ColumnaDescripcionData(
                    titulo = data.nombrePlato,
                    descripcion = data.descripcion
                ),
                modifier = Modifier.weight(1f)
            )

            Text(text = data.precio,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)

            Button(
                onClick = data.onAnhadir,
                modifier = Modifier
                    .padding(start = 8.dp)
                    .size(60.dp),
                shape = RoundedCornerShape(5.dp),
                contentPadding = PaddingValues(4.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFF9800),
                    contentColor = Color.White
                )
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(
                        painter = painterResource(R.drawable.carrito),
                        contentDescription = stringResource(R.string.carrito),
                        modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(text = stringResource(R.string.anhadir),
                        maxLines = 1)
                }
            }

        }
    }
}

@Preview
@Composable
fun TarjetaPlatoPreview(){
    MaterialTheme(){
        TarjetaPlato(
            data = TarjetaPlatoData(
                imagenPlato = R.drawable.plato002,
                nombrePlato = "Hamburguesa",
                descripcion = "Descripcion de una suculenta hamburguesa de ternera con queso y lechuga",
                precio = "8€",
                onAnhadir = {},
                onVistazo = {}
            )
        )
    }
}