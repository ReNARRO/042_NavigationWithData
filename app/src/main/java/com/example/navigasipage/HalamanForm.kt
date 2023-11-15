package com.example.navigasipage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HalamanForm(
    onSubmitButtonClicked: (MutableList<String>) -> Unit,
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
            Text(
                text = "Data Pelanggan",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Column {
            OutlinedTextField(
                value = nama,
                onValueChange ={nama = it},
                label = { Text(stringResource(R.string.nama))},
                singleLine = true,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.fillMaxWidth(),
                placeholder = { Text(text = "Prab")}
            )
            OutlinedTextField(
                value = nohp,
                onValueChange ={nohp = it},
                label = { Text(stringResource(R.string.nohp))},
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.fillMaxWidth(),
            )
            OutlinedTextField(
                value = alamat,
                onValueChange ={alamat = it},
                label = { Text(stringResource(R.string.alamat))},
                singleLine = true,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.fillMaxWidth(),
            )
            Spacer(modifier = Modifier.padding(16.dp))
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Button(onClick = onCancelButtonClicked) {
                    Text(stringResource(id = R.string.cancel))
                }
                Button(onClick = { onSubmitButtonClicked(listData) }, enabled = nama.isNotEmpty()) {
                    Text(stringResource(id = R.string.btn_submit))
                }
            }
        }
    }
}