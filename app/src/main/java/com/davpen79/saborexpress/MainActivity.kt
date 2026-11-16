package com.davpen79.saborexpress

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.davpen79.saborexpress.seeder.PlatosSeeder
import com.davpen79.saborexpress.ui.component.NavigationBar
import com.davpen79.saborexpress.ui.component.TopBar
import com.davpen79.saborexpress.ui.page.PantallaDetalle
import com.davpen79.saborexpress.ui.page.PantallaRegistro
import com.davpen79.saborexpress.ui.page.PantallaSeleccionPlato
import com.davpen79.saborexpress.viewmodel.PantallaDetalleVM
import com.example.compose.SaborExpressTheme
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SaborExpressTheme() {
                //guarda el estado del menu lateral
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                //drawerState.open() y drawerState.close() son funciones suspendidas y deben ejecutarse dentro de una corrutina
                val scope = rememberCoroutineScope()
                ModalNavigationDrawer(
                    drawerState = drawerState,
                    drawerContent = {
                        ModalDrawerSheet() {
                            Text("Menú", modifier = Modifier.padding(16.dp))
                            NavigationDrawerItem(
                                label = { Text("Detalles") },
                                selected = false,
                                onClick = {}
                            )
                            NavigationDrawerItem(
                                label = { Text("Seleccion de Plato") },
                                selected = false,
                                onClick = {}
                            )
                            NavigationDrawerItem(
                                label = { Text("Registro") },
                                selected = false,
                                onClick = {}
                            )
                        }
                    }
                ) {
                    Scaffold(
                        topBar = {
                            Column() {
                                Spacer(modifier = Modifier.height(24.dp))
                                TopBar(
                                    onUserClick = {},
                                    onMenuClick = {
                                        scope.launch { drawerState.open() }
                                    }
                                )
                            }
                        },
                        bottomBar = {
                            Column() {
                                NavigationBar(
                                    onLeftClick = {},
                                    onCenterClick = {},
                                    onRightClick = {}
                                )
                                Spacer(modifier = Modifier.height(20.dp))
                            }
                        },
                        modifier = Modifier.fillMaxSize()
                    ) { innerPadding ->
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