package test.scala.helloworld.demo02TupleArrayMapFile

/**
 * 数组
 * 定义方式：
 * 	两种：
 * 	一种是指定元素值(根据元素值来推算数组的类型和长度)[var arr = Array(1, "element2", 3)]
 * 	另一种是指定数组类型和长度(没有元素值)[var arr = new Array[Int](3)]
 * 访问方式：圆括号方式：array(index); index为从0开始的正整数
 * @author Booynal
 *
 */
object ArrayDemo {
  def main(args : Array[String]) {
    println("方式一：指定元素值")
    val array = Array(1, "element2", 3, 4, 5) // 创建一个数组同时指定数组各个元素的值
    for (i <- 0 until array.length) {
      println("array(" + i + ") = " + array(i))
    }

    println("方式二：指定数组类型和长度")
    var array2 = new Array[Int](3) // 指定长度创建一个空数组
    array2(0) = 1;
    array2(1) = 10;
    array2(2) = 100;
    for (i <- 0 until array2.length) {
      println("array2(" + i + ") = " + array2(i))
    }
  }
}
