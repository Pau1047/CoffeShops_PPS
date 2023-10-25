package com.example.coffeshops_pps

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Opiniones(navControllerName: String, navController: NavHostController){
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val nameCoffe = navBackStackEntry?.arguments?.getString("nameCoffe") ?: ""

    val getOpinions =  listOf<String>("Servicio algo flojo, aún así lo recomiendo","Céntrica y acogedora. Volveremos seguro", "Céntrica y acogedora. Volveremos seguro", "La comida estaba deliciosa y bastante bien de precio, mucha variedad de platos.\n", "El personal muy amable, nos permitieron ver todo el establecimiento.\n", "Muy bueno",
        "Excelente. Destacable la extensa carta de cafés", "Buen ambiente y buen servicio. Lo recomiendo.", "En días festivos demasiado tiempo de espera. Los camareros/as no dan abasto. No lo recomiendo. No volveré", "Repetiremos. Gran selección de tartas y cafés.", "Todo lo que he probado en la cafetería está riquísimo, dulce o salado.\n",
        "La vajilla muy bonita todo de diseño que en el entorno del bar queda ideal.\n", "Puntos negativos: el servicio es muy lento y los precios son un poco elevados.")


    Scaffold(topBar = { MyTopAppBar() }) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = it.calculateTopPadding())
        ) {

            LazyColumn {
                items(getOpinions) { info ->
                    MyCardOp(info)
                }
            }
        }
    }
}

@Composable
fun MyCardOp(getopinion: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),

        shape = MaterialTheme.shapes.medium
    ) {
        Column() {
            Text(text = getopinion)
        }
    }
}
