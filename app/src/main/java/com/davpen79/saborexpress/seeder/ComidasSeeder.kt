package com.davpen79.saborexpress.seeder

import com.davpen79.saborexpress.R
import com.davpen79.saborexpress.model.Comida


object ComidasSeeder {

    fun obtenerListaComidas(): List<Comida> {

        return listOf(

            Comida(
            imagenPlato = R.drawable.burguer3,
            titulo = "HAMBURGUESA CON QUESO",
            descripcion = "Sabrosa hamburguesa de ternera con queso cheddar y lechuga fresca",
            ingredientes = listOf(
                "Pan de hamburguesa",
                "Ternera",
                "Lechuga",
                "Queso cheddar"
            ),
            caloriasValue = "435",
            calorias = "kcal",
            alergenos = "Gluten (Trigo), Lácteos (Leche). Puede contener trazas de soja.",
            precio = "8",
            //moneda = R.string.simboloMoneda,
            //iconoBoton = R.drawable.carrito,
            //textoBoton = R.string.anhadiralcarrito
            ),

                    // CROQUETAS
            Comida(
                imagenPlato = R.drawable.croquetas_tarjeta,
                titulo = "CROQUETAS CASERAS",
                descripcion = "Deliciosas croquetas caseras de jamón ibérico, crujientes por fuera y cremosas por dentro.",
                ingredientes = listOf(
                    "Jamón ibérico",
                    "Leche",
                    "Harina de trigo",
                    "Mantequilla",
                    "Huevo",
                    "Pan rallado",
                    "Aceite de oliva"
                ),
                caloriasValue = "320",
                calorias = "kcal",
                alergenos = "Gluten (Trigo), Lácteos (Leche, Mantequilla), Huevo.",
                precio = "7.50",
                //moneda = R.string.simboloMoneda,
                //iconoBoton = R.drawable.carrito,
                //textoBoton = "Añadir al carrito"
            ),

            // ENSALADA
            Comida(
                imagenPlato = R.drawable.ensalada_tarjeta,
                titulo = "ENSALADA MEDITERRÁNEA",
                descripcion = "Fresca ensalada mediterránea elaborada con verduras frescas, aceitunas y queso.",
                ingredientes = listOf(
                    "Lechuga",
                    "Tomate",
                    "Aceitunas negras",
                    "Queso feta",
                    "Pepino",
                    "Cebolla morada",
                    "Aceite de oliva",
                    "Vinagre"
                ),
                caloriasValue = "210",
                calorias = "kcal",
                alergenos = "Lácteos (Queso feta).",
                precio = "8.50",
                //moneda = R.string.simboloMoneda,
                //iconoBoton = R.drawable.carrito,
                //textoBoton = "Añadir al carrito"
            ),

            // LASAÑA
            Comida(
                imagenPlato = R.drawable.lasagna_tarjeta,
                titulo = "LASAÑA BOLOÑESA",
                descripcion = "Tradicional lasaña italiana con capas de pasta fresca, carne picada, salsa de tomate y bechamel.",
                ingredientes = listOf(
                    "Pasta de trigo",
                    "Carne picada de ternera",
                    "Tomate natural",
                    "Cebolla",
                    "Zanahoria",
                    "Leche",
                    "Harina de trigo",
                    "Mantequilla",
                    "Queso parmesano"
                ),
                caloriasValue = "520",
                calorias = "kcal",
                alergenos = "Gluten (Trigo), Lácteos (Leche, Queso, Mantequilla).",
                precio = "12.50",
                //moneda = R.string.simboloMoneda,
                //iconoBoton = R.drawable.carrito,
                //textoBoton = "Añadir al carrito"
            ),

            // PAELLA
            Comida(
                imagenPlato = R.drawable.paella_tarjeta,
                titulo = "PAELLA VALENCIANA",
                descripcion = "Auténtica paella valenciana preparada con arroz, pollo, conejo y verduras frescas.",
                ingredientes = listOf(
                    "Arroz",
                    "Pollo",
                    "Conejo",
                    "Judías verdes",
                    "Garrofón",
                    "Tomate",
                    "Aceite de oliva",
                    "Azafrán",
                    "Romero"
                ),
                caloriasValue = "480",
                calorias = "kcal",
                alergenos = "Puede contener trazas de apio según la preparación.",
                precio = "14.50",
                //moneda = R.string.simboloMoneda,
                //iconoBoton = R.drawable.carrito,
                //textoBoton = "Añadir al carrito"
            ),

            // PIZZA
            Comida(
                imagenPlato = R.drawable.pizza_tarjeta,
                titulo = "PIZZA MARGARITA",
                descripcion = "Clásica pizza italiana con base de masa artesanal, tomate natural, mozzarella y albahaca fresca.",
                ingredientes = listOf(
                    "Harina de trigo",
                    "Tomate natural",
                    "Mozzarella",
                    "Albahaca fresca",
                    "Aceite de oliva",
                    "Levadura",
                    "Sal"
                ),
                caloriasValue = "650",
                calorias = "kcal",
                alergenos = "Gluten (Trigo), Lácteos (Mozzarella).",
                precio = "11.00",
                //moneda = R.string.simboloMoneda,
                //iconoBoton = R.drawable.carrito,
                //textoBoton = "Añadir al carrito"
            ),

            // POLLO ASADO
            Comida(
                imagenPlato = R.drawable.polloasado_tarjeta,
                titulo = "POLLO ASADO",
                descripcion = "Jugoso pollo asado al horno con hierbas aromáticas y acompañado de patatas doradas.",
                ingredientes = listOf(
                    "Pollo",
                    "Patatas",
                    "Ajo",
                    "Limón",
                    "Aceite de oliva",
                    "Romero",
                    "Tomillo",
                    "Sal",
                    "Pimienta"
                ),
                caloriasValue = "430",
                calorias = "kcal",
                alergenos = "No contiene alérgenos de declaración obligatoria entre los ingredientes indicados. Revisar posibles trazas.",
                precio = "13.00",
                //moneda = R.string.simboloMoneda,
                //iconoBoton = R.drawable.carrito,
                //textoBoton = "Añadir al carrito"
            ),

            // SALMÓN
            Comida(
                imagenPlato = R.drawable.salmon_tarjeta,
                titulo = "SALMÓN A LA PLANCHA",
                descripcion = "Lomo de salmón fresco cocinado a la plancha, acompañado de verduras salteadas.",
                ingredientes = listOf(
                    "Salmón",
                    "Calabacín",
                    "Zanahoria",
                    "Espárragos",
                    "Aceite de oliva",
                    "Limón",
                    "Ajo",
                    "Sal",
                    "Pimienta"
                ),
                caloriasValue = "390",
                calorias = "kcal",
                alergenos = "Pescado (Salmón).",
                precio = "15.50",
                //moneda = R.string.simboloMoneda,
                //iconoBoton = R.drawable.carrito,
                //textoBoton = "Añadir al carrito"
            ),

            // ESPAGUETIS
            Comida(
                imagenPlato = R.drawable.spaghetti_tarjeta,
                titulo = "ESPAGUETIS CARBONARA",
                descripcion = "Espaguetis preparados con una cremosa salsa carbonara, bacon y queso parmesano.",
                ingredientes = listOf(
                    "Espaguetis de trigo",
                    "Bacon",
                    "Huevo",
                    "Queso parmesano",
                    "Pimienta negra",
                    "Aceite de oliva"
                ),
                caloriasValue = "560",
                calorias = "kcal",
                alergenos = "Gluten (Trigo), Huevo, Lácteos (Queso).",
                precio = "10.50",
                //moneda = R.string.simboloMoneda,
                //iconoBoton = R.drawable.carrito,
                //textoBoton = "Añadir al carrito"
            ),

            // SUSHI
            Comida(
                imagenPlato = R.drawable.sushi_tarjeta,
                titulo = "SUSHI VARIADO",
                descripcion = "Selección japonesa de makis y nigiris preparados con arroz y pescado fresco.",
                ingredientes = listOf(
                    "Arroz para sushi",
                    "Salmón",
                    "Atún",
                    "Alga nori",
                    "Aguacate",
                    "Vinagre de arroz",
                    "Azúcar",
                    "Salsa de soja"
                ),
                caloriasValue = "450",
                calorias = "kcal",
                alergenos = "Pescado (Salmón, Atún), Soja. Puede contener gluten.",
                precio = "16.00",
                //moneda = R.string.simboloMoneda,
                //iconoBoton = R.drawable.carrito,
                //textoBoton = "Añadir al carrito"
            ),

            // TACOS
            Comida(
                imagenPlato = R.drawable.tacos_tarjeta,
                titulo = "TACOS MEXICANOS",
                descripcion = "Tortillas de maíz rellenas de carne especiada, verduras frescas y salsa mexicana.",
                ingredientes = listOf(
                    "Tortillas de maíz",
                    "Carne de ternera",
                    "Tomate",
                    "Cebolla",
                    "Lechuga",
                    "Aguacate",
                    "Cilantro",
                    "Lima",
                    "Especias"
                ),
                caloriasValue = "380",
                calorias = "kcal",
                alergenos = "Revisar posibles trazas según las tortillas y salsas utilizadas.",
                precio = "9.50",
                //moneda = R.string.simboloMoneda,
                //iconoBoton = R.drawable.carrito,
                //textoBoton = "Añadir al carrito"
            ),

            // TARTA DE FRESA
            Comida(
                imagenPlato = R.drawable.tarta_tarjeta,
                titulo = "TARTA DE FRESA",
                descripcion = "Deliciosa tarta casera con base de bizcocho, crema suave y fresas naturales.",
                ingredientes = listOf(
                    "Fresas naturales",
                    "Harina de trigo",
                    "Huevo",
                    "Leche",
                    "Azúcar",
                    "Mantequilla",
                    "Nata",
                    "Levadura"
                ),
                caloriasValue = "390",
                calorias = "kcal",
                alergenos = "Gluten (Trigo), Huevo, Lácteos (Leche, Mantequilla, Nata).",
                precio = "6.50",
                //moneda = R.string.simboloMoneda,
                //iconoBoton = R.drawable.carrito,
                //textoBoton = "Añadir al carrito"
            )

        )
    }
}
