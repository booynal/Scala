package test.scala.helloworld.demo01

object For {
  def main(args : Array[String]) {
    loop0();
    loop1(args);
    loop2();
  }

  /**
   * Scala的增强for循环
   */
  def loop0() {
    var strings : Array[String] = new Array[String](3); // 创建一个字符串数组
    strings(0) = "one"; // 给数组赋值
    strings(1) = "two";
    strings(2) = "three";
    for (string <- strings) { // 遍历数组
      println(string)
    }
  }

  /**
   * Scala的特殊循环：遍历参数的情况下，把迭代器放在【Unit=】后面，然后循环体放在方法体中
   * @param args 需要遍历的数组
   */
  def loop1(args : Array[String]) : Unit = for (arg <- args) {
    println(arg)
  }

  /**
   * 指定次数的循环
   */
  def loop2() {
    for (i <- 1 to 3) {
      println(i)
    }
  }
}
