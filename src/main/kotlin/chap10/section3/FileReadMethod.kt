package chap10.section3

import java.io.BufferedReader
import java.io.File
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.Exception

fun main() {
    val path = "C:\\Temp\\Over the Rainbow.txt"

    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val text = inputStream.bufferedReader().use { it.readText() }
    println(text)


    //File(path).copyTo(File("경로")) 를 통해 간단하게 파일 복사 가능
}