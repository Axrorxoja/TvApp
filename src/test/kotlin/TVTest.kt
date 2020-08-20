import data.ChannelControl
import data.Display
import data.TV
import data.VoiceControl
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mockito

@RunWith(JUnit4::class)
class TVTest {
    val mockDisplay = Mockito.mock(Display::class.java)
    val mockVoiceControl = Mockito.mock(VoiceControl::class.java)
    val mockChannelControl = Mockito.mock(ChannelControl::class.java)
//    val tv = TV(mockDisplay,mockVoiceControl,mockChannelControl)

    @Test
    fun testDecreaseVoice() {
    }

    @Test
    fun testIncreaseVoice() {
    }

    @Test
    fun testDecreaseBrightness() {
    }

    @Test
    fun testIncreaseBrightness() {
    }

    @Test
    fun testChangeChannel() {
    }
}