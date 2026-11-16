package com.davpen79.saborexpress.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davpen79.saborexpress.R
import com.example.compose.SaborExpressTheme

@Composable
fun NavigationBar(
    modifier: Modifier = Modifier,
    onLeftClick: () -> Unit,
    onCenterClick: () -> Unit,
    onRightClick: () -> Unit
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp,0.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {

        IconButton(
            onClick = onLeftClick,
            modifier = Modifier.weight(1f)
        )
        {
            Icon(
                painter = painterResource(R.drawable.carrito2),
                contentDescription = stringResource(R.string.carrito),
                modifier = Modifier.size(28.dp)
            )
        }

        VerticalDivider(
            modifier = Modifier.height(30.dp),
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.outline
        )

        IconButton(
            onClick = onCenterClick,
            modifier = Modifier.weight(1f)
        )
        {
            Icon(
                painter = painterResource(R.drawable.home),
                contentDescription = stringResource(R.string.home),
                modifier = Modifier.size(28.dp)
            )
        }

        VerticalDivider(
            modifier = Modifier.height(30.dp),
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.outline
        )

        IconButton(
            onClick = onRightClick,
            modifier = Modifier.weight(1f)
        ) {
            Icon(
                painter = painterResource(R.drawable.outline_person_outline_24),
                contentDescription = stringResource(R.string.usericon),
                modifier = Modifier.size(28.dp)
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun NavigationBarPreview(){
    SaborExpressTheme() {
        NavigationBar(
            onLeftClick = {},
            onCenterClick = {},
            onRightClick = {}
        )
    }
}