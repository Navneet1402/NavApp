package com.example.navapp.screens

//import android.graphics.drawable.Icon
//import android.window.SplashScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navapp.ui.theme.NavAppTheme

@Composable
fun SplashScreen(
    onContinueClick: () -> Unit = {},
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primaryContainer)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Text(text = "My Splash Screen", style = MaterialTheme.typography.displaySmall)
        IconButton(onClick =  onContinueClick ) {
            Text(text = "Continue", style = MaterialTheme.typography.bodySmall)
            Spacer(modifier = Modifier.height(100.dp))
            FilledIconButton(onClick = onContinueClick ) {
                Icon(imageVector = Icons.Default.ArrowForward, contentDescription ="Next" )

            }

        }

    }


}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    NavAppTheme {
        SplashScreen()
    }

}