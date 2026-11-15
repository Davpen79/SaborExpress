package com.davpen79.saborexpress.model

data class Comida(
    val imagenPlato: Int,
    val titulo: String,
    val descripcion: String,
    val ingredientes: List<String>,
    val caloriasValue: String,
    val calorias: String,
    val alergenos: String,
    val precio: String,
    //val moneda: Int,
    //val iconoBoton: Int,
    //val textoBoton: String
)