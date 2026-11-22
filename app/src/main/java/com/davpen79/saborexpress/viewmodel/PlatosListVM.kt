package com.davpen79.saborexpress.viewmodel

import androidx.lifecycle.ViewModel
import com.davpen79.saborexpress.model.PlatoModel
import com.davpen79.saborexpress.seeder.listaPlatos
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class PlatosListUiState(
    val localizacionTienda: String = "",
    val localizacionEnvio: String = "",
    val platosList: List<PlatoModel> = emptyList()
)



class PlatosListVM: ViewModel(){

    private val _uiState = MutableStateFlow(PlatosListUiState())
    val uiState: StateFlow<PlatosListUiState> = _uiState.asStateFlow()

    fun cargar(){
        _uiState.value = PlatosListUiState(
             platosList = listaPlatos
        )
    }

    fun onLocalizacionTiendaChange(direccionTienda: String){
        //Debe ser implementado mas adelante
        _uiState.value = PlatosListUiState(
            localizacionTienda = "Calle Mayor, 12"
        )
    }

    fun onLocalizacionEnvioChange(direccionEnvio: String){
        //Debe ser implementado mas adelante
        _uiState.value = PlatosListUiState(
            localizacionEnvio = "Gran Via, 4"
        )
    }

}