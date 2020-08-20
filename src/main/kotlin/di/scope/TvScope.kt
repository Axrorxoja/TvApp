package di.scope

import java.lang.annotation.Documented
import java.lang.annotation.RetentionPolicy
import javax.inject.Scope

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class TvScope

@Scope
annotation class FragmentScope

@Scope
annotation class ActivityScope

@Scope
annotation class AppScope