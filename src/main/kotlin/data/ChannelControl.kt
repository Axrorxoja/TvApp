package data

class ChannelControl : IChannelControl {
    private val MAX_CHANNEL = 100
    private val MIN_CHANNEL = 0

    private var channel: Int = 0

    override fun changeChannel(newChannel: Int) {
        if (newChannel in MIN_CHANNEL..MAX_CHANNEL) {
            channel = newChannel
        }
    }

}