package com.davpen79.saborexpress.viewmodel

import androidx.lifecycle.ViewModel
import com.davpen79.saborexpress.model.PlatoModel
import com.davpen79.saborexpress.seeder.listaPlatos
import com.davpen79.saborexpress.seeder.searchPlatosByName
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class PlatosListUiState(
    val localizacionTienda: String = "",
    val localizacionEnvio: String = "",
    val searchText: String = "",
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
        _uiState.value = _uiState.value.copy(
            localizacionTienda = "Calle Mayor, 12"
        )
    }

    fun onLocalizacionEnvioChange(direccionEnvio: String){
        //Debe ser implementado mas adelante
        _uiState.value = _uiState.value.copy(
            localizacionEnvio = "Gran Via, 4"
        )
    }

    fun onSearchTextChange(newTxt: String){

        var platosEncontrados = searchPlatosByName(newTxt)
        //Atencion:Utilizar copy() para modificar únicamente las propiedades necesarias.
        // en vez de PlatosListUIState
        _uiState.value = _uiState.value.copy(
            platosList = platosEncontrados,
            searchText = newTxt
        )
    }
}
