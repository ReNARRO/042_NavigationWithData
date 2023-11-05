package com.example.navigasipage.ui.komponen

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.navigasipage.R

@Composable
fun FormatTabelHarga(subtotal: String, modifier: Modifier){
    Text(
        text = stringResource(R.string.subtotal_price, subtotal),
        modifier = Modifier,
        style = MaterialTheme.typography.headlineSmall
    )
}