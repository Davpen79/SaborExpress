package com.davpen79.saborexpress

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.davpen79.saborexpress.seeder.PlatosSeeder
import com.davpen79.saborexpress.ui.page.PantallaDetalle
import com.davpen79.saborexpress.ui.page.PantallaDetalleData
import com.davpen79.saborexpress.ui.page.PantallaSeleccionPlato
import com.davpen79.saborexpress.ui.page.PantallaSeleccionPlatoData
import com.example.compose.AppTheme

//import com.davpen79.saborexpress.ui.theme.SaborExpressTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //PantallaSeleccionPlato(
                    //    data = PantallaSeleccionPlatoData(
                    //        localizacionEnvio = "Gran Via, 4",
                    //        localizacionTienda = "Calle Mayor, 12",
                    //        platosList = PlatosSeeder.obtenerListaPlatos()
                    //    ),
                    //    modifier = Modifier.padding(innerPadding)
                    //)
                    PantallaDetalle(
                        data = PantallaDetalleData(
                            imagenPlato = R.drawable.burguer3,
                            titulo = "HAMBURGUESA CON QUESO",
                            descripcion = "Sabrosa hamburguesa de ternera con queso cheddar y lechuga fresca",
                            tituloIngredientes = "INGREDIENTES",
                            ingredientes = listOf("Pan de hamburguesa", "Ternera", "Lechuga", "Queso cheddar",
                                "Pepinillo", "Cebolla", "Tomate", "Ketchup", "Mostaza"),
                            tituloCalorias = stringResource(R.string.titulocalorias),
                            caloriasValue = "453",
                            calorias = stringResource(R.string.calorias),
                            alergenos = "Gluten(Trigo), Lacteos(Leche). Puede contener trazas de soja.",
                            precio = "8",
                            moneda = R.string.simboloMoneda,
                            onIconoDerecho = {},
                            onIconoIzquierdo = {},
                            onBotonClick = {},
                            iconoBoton = R.drawable.carrito,
                            textoBoton = "Añadir al carrito"
                        ),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Android")
    }
}