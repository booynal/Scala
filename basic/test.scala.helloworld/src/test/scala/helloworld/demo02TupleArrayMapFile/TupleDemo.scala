package test.scala.helloworld.demo02TupleArrayMapFile

/**
 * Tuple是元组，一个元组中可以有很多个元素，
 * 就好比数据库表的元组有很多列一样，Tuple中每一个元素可以是不同的类型
 * Tuple的元素索引从1开始，这一点与数组下标的风格不同
 * Tuple访问元素的方式和java不同风格，Tuple中用“_N”(N表示从1开始的索引)的方式访问指定索引的元素
 * 声明的语法格式为：val value = (t1, t2[, tN])
 *
 * 实际运用：函数返回结果
 * @author Booynal
 *
 */
object TupleDemo {
  def main(args : Array[String]) {
    // 声明一个元组
    val pair = (100, "Scala", "Spark")
    println("打印元组的元素：")
    println(pair._1)
    println(pair._2)
    println(pair._3)
  }
}
