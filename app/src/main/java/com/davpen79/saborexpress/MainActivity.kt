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
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.davpen79.saborexpress.ui.component.NavGraphComponent
import com.davpen79.saborexpress.ui.component.NavigationBar
import com.davpen79.saborexpress.ui.component.RutaRegistro
import com.davpen79.saborexpress.ui.component.RutaSeleccionPlato
import com.davpen79.saborexpress.ui.component.TopBar
import com.example.compose.SaborExpressTheme
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val myNavController = rememberNavController()

            val sbHostState = remember { SnackbarHostState() }
            val scope = rememberCoroutineScope()

            SaborExpressTheme() {
                //guarda el estado del menu lateral
                val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
                //drawerState.open() y drawerState.close() son funciones suspendidas y deben ejecutarse dentro de una corrutina
                //val scope = rememberCoroutineScope()
                ModalNavigationDrawer(
                    drawerState = drawerState,
                    drawerContent = {
                        ModalDrawerSheet() {
                            Text("Menú", modifier = Modifier.padding(16.dp))

                            NavigationDrawerItem(
                                label = { Text("Seleccion de Plato") },
                                selected = false,
                                onClick = { myNavController.navigate(RutaSeleccionPlato) }
                            )
                            NavigationDrawerItem(
                                label = { Text("Registro") },
                                selected = false,
                                onClick = { myNavController.navigate(RutaRegistro) }
                            )
                        }
                    }
                ) {
                    Scaffold(

                        topBar = {
                            Column() {
                                Spacer(modifier = Modifier.height(24.dp))
                                TopBar(
                                    onUserClick = { myNavController.navigate(RutaRegistro) },
                                    onMenuClick = {
                                        scope.launch { drawerState.open() }
                                    }
                                )
                            }
                        },

                        bottomBar = {
                            Column() {
                                NavigationBar(
                                    onLeftClick = {
                                        scope.launch {
                                            sbHostState.showSnackbar(getString(R.string.pantalla_no_implementada))
                                        }
                                    },
                                    onCenterClick = { myNavController.navigate(RutaSeleccionPlato) },
                                    onRightClick = { myNavController.navigate(RutaRegistro) }
                                )
                                Spacer(modifier = Modifier.height(20.dp))
                            }
                        },

                        snackbarHost = {
                            SnackbarHost(sbHostState)
                        },

                        modifier = Modifier.fillMaxSize()

                    ) { innerPadding ->

                        NavGraphComponent(myNavController, innerPadding)
                    }
                }
            }
        }
    }
}
