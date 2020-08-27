<h1 align="center">Hangul Number</h1>

<p align="center">
  <a href="https://github.com/Im-Tae"><img alt="Author" src="https://img.shields.io/badge/author-Im--Tae-red.svg"/></a>
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
</p>

<p align="center">  
Use this library to convert Number into Korean.</p>
<p align="center">
    <a href="https://github.com/Im-Tae/Hangul_Number/blob/master/README.md">KOREAN<a/>
</p>



## Download

[![](https://jitpack.io/v/Im-Tae/HangulNumber.svg)](https://jitpack.io/#Im-Tae/HangulNumber)



### Gradle

**Project : build.gradle**

```gradle
allprojects {
    repositories {
	    ...
	    maven { url 'https://jitpack.io' }
	}
}
```

**Module : build.gradle**

```gradle
dependencies {
    implementation 'com.github.Im-Tae:Hangul_Number:Version'
}
```



### Maven

```maven
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>
```

```maven
<dependency>
	<groupId>com.github.Im-Tae</groupId>
	<artifactId>Hangul_Number</artifactId>
	<version>Version</version>
</dependency>
```



## Usage

Use it like following:

```kotlin
HangulNumber.numberToHangul("7234526")
```

```kotlin
HangulNumber.numberToHangul("7456653467", Spacing.TYPE)
```



HangulNumber supports the following TYPE of Spacing:



1. `Spacing.NONE` : Default, No spacing.
2. `Spacing.SMALL` : Spacing in small unit.
3. `Spacing.BIG` : Spacing in big unit .
4. `Spacing.BOTH` : Spacing both small unit and big unit.



HangulNumber supports the number ranges 0 to 10^33 - 1.

[0 ~ 99999999999999999999999999999999 ]