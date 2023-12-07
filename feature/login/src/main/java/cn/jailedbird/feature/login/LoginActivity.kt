package cn.jailedbird.feature.login

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cn.jailedbird.core.common.utils.log
import cn.jailedbird.core.common.utils.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        "zjc".toast()
        "zjc".log()

        setContent {
            PreviewMessageCard()
        }
    }

}

data class Message(val author: String, val body: String)


@Composable
fun MessageCard(msg: Message) {
    Row(modifier = Modifier.padding(8.dp)) {
        Image(
            modifier = Modifier
                .size(40.dp)
                .clip(RoundedCornerShape(10.dp))
                .border(width = 1.dp, color = MaterialTheme.colorScheme.primary),
            painter = painterResource(id = R.drawable.ic_launcher),
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(20.dp))
        Column {
            Text(text = msg.author, style = MaterialTheme.typography.titleMedium)
            Text(text = msg.body, style = MaterialTheme.typography.bodyMedium)
        }
    }

}

@Preview
@Composable
fun PreviewMessageCard() {
    MaterialTheme {
        Surface {
            MessageCard(
                msg = Message("Colleague", "Take a look at Jetpack Compose, it's great!")
            )
        }
    }
}


