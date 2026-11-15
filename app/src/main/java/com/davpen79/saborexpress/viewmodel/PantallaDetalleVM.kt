package com.davpen79.saborexpress.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import com.davpen79.saborexpress.R
import com.davpen79.saborexpress.model.Comida
import com.davpen79.saborexpress.seeder.ComidasSeeder
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class PantallaDetalleUIState(
    val comida: Comida
)

class PantallaDetalleVM : ViewModel() {

    private val _uiState = MutableStateFlow(PantallaDetalleUIState(
        comida = ComidasSeeder.obtenerListaComidas()[0]
    ))

    val uiState: StateFlow<PantallaDetalleUIState> = _uiState.asStateFlow()

    fun cargarComida(comida: Comida) {
        _uiState.update {
            it.copy(
                comida = comida
            )
        }
    }

    fun onIconoIzquierdoClick() {

    }

    fun onIconoDerechoClick() {

    }

    fun onBotonClick() {

    }

}

