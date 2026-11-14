package com.davpen79.saborexpress.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davpen79.saborexpress.R
import com.example.compose.SaborExpressTheme

data class PantallaRegistroData(
    val textoCondiciones: String
) {

}

@Composable
fun PantallaRegistro(
    data: PantallaRegistroData,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(14.dp)
            .background(MaterialTheme.colorScheme.onPrimary),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(6.dp)

    ) {

        var correoElectronico by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(MaterialTheme.colorScheme.onPrimary)
        ) {

            Text(
                text = stringResource(R.string.tituloemail),
                fontWeight = FontWeight.Medium
            )

            TextField(
                modifier = Modifier.fillMaxWidth(),
                placeholder = {Text(text = stringResource(R.string.placeholdercorreo))},
                value = correoElectronico,
                onValueChange = { nuevoValor ->
                    correoElectronico = nuevoValor
                },
                colors = colors(
                    focusedContainerColor = MaterialTheme.colorScheme.onPrimary,
                    unfocusedContainerColor = MaterialTheme.colorScheme.onPrimary,
                    focusedTextColor = MaterialTheme.colorScheme.scrim,
                    unfocusedTextColor = MaterialTheme.colorScheme.onTertiaryContainer
                )
            )
        }


        var password by remember { mutableStateOf("") }
        var mostrarPassword by remember { mutableStateOf(false) }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(MaterialTheme.colorScheme.onPrimary)
        ) {

            Text(
                text = stringResource(R.string.titulopassword),
                fontWeight = FontWeight.Medium
            )

            TextField(
                modifier = Modifier.fillMaxWidth(),
                placeholder = {Text(text = stringResource(R.string.placeholderpassword))},
                value = password,
                onValueChange = { nuevoValor ->
                    password = nuevoValor
                },
                visualTransformation = if (mostrarPassword) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                },
                trailingIcon = {
                    IconButton(
                        onClick = {
                            mostrarPassword = !mostrarPassword
                        }
                    ) {
                        Icon(
                            imageVector = if (mostrarPassword) {
                                Icons.Filled.Visibility
                            } else {
                                Icons.Filled.VisibilityOff
                            },
                            contentDescription = if (mostrarPassword) {
                                "Ocultar contraseña"
                            } else {
                                "Mostrar contraseña"
                            }
                        )
                    }
                },

                colors = colors(
                    focusedContainerColor = MaterialTheme.colorScheme.onPrimary,
                    unfocusedContainerColor = MaterialTheme.colorScheme.onPrimary,
                    focusedTextColor = MaterialTheme.colorScheme.scrim,
                    unfocusedTextColor = MaterialTheme.colorScheme.onTertiaryContainer
                )
            )
        }


    }

}

@Preview(showBackground = true)
@Composable
fun PantallaRegistroPreview() {
    SaborExpressTheme() {
        PantallaRegistro(
            data = PantallaRegistroData(
                textoCondiciones = "Aceptar TOCS"
            )
        )
    }
}