package app.bidar.diceroller

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import app.bidar.diceroller.ui.theme.DiceRollerTheme


// this is branch debug
// this is branch debug and test commit 2
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiceRollerTheme {
                DiceRollerApp()
            }
        }
    }
}

@Preview
@Composable
fun DiceRollerApp() {
    DiceWithButtonAndImage(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}





@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {

    var result by remember { mutableStateOf(1)}
    Log.i("reza", "num1: $result")
    var tempResult = result.toInt() // just for debug

    val imageResource = when (result) { // run in debug tempResult.equals(6)
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(imageResource), contentDescription = result.toString())
        Spacer(modifier = Modifier.height(16.dp))
        Log.i("reza", "num2: $result")
        Button(onClick = { result = (1..6).random() }) {
            Text(text = result.toString(), fontSize = 24.sp)
            Log.i("reza", "num3: $result")
        }
    }
}









/*var result: Int = 1



@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
    val imageResource = when(result) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }


    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(imageResource), contentDescription = result.toString())
        Log.i("reza", result.toString())
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { result = (1..6).random()
        Log.i("reza" , "onClick= $result")}) {
            Text(text = result.toString(), fontSize = 24.sp)
        }
    }
}*/

/*
@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {

    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(R.drawable.dice_1), contentDescription = null)
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {



            var result: Int = (1..6).random()
            val imageResource = when(result) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            }) {
            Text(text = stringResource(R.string.roll), fontSize = 24.sp)
        }
    }
}*/
