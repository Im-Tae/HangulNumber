# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.kts.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile

-keep class com.leaf.hangulnumber.** { *; }

-keep class com.leaf.hangulnumber.HangulNumber {
    *;
}

-keepclassmembers class com.leaf.hangulnumber.HangulNumber$Companion {
    !public <methods>;
    public <fields>;
}

-keepclassmembernames class com.leaf.hangulnumber.HangulNumber$Companion {
    public *;
}

-dontwarn java.lang.invoke.StringConcatFactory