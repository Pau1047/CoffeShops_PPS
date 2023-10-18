package com.example.coffeshops_pps

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Opiniones(){
    Column {
        MyCardOp(getOpinions())
    }

}


@Composable
fun MyCardOp(Opinions: List<Opinions>) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),

        shape = MaterialTheme.shapes.medium
    ) {
        Column() {

            Text(text = Opinions.opinion,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp
            )
        }
    }
}
data class Opinions(
    var opinion: String
)
fun getOpinions(): List<Opinions>{
    return listOf(
        Opinions(
            "Servicio algo flojo, aún así lo recomiendo"
        ),
        Opinions(
            "Céntrica y acogedora. Volveremos seguro"
        ),
        Opinions(
            "Céntrica y acogedora. Volveremos seguro"
        ),
        Opinions(
            "La comida estaba deliciosa y bastante bien de precio, mucha variedad de platos.\n"
        ),
        Opinions(
            "El personal muy amable, nos permitieron ver todo el establecimiento.\n"
        ),
        Opinions(
            "Muy bueno"
        ),
        Opinions(
            "Excelente. Destacable la extensa carta de cafés"
        ),
        Opinions(
            "Buen ambiente y buen servicio. Lo recomiendo."
        ),
        Opinions(
            "En días festivos demasiado tiempo de espera. Los camareros/as no dan abasto. No lo recomiendo. No volveré"
        ),
        Opinions(
            "Repetiremos. Gran selección de tartas y cafés."
        ),
        Opinions(
            "Todo lo que he probado en la cafetería está riquísimo, dulce o salado.\n"
        ),
        Opinions(
            "La vajilla muy bonita todo de diseño que en el entorno del bar queda ideal.\n"
        ),
        Opinions(
            "Puntos negativos: el servicio es muy lento y los precios son un poco elevados."
        )
    )
}