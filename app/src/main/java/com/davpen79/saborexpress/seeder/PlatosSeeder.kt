package com.davpen79.saborexpress.seeder

import com.davpen79.saborexpress.R
import com.davpen79.saborexpress.ui.component.TarjetaPlatoData


object PlatosSeeder {
    fun obtenerListaPlatos(): List<TarjetaPlatoData> {

        return listOf(

            TarjetaPlatoData(
                imagenPlato = R.drawable.paella_tarjeta,
                nombrePlato = "Paella valenciana",
                descripcion = "Arroz con pollo, conejo y verduras.",
                precio = "14.50",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            ),

            TarjetaPlatoData(
                imagenPlato = R.drawable.burguer_tarjeta,
                nombrePlato = "Hamburguesa clásica",
                descripcion = "Ternera, lechuga, tomate y queso.",
                precio = "9.90",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            ),

            TarjetaPlatoData(
                imagenPlato = R.drawable.pizza_tarjeta,
                nombrePlato = "Pizza margarita",
                descripcion = "Tomate natural, mozzarella y albahaca.",
                precio = "11.00",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            ),

            TarjetaPlatoData(
                imagenPlato = R.drawable.lasagna_tarjeta,
                nombrePlato = "Lasaña boloñesa",
                descripcion = "Pasta fresca, carne y bechamel.",
                precio = "12.50",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            ),

            TarjetaPlatoData(
                imagenPlato = R.drawable.ensalada_tarjeta,
                nombrePlato = "Ensalada mediterránea",
                descripcion = "Tomate, aceitunas, queso y lechuga.",
                precio = "8.50",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            ),

            TarjetaPlatoData(
                imagenPlato = R.drawable.spaghetti_tarjeta,
                nombrePlato = "Espaguetis carbonara",
                descripcion = "Pasta con nata, bacon y parmesano.",
                precio = "10.50",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            ),

            TarjetaPlatoData(
                imagenPlato = R.drawable.sushi_tarjeta,
                nombrePlato = "Sushi variado",
                descripcion = "Selección de makis y nigiris.",
                precio = "16.00",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            ),

            TarjetaPlatoData(
                imagenPlato = R.drawable.tacos_tarjeta,
                nombrePlato = "Tacos mexicanos",
                descripcion = "Tortillas de maíz con carne y verduras.",
                precio = "9.50",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            ),

            TarjetaPlatoData(
                imagenPlato = R.drawable.polloasado_tarjeta,
                nombrePlato = "Pollo asado",
                descripcion = "Pollo al horno con patatas.",
                precio = "13.00",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            ),

            TarjetaPlatoData(
                imagenPlato = R.drawable.salmon_tarjeta,
                nombrePlato = "Salmón a la plancha",
                descripcion = "Salmón con verduras salteadas.",
                precio = "15.50",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            ),

            TarjetaPlatoData(
                imagenPlato = R.drawable.croquetas_tarjeta,
                nombrePlato = "Croquetas caseras",
                descripcion = "Croquetas de jamón ibérico.",
                precio = "7.50",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            ),

            TarjetaPlatoData(
                imagenPlato = R.drawable.tarta_tarjeta,
                nombrePlato = "Tarta de queso",
                descripcion = "Tarta cremosa de queso al horno.",
                precio = "6.00",
                moneda = R.string.simboloMoneda,
                onAnhadir = {},
                onVistazo = {}
            )
        )


    }
}