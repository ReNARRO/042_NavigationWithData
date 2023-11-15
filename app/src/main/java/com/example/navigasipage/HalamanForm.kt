package com.example.navigasipage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HalamanForm(
    onNextButtonClicked: (MutableList<String>) -> Unit,
    onCancelButtonClicked: () -> Unit,
){
    var nama by rememberSaveable {
        mutableStateOf("")
    }
    var nohp by remember {
        mutableStateOf("")
    }
    var alamat by remember {
        mutableStateOf("")
    }

    var listData: MutableList<String> = mutableListOf(nama, nohp, alamat)

    Card() {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {

        }
    }
}