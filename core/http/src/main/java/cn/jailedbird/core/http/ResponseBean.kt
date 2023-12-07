package cn.jailedbird.core.http

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseBean<T>(
    val data: T?,
    val errorCode: Int?,
    @Json(name = "errorMsg") val errorMsg: String = EMPTY,
) {
    companion object {
        private const val EMPTY = ""
    }

    val isSuccess: Boolean
        get() = errorCode == 0

}


