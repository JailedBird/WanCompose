package cn.jailedbird.feature.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.jailedbird.core.common.utils.log
import cn.jailedbird.core.common.utils.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        "zjc".toast()
        "zjc".log()
    }

}