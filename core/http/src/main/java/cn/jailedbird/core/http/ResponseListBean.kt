package cn.jailedbird.core.http

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResponseListBean<T>(
    val data: ListBean<T>?,
    val errorCode: Int?,
    val errorMsg: String?,
) {
    val isSuccess
        get() = errorCode == 0
}
