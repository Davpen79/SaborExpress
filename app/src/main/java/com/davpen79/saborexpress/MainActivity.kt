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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.davpen79.saborexpress.seeder.PlatosSeeder
import com.davpen79.saborexpress.ui.page.PantallaDetalle
import com.davpen79.saborexpress.ui.page.PantallaRegistro
import com.davpen79.saborexpress.ui.page.PantallaSeleccionPlato
import com.davpen79.saborexpress.viewmodel.PantallaDetalleVM
import com.example.compose.SaborExpressTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SaborExpressTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    //PantallaSeleccionPlato(
                    //    data = PantallaSeleccionPlatoData(
                    //        localizacionEnvio = "Gran Via, 4",
                    //        localizacionTienda = "Calle Mayor, 12",
                    //        platosList = PlatosSeeder.obtenerListaPlatos()
                    //    ),
                    //    modifier = Modifier.padding(innerPadding)
                    //)
                    PantallaRegistro(
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
    SaborExpressTheme() {
        Greeting("Android")
    }
}