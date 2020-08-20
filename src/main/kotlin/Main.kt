import di.component.DaggerTvComponent


fun main() {
    val component = DaggerTvComponent.create()
    val tv = component.createTV()
    tv.changeChannel(5)
}