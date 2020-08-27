<h1 align="center">Hangul Number</h1>

<p align="center">
  <a href="https://github.com/Im-Tae"><img alt="Author" src="https://img.shields.io/badge/author-Im--Tae-red.svg"/></a>
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
</p>
<p align="center">  
숫자를 한글로 바꿔주는 라이브러리입니다.</p>
<p align="center">
    <a href="https://github.com/Im-Tae/HangulNumber/blob/master/README/ENGLISH.md">ENGLISH<a/>
</p>





## 설치

[![](https://jitci.com/gh/Im-Tae/HangulNumber/svg)](https://jitci.com/gh/Im-Tae/HangulNumber) [![](https://jitpack.io/v/Im-Tae/HangulNumber.svg)](https://jitpack.io/#Im-Tae/HangulNumber) 

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



## 사용

다음과 같이 사용하면 됩니다.

```kotlin
HangulNumber.numberToHangul("7234526")
```

```kotlin
HangulNumber.numberToHangul("7456653467", Spacing.TYPE)
```



지원하는 띄어쓰기의 종류는 다음과 같습니다.



1. `Spacing.NONE` : 기본 값, 띄어쓰기가 없습니다.
2. `Spacing.SMALL` : 작은 단위( 십, 백, 천 )의 띄어쓰기가 있습니다.
3. `Spacing.BIG` : 큰 단위( 만, 억, 조, 경, 해, 자, 양 )의 띄어쓰기가 있습니다.
4. `Spacing.BOTH` : 작은 단위, 큰 단위 모두 띄어쓰기가 있습니다.



지원하는 숫자의 범위는 0 부터 10^33 - 1 ( 천 양 )까지 입니다.

[0 ~ 99999999999999999999999999999999 ]

