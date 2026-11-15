package com.davpen79.saborexpress.viewmodel

import androidx.lifecycle.ViewModel
import com.davpen79.saborexpress.seeder.PlatosSeeder
import com.davpen79.saborexpress.ui.component.TarjetaPlatoData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class PantallaSeleccionPlatoUiState(
    val localizacionTienda: String = "",
    val localizacionEnvio: String = "",
    val platosList: List<TarjetaPlatoData> = emptyList()
)

class PantallaSeleccionPlatoVM : ViewModel() {

    private val _uiState = MutableStateFlow(
        PantallaSeleccionPlatoUiState(
            localizacionTienda = "Calle Mayor 12, Vigo",
            localizacionEnvio = "Avenida García Barbón 25, Vigo",
            platosList = PlatosSeeder.obtenerListaPlatos()
        )
    )

    val uiState: StateFlow<PantallaSeleccionPlatoUiState> =
        _uiState.asStateFlow()

}