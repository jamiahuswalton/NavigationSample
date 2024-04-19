package com.jamiahus.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(name: String, navigateToFirstScreen: (String) -> Unit, navigateToThirdScreen: () -> Unit){

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(text = "This is the Second Screen", fontSize = 24.sp)

        Text(text = "Welcome, $name", fontSize = 24.sp)

        Button(onClick = {
            navigateToFirstScreen(name)
        }) {
            Text(text = "Go to First Screen")
        }

        Button(onClick = {
            navigateToThirdScreen()
        }) {
            Text(text = "Go to Third Screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondPreview(){
    SecondScreen("Big Fella", {},{})
}