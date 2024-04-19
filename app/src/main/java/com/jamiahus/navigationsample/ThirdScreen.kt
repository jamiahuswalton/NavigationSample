package com.jamiahus.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ThirdScreen(navigateToFirstScreen: () -> Unit){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = { navigateToFirstScreen() }) {
            Text(text = "This is the Third Screen. Go to First Screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ThirdScreenPreview(){
    ThirdScreen {

    }
}