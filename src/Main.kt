fun main() {
    val str1 = readLine()!!
    val strWithNoSpace = str1.trimEnd(' ')
    val strWithNoTail = strWithNoSpace.trimEnd()
    str1.trim { it == '-'}.toMutableList()
}