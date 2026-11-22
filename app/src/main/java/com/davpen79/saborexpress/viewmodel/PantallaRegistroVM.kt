package com.davpen79.saborexpress.viewmodel

import androidx.lifecycle.ViewModel
import com.davpen79.saborexpress.model.MedioPublicidadEnum
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class PantallaRegistroUIState(

    val email: String = "",
    val password: String = "",
    val aceptaCondiciones: Boolean = false,
    val medioPublicidad: MedioPublicidadEnum = MedioPublicidadEnum.NINGUNO,

    )

class PantallaRegistroVM : ViewModel() {

    private val _uiState = MutableStateFlow(PantallaRegistroUIState())

    val uiState: StateFlow<PantallaRegistroUIState> = _uiState.asStateFlow()

    fun onEmailIntroducido(email: String) {
        _uiState.update {
            it.copy(email = email)
        }
    }

    fun onPasswordIntroducida(password: String) {
        _uiState.update {
            it.copy(password = password)
        }
    }

    fun onCondicionesAceptadas(aceptaCondiciones: Boolean) {
        _uiState.update {
            it.copy(aceptaCondiciones = aceptaCondiciones)
        }
    }

    fun onMedioPublicidad(medioPublicidad: MedioPublicidadEnum) {
        _uiState.update {
            it.copy(medioPublicidad = medioPublicidad)
        }
    }

    fun onIniciarSesionClick() {

    }

    fun onRegistrarUsuarioClick() {

    }

    fun onRecuperarPasswordClick() {

    }
}
