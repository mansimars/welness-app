package com.example.welness_app


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.welness_app.data.Info
import com.example.welness_app.data.infoList
import com.example.welness_app.ui.theme.WelnessappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Main()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview()
{
        Main()


}

@Composable
fun Header()
{
    Column(modifier = Modifier
        .background(MaterialTheme.colors.secondary)
        .fillMaxWidth()
        .wrapContentSize()
        ) {

        Text(text = "Health and Wellness",
            color = Color.White,
            style = MaterialTheme.typography.h1,
            modifier = Modifier.padding(start = 10.dp, top = 5.dp))
    }
}

@Composable
fun Main()
{
    WelnessappTheme() {
        Scaffold(topBar = { Header()}) {
            Surface() {
                LazyColumn(modifier = Modifier.background(MaterialTheme.colors.background)){
                    items(infoList){
                        GetCard(infoList=it)
                    }

                }

            }
        }

    }
}

@Composable
fun GetCard(infoList: Info, modifier: Modifier= Modifier)
{

    var expandable by remember { mutableStateOf(false)}

    Card(elevation = 10.dp,
        backgroundColor = MaterialTheme.colors.surface,
        modifier = Modifier.padding(10.dp),
//            .border(1.dp, Color.Black, shape = RoundedCornerShape(10)),
        shape = RoundedCornerShape(5),
        ) {

        Column(modifier = Modifier
            .clickable { expandable = !expandable }
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioMediumBouncy,
                    stiffness = Spring.StiffnessVeryLow
                )
            ) ) {
            GetDay(infoList.dayID, expanded = expandable,{expandable = !expandable})
            GetText(infoList.textID)
            GetImage(infoList.imageID)
            if(expandable)
                GetDescription(infoList.descID)
        }

    }
}

@Composable
fun GetDay(dayID: String, expanded: Boolean, onClick: () -> Unit)
{
    Row() {
        Text(text = dayID,
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.h2,
            modifier = Modifier.padding(start = 10.dp, top = 5.dp))

        Spacer(modifier = Modifier.weight(1f))
        IconButton(onClick = onClick) {
            Icon(
                imageVector = if (expanded) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore ,
                tint = MaterialTheme.colors.onSurface,
                contentDescription = "Expand Content"
            )
        }
    }

}

@Composable
fun GetText(textID: Int)
{
    Text(text = stringResource(id = textID),
        color = MaterialTheme.colors.onSurface,
        style = MaterialTheme.typography.body1,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(start = 10.dp)
    )

}

@Composable
fun GetImage(imageID: Int)
{
    Image(contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .shadow(3.dp)
            ,

        painter = painterResource(id = imageID),
        contentDescription = null)
}

@Composable
fun GetDescription(descID: Int)
{

        Text(text = stringResource(id = descID),
            color = MaterialTheme.colors.onSurface,
            style = MaterialTheme.typography.body1,
            modifier = Modifier.padding(start = 10.dp, bottom = 20.dp)
        )

}