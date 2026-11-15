package com.davpen79.saborexpress.ui.page

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults.colors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davpen79.saborexpress.R
import com.davpen79.saborexpress.ui.component.BotonPrincipal
import com.davpen79.saborexpress.ui.component.BotonPrincipalData
import com.example.compose.SaborExpressTheme

data class PantallaRegistroData(

    val onBotonPrincipalClick: () -> Unit,
    val onTextoClick: () -> Unit,
    val onBotonSecundario: () -> Unit
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

        BotonPrincipal(
            data = BotonPrincipalData(
                icono = null,
                texto = stringResource(R.string.iniciarsesion),
                onBotonClick = data.onBotonPrincipalClick,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(40.dp,20.dp)
        )

        TextButton(
            onClick = data.onTextoClick
        ) {
            Text(text = stringResource(R.string.recuperarpass))
        }

        OutlinedButton(
            onClick = data.onBotonSecundario,
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(width = 2.dp, color = MaterialTheme.colorScheme.primaryContainer),
            modifier = Modifier.fillMaxWidth()
                        .padding(40.dp,20.dp)
        ) {
            Text(
                text = stringResource(R.string.crearcuenta),
                color = MaterialTheme.colorScheme.primaryContainer,
                fontWeight = FontWeight.ExtraBold,
            )
        }

        var checked by remember { mutableStateOf(false) }

        Row() {
            Checkbox(checked = checked, onCheckedChange = {checked = it})
            Text(
                text = stringResource(R.string.terms)
            )
        }

        var promociones by remember { mutableStateOf("") }

        Column(
            modifier = Modifier.padding(8.dp,14.dp).selectableGroup()
        ) {

            Text(
                text = stringResource(R.string.escojerpublicidad),
                modifier = Modifier.padding(8.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = promociones == "Email",
                    onClick = { promociones = "Email" }
                )
                Text(text = stringResource(R.string.promocioncorreo))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = promociones == "Whatsapp",
                    onClick = { promociones = "Whatsapp" }
                )
                Text(text = stringResource(R.string.promocionwhatsapp))
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = promociones == "Nada",
                    onClick = { promociones = "Nada" }
                )
                Text(text = stringResource(R.string.promocionnada))
            }
        }


    }

}

@Preview(showBackground = true)
@Composable
fun PantallaRegistroPreview() {
    SaborExpressTheme() {
        PantallaRegistro(
            data = PantallaRegistroData(

                onBotonPrincipalClick = {},
                onTextoClick = {},
                onBotonSecundario = {}
            )
        )
    }
}