package cn.jailedbird.feature.login

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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
            Column {
                Text("Hello world!")
                MessageCard("zjc")
            }
        }
    }

}

@Preview
@Composable
fun MessageCard(name: String = "zkc") {
    Text(text = "Hello $name!")
}



