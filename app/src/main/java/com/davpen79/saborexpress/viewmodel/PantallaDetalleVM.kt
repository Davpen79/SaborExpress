package com.davpen79.saborexpress.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.ViewModel
import com.davpen79.saborexpress.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class PantallaDetalleUIState(
    val imagenPlato: Int = 0,
    val titulo: String = "",
    val descripcion: String = "",
    val tituloIngredientes: String = "",
    val ingredientes: List<String> = emptyList(),
    val tituloCalorias: String = "",
    val caloriasValue: String = "",
    val calorias: String = "",
    val alergenos: String = "",
    val precio: String = "",
    val moneda: Int = 0,
    val iconoBoton: Int = 0,
    val textoBoton: String = ""
)

class PantallaDetalleVM : ViewModel() {

    private val _uiState = MutableStateFlow(PantallaDetalleUIState(
        imagenPlato = R.drawable.burguer3,
        titulo = "HAMBURGUESA CON QUESO",
        descripcion = "Sabrosa hamburguesa de ternera con queso cheddar y lechuga fresca",
        tituloIngredientes = "Ingredientes",
        ingredientes = listOf("Pan de hamburguesa", "Ternera", "Lechuga", "Queso cheddar","Tomate","Cebolla"),
        tituloCalorias = "Calorias: ",
        caloriasValue = "435",
        calorias = "kilocalorias",
        alergenos = "Gluten(Trigo), Lacteos(Leche). Puede contener trazas de soja.",
        precio = "8",
        moneda = R.string.simboloMoneda,
        iconoBoton = R.drawable.carrito,
        textoBoton = "añadir al carrito"
    ))

    val uiState: StateFlow<PantallaDetalleUIState> = _uiState.asStateFlow()

    fun cargarPlato() {
        _uiState.update {
            it.copy(
                imagenPlato = R.drawable.burguer3,
                titulo = "HAMBURGUESA CON QUESO",
                descripcion = "Sabrosa hamburguesa de ternera con queso cheddar y lechuga fresca",
                tituloIngredientes = "Ingredientes",
                ingredientes = listOf("Pan de hamburguesa", "Ternera", "Lechuga", "Queso cheddar","Tomate","Cebolla"),
                tituloCalorias = "Calorias: ",
                caloriasValue = "435",
                calorias = "kilocalorias",
                alergenos = "Gluten(Trigo), Lacteos(Leche). Puede contener trazas de soja.",
                precio = "8",
                moneda = R.string.simboloMoneda,
                iconoBoton = R.drawable.carrito,
                textoBoton = "añadir al carrito"
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

