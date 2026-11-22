package com.davpen79.saborexpress.model

import androidx.annotation.DrawableRes

data class PlatoModel(
    var id: Int,
    @DrawableRes val imagenPlato: Int,
    val nombrePlato: String,
    val descripcion: String,
    val precio: String,
    val moneda: Int,
    val onAnhadir: () -> Unit,
    val onVistazo: () -> Unit
)