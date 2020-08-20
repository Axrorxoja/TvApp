package di.module

import dagger.Module
import dagger.Provides
import data.IChannelControl
import data.IDisplay
import data.IVoiceControl
import data.TV
import javax.inject.Singleton

@Module
class TvModule {
    @Singleton
    @Provides
    fun provideTV(
        display: IDisplay,
        voiceControl: IVoiceControl,
        channelControl: IChannelControl
    ): TV {
        val tv = TV()
        tv.channelControl = channelControl
        tv.voiceControl = voiceControl
        tv.display = display
        return tv
    }
}