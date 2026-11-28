package com.davpen79.saborexpress.viewmodel

import androidx.lifecycle.ViewModel
import com.davpen79.saborexpress.model.MedioPublicidadEnum
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class PantallaRegistroUIState(

    val email: String = "",
    val emailError: String? = null,
    val password: String = "",
    val passwordError: String? = null,
    val aceptaCondiciones: Boolean = false,
    val medioPublicidad: MedioPublicidadEnum = MedioPublicidadEnum.NINGUNO,
    //Añadido temporalmente
    val comidasDisponibles: List<String> = listOf("Comida Mexicana","Comida Italiana","Comida Asiatica","Comida Rapida"),
    val comidaFavorita: String = "",
    val isFavoritoExpanded: Boolean = false
    )

class PantallaRegistroVM : ViewModel() {

    private val _uiState = MutableStateFlow(PantallaRegistroUIState())

    val uiState: StateFlow<PantallaRegistroUIState> = _uiState.asStateFlow()

    fun onEmailIntroducido(email: String) {
        //_uiState.value = _uiState.value.copy(emailError = null)
        _uiState.update {
            it.copy(email = email)
        }
        validateForm()
    }

    fun onPasswordIntroducida(password: String) {
        //_uiState.value = _uiState.value.copy(passwordError = null)
        _uiState.update {
            it.copy(password = password)
        }
        validateForm()
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

    private fun validateForm(){
        _uiState.value = _uiState.value.copy(emailError = null, passwordError = null)
        if (_uiState.value.email.isEmpty()){
            _uiState.value = _uiState.value.copy(emailError = "El email no puede estar vacio")
        }
        if (_uiState.value.password.isEmpty()){
            _uiState.value = _uiState.value.copy(passwordError = "La contraseña no puede estar vacia")
        }
    }
    //Añadido temporalmente
    fun onFavoritoExpandedChange(it: Boolean) {
        _uiState.value = _uiState.value.copy(isFavoritoExpanded = it)
    }

    fun onComidaFavoritaSeleccionada(comida: String) {
        _uiState.update {
            it.copy(
                comidaFavorita = comida,
                isFavoritoExpanded = false
            )
        }
    }
}
