package com.davpen79.saborexpress.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.davpen79.saborexpress.R
import com.example.compose.SaborExpressTheme

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    onMenuClick: () -> Unit,
    onUserClick: () -> Unit
) {

    Row(
        modifier = Modifier.fillMaxWidth().padding(10.dp,0.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        IconButton(
            onClick = onMenuClick,
            modifier = Modifier
        )
        {
            Icon(
                painter = painterResource(R.drawable.outline_menu_24),
                contentDescription = stringResource(R.string.descripmenuicon),
                modifier = Modifier.size(28.dp)
            )
        }

        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = stringResource(R.string.logoempresa),
            modifier = Modifier.size(width = 100.dp, height = 60.dp),
            contentScale = ContentScale.Fit
        )

        IconButton(
            onClick = onUserClick,
            modifier = modifier
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
fun TopBarPreview(){
    SaborExpressTheme() {
        TopBar(
            onMenuClick = {},
            onUserClick = {}
        )
    }
}