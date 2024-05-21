// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

}
fun getLoginTime(context: String): String? {
    val pattern = Regex("(?<=[LOGIN]]\\s*→\\s*\\d{2}:\\d{2})")
    val matchResult = pattern.find(context)
    return matchResult?.value
}

fun main() {
    val context = """
        09:41
    CINESCOPE
    LOGIN →
    • 09:41 CINESCOPE LOGIN → •
    """
    println("The login time in the provided context is:")
    println(getLoginTime(context))
}