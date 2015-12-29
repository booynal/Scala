package test.scala.helloworld.demo01

import scala.io.Source

/**
 * 延迟执行
 * @author Booynal
 *
 */
object Lazy {

  def main(args : Array[String]) : Unit = {
    lazy1();
  }

  /**
   * lazy可以让变量更懒，在变量第一次被使用的时候才实例化
   */
  def lazy1() = {
    try {
      println("如果文件不存在，就会报错");
      val file = Source.fromFile("/test/abc.txt");
    } catch {
      case e : Exception => println("该文件不存在：" + e.getMessage);
    }
    println("如果文件不存在，但是加上了lazy关键字，只要不使用它就不会报错");
    lazy val file2 = Source.fromFile("/test/abc.txt");
    println("我被执行了，说明我的上一句话没有报错");
    for (line <- file2.getLines()) { // 此处使用了file2，就会报错，注意看调用堆栈，是从此行调用了lazy的那一行
      println(line);
    }
  }
}
