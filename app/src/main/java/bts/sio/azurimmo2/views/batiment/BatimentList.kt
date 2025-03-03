package bts.sio.azurimmo2.views

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import bts.sio.azurimmo2.viewsmodel.batiment.BatimentViewModel

@Composable
fun BatimentList(viewModel: BatimentViewModel = viewModel()) {
    // Observer les données de manière réactive
    val batiments by viewModel.batiments.collectAsState()

    LazyColumn(
        modifier = Modifier.padding(8.dp)
    ) {
        items(batiments) { batiment ->
            BatimentCard(batiment = batiment)
        }
    }
}