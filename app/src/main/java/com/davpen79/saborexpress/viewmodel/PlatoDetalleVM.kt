package com.davpen79.saborexpress.viewmodel

import androidx.lifecycle.ViewModel
import com.davpen79.saborexpress.model.ComidaModel
import com.davpen79.saborexpress.seeder.getById
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class PlatoDetalleUIState(
    val comida: ComidaModel? = null
)

class PlatoDetalleVM : ViewModel(){

    private val _uiState = MutableStateFlow(PlatoDetalleUIState())
    val uiState: StateFlow<PlatoDetalleUIState> = _uiState.asStateFlow()

    fun cargar(id: Int){

        _uiState.value = PlatoDetalleUIState(
            comida = getById(id)
        )

    }

    fun onIconoIzquierdoClick() {

    }

    fun onIconoDerechoClick() {

    }

    fun onBotonClick() {

    }
}
