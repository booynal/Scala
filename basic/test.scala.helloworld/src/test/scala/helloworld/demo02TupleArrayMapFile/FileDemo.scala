package test.scala.helloworld.demo02TupleArrayMapFile

import scala.io.Source

/**
 * Scala中的文件操作可以用这个类：scala.io.Source
 * @author Booynal
 *
 */
object FileDemo {
  def main(args : Array[String]) {
    println("从本地文件得到一个输入源：")
    val file = Source.fromFile("sources/testFile");
    // println(file) // file是一个迭代器，实现了Iterator接口
    for (line <- file.getLines()) {
      println(line)
    }

    println("从URL得到一个输入源：")
    val source = Source.fromURL("http://www.baidu.com")
    for (line <- source.getLines() if line.length() < 1000) { // 带条件的for循环，只有当line的字符长度不超过1000个的时候才打印出来
      println(line)
    }
  }
}
