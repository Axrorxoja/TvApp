package di.module

import dagger.Module
import dagger.Provides
import data.*
import di.scope.TvScope
import javax.inject.Singleton

@Module
class MainModule {

    @Provides
    @Singleton
    fun provideDisplay(): IDisplay = Display()

    @Provides
    @Singleton
    fun provideVoiceControl(): IVoiceControl = VoiceControl()

    @Provides
    @Singleton
    fun provideChannelControl(): IChannelControl = ChannelControl()
}