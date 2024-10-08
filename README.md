<h1 align="center">Hangul Number</h1>

<p align="center">
  <a href="https://github.com/Im-Tae"><img alt="Author" src="https://img.shields.io/badge/author-Im--Tae-red.svg"/></a>
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
</p>
<p align="center">  
Use this library to convert Number into Korean.</p>




## Install

[![](https://github.com/Im-Tae/HangulNumber/actions/workflows/ci.yml/badge.svg)](https://github.com/Im-Tae/HangulNumber/actions) [![Maven Central](https://img.shields.io/maven-central/v/io.github.im-tae/hangul-number.svg?label=Maven%20Central)](https://search.maven.org/search?q=io.github.im-tae%2C+hangul-number)

### Gradle

**Module : build.gradle**

```gradle
dependencies {
    implementation("io.github.im-tae:hangul-number:$Version")
}
```



### Maven

```maven
<dependency>
    <groupId>io.github.im-tae</groupId>
    <artifactId>hangul-number</artifactId>
    <version>$Version</version>
</dependency>
```



## Usage

##### Use it like following:

```kotlin
HangulNumber.numberToHangul("7234526")
```

```kotlin
HangulNumber.numberToHangul("7456653467", Spacing.TYPE)
```

</br>

##### HangulNumber supports the following TYPE of Spacing:



1. `Spacing.NONE` : Default, No spacing.
2. `Spacing.SMALL` : Spacing in small unit.
3. `Spacing.BIG` : Spacing in big unit .
4. `Spacing.BOTH` : Spacing both small unit and big unit.

</br>

##### HangulNumber supports the number ranges

0 to 10^33 - 1 [0 ~ 99999999999999999999999999999999 ]



## License

```
Copyright 2020 Im-Tae (TaeGeon Lim)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

