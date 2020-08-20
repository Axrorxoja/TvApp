package di.component

import dagger.Component
import data.TV
import di.module.MainModule
import di.module.TvModule
import javax.inject.Singleton

@Component(
    modules = [
        MainModule::class,
        TvModule::class]
)
@Singleton
interface TvComponent {
    fun createTV(): TV
}