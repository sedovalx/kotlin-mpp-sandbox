import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project
import org.gradle.kotlin.dsl.NamedDomainObjectContainerScope
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.invoke
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinCompilation
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet
import org.jetbrains.kotlin.gradle.plugin.KotlinTarget
import org.jetbrains.kotlin.gradle.plugin.KotlinTargetPreset
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinJsCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinJvmCompilation
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinOnlyTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

fun <T : KotlinTarget> KotlinMultiplatformExtension.fromPreset(presetName: String, targetName: String, configure: T.() -> Unit = {}) {
    @Suppress("UNCHECKED_CAST")
    val preset = presets[presetName] as KotlinTargetPreset<T>
    val target = preset.createTarget(targetName)
    targets.add(target)
    configure(target)
}

fun KotlinMultiplatformExtension.fromJvmPreset(targetName: String = "jvm", configure: KotlinOnlyTarget<KotlinJvmCompilation>.() -> Unit = {}) {
    fromPreset("jvm", targetName, configure)
}

fun KotlinMultiplatformExtension.fromJsPreset(targetName: String = "js", configure: KotlinOnlyTarget<KotlinJsCompilation>.() -> Unit = {}) {
    fromPreset("js", targetName, configure)
}

fun Project.compileKotlinTask(kotlinCompilation: KotlinJvmCompilation) = tasks[kotlinCompilation.compileKotlinTaskName] as KotlinCompile
fun Project.compileKotlinTask(kotlinCompilation: KotlinJsCompilation) = tasks[kotlinCompilation.compileKotlinTaskName] as KotlinJsCompile

fun KotlinCompile.jvmVersion(jvmTarget: String = "1.8", sourceCompatibility: String = jvmTarget, targetCompatibility: String = jvmTarget) {
    this.sourceCompatibility = sourceCompatibility
    this.targetCompatibility = targetCompatibility
    kotlinOptions {
        this.jvmTarget = jvmTarget
    }
}

fun KotlinMultiplatformExtension.configureSourceSets(configuration: NamedDomainObjectContainerScope<KotlinSourceSet>.() -> Unit) {
    @Suppress("UNCHECKED_CAST")
    (sourceSets as NamedDomainObjectContainer<KotlinSourceSet>) {
        configuration(this)
    }
}
