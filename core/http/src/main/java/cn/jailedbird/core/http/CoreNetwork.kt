package cn.jailedbird.core.http

import android.content.Context
import com.franmontiel.persistentcookiejar.ClearableCookieJar
import com.franmontiel.persistentcookiejar.PersistentCookieJar
import com.franmontiel.persistentcookiejar.cache.SetCookieCache
import com.franmontiel.persistentcookiejar.persistence.SharedPrefsCookiePersistor
import com.squareup.moshi.Moshi
import dagger.hilt.android.qualifiers.ApplicationContext
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class CoreNetwork @Inject constructor(
    @ApplicationContext context: Context,
    interceptorUtil: InterceptorUtil,
    moshi: Moshi
) {
    companion object {
        private const val BASE_URL: String = "https://www.wanandroid.com"
    }

    // PersistentCookieJar
    private val cookieJar: ClearableCookieJar =
        PersistentCookieJar(SetCookieCache(), SharedPrefsCookiePersistor(context))

    private val okHttpClient = OkHttpClient
        .Builder()
        .cookieJar(cookieJar)
        .connectTimeout(60, TimeUnit.SECONDS)
        .readTimeout(60, TimeUnit.SECONDS)
        .writeTimeout(60, TimeUnit.SECONDS)
        .addInterceptor(interceptorUtil.genObj(true))
        .build()

    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .client(okHttpClient)
        .build()
}