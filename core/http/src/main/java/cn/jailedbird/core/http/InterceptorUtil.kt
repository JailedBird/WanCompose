package cn.jailedbird.core.http

import android.util.Log
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Inject

/**
 * the collection of Okhttp Interceptor
 */
class InterceptorUtil @Inject constructor() {
    @Suppress("PrivatePropertyName")
    private var TAG = "OkHttp"

    /**
     * HttpLoggingInterceptor.Leve: NONE、BASIC、HEADERS、BODY
     */
    fun genObj(isDebug: Boolean = true): HttpLoggingInterceptor {
        val loggingInterceptor = HttpLoggingInterceptor { message ->
            Log.w(TAG, message)
        }
        if (isDebug) {
            // development build
            // loggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
            loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        } else {
            // production build
            loggingInterceptor.level = HttpLoggingInterceptor.Level.NONE
        }
        return loggingInterceptor
    }
}