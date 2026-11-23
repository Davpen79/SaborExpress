package com.davpen79.saborexpress.ui.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.davpen79.saborexpress.ui.page.PantallaDetalle
import com.davpen79.saborexpress.ui.page.PantallaRegistro
import com.davpen79.saborexpress.ui.page.PantallaSeleccionPlato
import kotlinx.serialization.Serializable

@Serializable
data object RutaSeleccionPlato

@Serializable
data class RutaDetallePlato(val id: Int)

@Serializable
data object RutaRegistro

@Composable
fun NavGraphComponent(
    myNavController: NavHostController,
    innerPadding: PaddingValues
) {

    NavHost(
        navController = myNavController,
        startDestination = RutaSeleccionPlato,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable<RutaSeleccionPlato> {
            PantallaSeleccionPlato(onCardClick = {
                myNavController.navigate(RutaDetallePlato(it))
            })
        }

        composable<RutaDetallePlato> {
            val rutaDetalle = it.toRoute<RutaDetallePlato>()
            PantallaDetalle(
                rutaDetalle.id,
                onGoBack = { myNavController.popBackStack() })
        }

        composable<RutaRegistro> {
            PantallaRegistro()
        }
    }

}