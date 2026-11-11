package com.davpen79.saborexpress.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davpen79.saborexpress.R
import com.example.compose.onPrimaryLight


data class PantallaRegistroData(
    val textoCondiciones: String
){

}

@Composable
fun PantallaRegistro(
    data: PantallaRegistroData,
    modifier: Modifier = Modifier
){

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(onPrimaryLight),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(6.dp)

    ) {

        var correoElectronico by remember { mutableStateOf("") }

        TextField(modifier = modifier.fillMaxWidth(),
            value = correoElectronico,
            onValueChange = { nuevoValor ->
                correoElectronico = nuevoValor
            },
            label = {Text(text = stringResource(R.string.tituloemail),
                fontWeight = FontWeight.Bold)}
        )

        var password by remember { mutableStateOf("") }

        TextField(modifier = modifier.fillMaxWidth(),
            value = password,
            onValueChange = { nuevoValor ->
                password = nuevoValor
            },
            label = {Text(text = stringResource(R.string.titulopassword),
                fontWeight = FontWeight.Bold, style = MaterialTheme.typography.bodySmall
                , textAlign = TextAlign.Start)}
        )

    }

}

@Preview(showBackground = true)
@Composable
fun PantallaRegistroPreview(){
    MaterialTheme(){
        PantallaRegistro(
            data = PantallaRegistroData(
                textoCondiciones = "Aceptar TOCS"
            )
        )
    }
}