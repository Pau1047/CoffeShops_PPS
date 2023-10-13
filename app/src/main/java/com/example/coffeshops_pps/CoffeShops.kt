package com.example.coffeshops_pps

import android.widget.RatingBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.lang.Math.ceil
import java.lang.Math.floor


@Composable
fun CoffeShops (){

   LazyColumn {
    items(getInfoCoffes()) { InfoCoffe ->
         MyCard(InfoCoffe)
    }
   }

}



@Composable
fun MyCard(InfoCoffe: InfoCoffe) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),

        shape = MaterialTheme.shapes.medium
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            Image(painter = painterResource(id = InfoCoffe.images), contentDescription = "Imatge",
                modifier = Modifier.size(65.dp))
            Text(text = InfoCoffe.titles)

            RatingBar()

            Text(text = InfoCoffe.directions)

            Divider()

            Button(onClick = { /*TODO*/ }) {
                Text(text = "RESERVE")
            }

        }
    }
}

@Composable
fun RatingBar(
    modifier: Modifier = Modifier,
    rating: Double = 0.0,
    starsColor: Color = Color.Yellow,
) {
    val filledStars = floor(rating).toInt()

    Row(modifier = modifier) {
        repeat(filledStars) {
            Icon(imageVector = Icons.Outlined.Star,
                contentDescription = null, tint = starsColor)
        }

    }
}