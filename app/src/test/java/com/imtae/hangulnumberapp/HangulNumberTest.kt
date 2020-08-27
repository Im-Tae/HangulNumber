package com.imtae.hangulnumberexample

import com.imtae.hangulnumber.HangulNumber
import org.junit.Test

class HangulNumberTest {

    @Test
    fun test() {

        println(HangulNumber.numberToHangul("0")) // 영
        println(HangulNumber.numberToHangul("1")) // 일
        println(HangulNumber.numberToHangul("10")) // 십
        println(HangulNumber.numberToHangul("100")) // 백
        println(HangulNumber.numberToHangul("1000")) // 천
        println(HangulNumber.numberToHangul("10000")) // 만
        println(HangulNumber.numberToHangul("100000")) // 십만
        println(HangulNumber.numberToHangul("1000000")) //백만
        println(HangulNumber.numberToHangul("10000000")) //천만
        println(HangulNumber.numberToHangul("100000000")) // 억
        println(HangulNumber.numberToHangul("1000000000")) // 십억
        println(HangulNumber.numberToHangul("10000000000")) // 백억
        println(HangulNumber.numberToHangul("100000000000")) // 천억
        println(HangulNumber.numberToHangul("1000000000000")) // 조
        println(HangulNumber.numberToHangul("10000000000000")) // 십조
        println(HangulNumber.numberToHangul("100000000000000")) // 백조
        println(HangulNumber.numberToHangul("1000000000000000")) // 천조
        println(HangulNumber.numberToHangul("10000000000000000")) // 경
        println(HangulNumber.numberToHangul("100000000000000000")) // 십경
        println(HangulNumber.numberToHangul("1000000000000000000")) // 백경
        println(HangulNumber.numberToHangul("10000000000000000000")) // 천경
        println(HangulNumber.numberToHangul("100000000000000000000")) // 해
        println(HangulNumber.numberToHangul("1000000000000000000000")) // 십해
        println(HangulNumber.numberToHangul("10000000000000000000000")) // 백해
        println(HangulNumber.numberToHangul("100000000000000000000000")) // 천해
        println(HangulNumber.numberToHangul("1000000000000000000000000")) // 자
        println(HangulNumber.numberToHangul("10000000000000000000000000")) // 십자
        println(HangulNumber.numberToHangul("100000000000000000000000000")) // 백자
        println(HangulNumber.numberToHangul("1000000000000000000000000000")) // 천자
        println(HangulNumber.numberToHangul("10000000000000000000000000000")) // 양
        println(HangulNumber.numberToHangul("100000000000000000000000000000")) // 십양
        println(HangulNumber.numberToHangul("1000000000000000000000000000000")) // 백양
        println(HangulNumber.numberToHangul("10000000000000000000000000000000")) // 천양
        println(HangulNumber.numberToHangul("99999999999999999999999999999999"))

        println(HangulNumber.numberToHangul("1343290000304000230432450"))
    }
}