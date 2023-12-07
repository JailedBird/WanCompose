package cn.jailedbird.core.http

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@Suppress("SpellCheckingInspection")
@JsonClass(generateAdapter = true)
data class ListBean<T>(
    val curPage: Int? = null,
    @Json(name = "datas")
    val data: List<T>? = null,
    val offset: Int? = null,
    val over: Boolean? = null,
    val pageCount: Int? = null,
    val size: Int? = null,
    val total: Int? = null,
)

