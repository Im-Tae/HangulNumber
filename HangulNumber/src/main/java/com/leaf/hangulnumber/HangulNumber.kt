package com.leaf.hangulnumber

import java.lang.Exception

class HangulNumber {

    enum class Spacing{
        NONE,
        SMALL,
        BIG,
        BOTH
    }

    companion object {

        private val numberList = arrayOf("", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구")
        private val smallUnitList = arrayOf("", "십", "백", "천")
        private val bigUnitList = arrayOf("", "만", "억", "조", "경", "해", "자", "양")

        fun numberToHangul(number: String, spacing: Spacing = Spacing.NONE): String = getHangulNumber(number, spacing)

        private fun getHangulNumber(number: String, spacing: Spacing): String {

            try {

                val numberSize = number.length
                val resultBuffer = StringBuffer()

                if (number == "0") return "영"

                for (i in numberSize - 1 downTo 0) {

                    resultBuffer.append(getNumber(number, numberSize, i))

                    val smallUnit = getSmallUnit(number, numberSize, i)
                    val bigUnit = getBigUnit(i)

                    resultBuffer.append(checkSpacing(spacing, smallUnit, bigUnit))
                }

                return checkFirstNumberIsOne(checkUnit(resultBuffer), numberSize)

            } catch (e: Exception) {

                if (number.length > 32) print("최대 숫자 : 32 | 현재 숫자 : ${number.length}")
                else print("숫자를 입력해주세요.")

                e.printStackTrace()
            }

            return ""
        }

        private fun getNumber(number: String, numberSize: Int, index : Int): String =
            if (numberList[Integer.parseInt(number.substring(numberSize - index - 1, numberSize - index))] == "일" && numberSize - index != numberSize && index % 4 != 0)
                numberList[0]
            else
                numberList[Integer.parseInt(number.substring(numberSize - index - 1, numberSize - index))]

        private fun getSmallUnit(number: String, numberSize: Int, index : Int): String =
            if (Integer.parseInt(number.substring(numberSize - index - 1, numberSize - index)) > 0)
                smallUnitList[index % 4]
            else ""

        private fun getBigUnit(index: Int): String =
            if (index % 4 == 0)
                bigUnitList[index / 4]
            else ""

        private fun checkSpacing(spacing: Spacing, smallUnit: String, bigUnit: String): StringBuffer {

            val spacingBuffer = StringBuffer()

            when(spacing) {
                Spacing.SMALL -> {
                    if (smallUnit != "")
                        spacingBuffer.append(smallUnit).append(" ").append(bigUnit)
                    else
                        spacingBuffer.append(smallUnit).append(bigUnit)
                }

                Spacing.BIG -> {
                    if (bigUnit != "")
                        spacingBuffer.append(smallUnit).append(bigUnit).append(" ")
                    else
                        spacingBuffer.append(smallUnit).append(bigUnit)
                }

                Spacing.BOTH -> {
                    when {
                        smallUnit != "" -> spacingBuffer.append(smallUnit).append(" ").append(bigUnit)
                        bigUnit != "" -> spacingBuffer.append(smallUnit).append(bigUnit).append(" ")
                        else -> spacingBuffer.append(smallUnit).append(bigUnit)
                    }
                }

                Spacing.NONE -> {
                    spacingBuffer.append(smallUnit).append(bigUnit)
                }
            }

            return spacingBuffer
        }

        private fun checkUnit(resultBuffer : StringBuffer) : String {

            var result = resultBuffer.toString()

            if (result.contains("억만")) result = result.replace("억만", "억")
            if (result.contains("조억")) result = result.replace("조억", "조")
            if (result.contains("경조")) result = result.replace("경조", "경")
            if (result.contains("해경")) result = result.replace("해경", "해")
            if (result.contains("자해")) result = result.replace("자해", "자")
            if (result.contains("양자")) result = result.replace("양자", "양")

            return result
        }

        private fun checkFirstNumberIsOne(result: String, numberSize: Int): String =
            if (result.startsWith("일") && numberSize > 1) result.substring(1, result.length)
            else result
    }
}