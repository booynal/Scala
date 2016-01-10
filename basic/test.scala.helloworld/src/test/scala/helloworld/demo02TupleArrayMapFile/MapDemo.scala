package test.scala.helloworld.demo02TupleArrayMapFile

/**
 * Map为键值对
 * 与java的Map类似，声明方式是Scala的风格
 * 创建Map的同时指定元素的值[val mapVal = Map("k1"->"v1",...)]
 * @author Booynal
 *
 */
object MapDemo {
  def main(args : Array[String]) {
    // 根据元素值创建Map
    val ages = Map("ziv" -> 26, "ivy" -> 25)
    println("打印Map的key和value")
    for ((k, v) <- ages) {
      println(k + " = " + v)
    }

    // 下划线为占位符，表示不需要取到map中的value字段，只需要key字段
    // 占位符只是为某个名称占一个位置
    println("只打印Map的key")
    for ((k, _) <- ages) {
      println("key is: " + k)
    }

    // 下划线为占位符，表示不需要取到map中的key字段，只需要value字段
    println("只打印Map的value")
    for ((_, v) <- ages) {
      println("value is: " + v)
    }
  }
}
