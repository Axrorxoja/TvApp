package data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TV {
    @Inject
    lateinit var display: IDisplay

    @Inject
    lateinit var voiceControl: IVoiceControl

    @Inject
    lateinit var channelControl: IChannelControl

    fun decreaseVoice() = voiceControl.decreaseVoice()

    fun increaseVoice() = voiceControl.increaseVoice()

    fun decreaseBrightness() = display.decreaseBrightness()

    fun increaseBrightness() = display.increaseBrightness()

    fun changeChannel(newChannel: Int) = channelControl.changeChannel(newChannel)
}