package chap10.section3

import com.sun.xml.internal.fastinfoset.util.StringArray
import java.io.BufferedReader
import java.io.File
import kotlin.math.sqrt

fun main() {
    val path = "C:\\Users\\kkcch\\Downloads\\points.txt"

    val bufferedReader = File(path).bufferedReader()
    val lineList = mutableListOf<String>()
    bufferedReader.useLines{ lines -> lines.forEach { lineList.add(it) }}

    for(i in 0..999) {
        var array = lineList[i].split(" ")
        var a = array[0].toDouble()
        var b = array[1].toDouble()
        var tmp = sqrt((a * a) + (b * b))
        if(tmp in 450.0..550.0) {
            println("circle c ($a, $b) radius 6 filled")
        }
        else {
            println("circle c ($a, $b) radius 2 filled")
        }
    }
}