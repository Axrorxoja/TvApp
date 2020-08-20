package data

class TV(
    private val display: IDisplay,
    private val voiceControl: IVoiceControl,
    private val channelControl: IChannelControl
) {

    fun decreaseVoice() = voiceControl.decreaseVoice()

    fun increaseVoice() = voiceControl.increaseVoice()

    fun decreaseBrightness() = display.decreaseBrightness()

    fun increaseBrightness() = display.increaseBrightness()

    fun changeChannel(newChannel: Int) = channelControl.changeChannel(newChannel)
}