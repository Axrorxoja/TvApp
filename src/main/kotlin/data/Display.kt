package data

class Display : IDisplay {
    private val MAX_BRIGHTNESS = 100
    private val MIN_BRIGHTNESS = 0
    private var brightness = 30

    override fun decreaseBrightness() {
        if (brightness > MIN_BRIGHTNESS)
            brightness--
    }

    override fun increaseBrightness() {
        if (brightness < MAX_BRIGHTNESS)
            brightness++
    }
}