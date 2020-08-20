package data

fun main() {
    val display: IDisplay = Display()
    val voiceControl: IVoiceControl = VoiceControl()
    val channelControl: IChannelControl = ChannelControl()

    val tv = TV(display, voiceControl, channelControl)
}