package data

class VoiceControl constructor() : IVoiceControl {
    private val MAX_VOLUME = 100
    private val MIN_VOLUME = 0

    var level: Int = 5
        private set

    override fun decreaseVoice() {
        if (level > MIN_VOLUME)
            level--
    }

    override fun increaseVoice() {
        if (level < MAX_VOLUME)
            level++
    }
}