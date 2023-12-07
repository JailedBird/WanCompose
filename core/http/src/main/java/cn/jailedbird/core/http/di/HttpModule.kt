package cn.jailedbird.core.http.di

import cn.jailedbird.core.http.CoreNetwork
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * <pre>
 *     author : junwuming
 *     e-mail : zjc986812982@163.com
 *     time   : 2022/08/26
 *     desc   :
 * </pre>
 */
@Module
@InstallIn(SingletonComponent::class)
object HttpModule {

    @Provides
    @Singleton
    fun provideRetrofitCore(coreNetwork: CoreNetwork): Retrofit {
        return coreNetwork.retrofit
    }

    @Provides
    @Singleton
    fun provideMoshi(): Moshi {
        return Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
    }

}