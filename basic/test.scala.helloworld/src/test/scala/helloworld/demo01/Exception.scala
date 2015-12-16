package test.scala.helloworld.demo01

object Exception {
  def main(args : Array[String]) : Unit = {
    tryCatch1() // Scala的句子后面可以不用分号
    tryCatch2()
  }

  /**
   * try..catch的结构展示
   * try后面跟一对大括号{}
   * 紧接着跟上catch
   * 在catch后面不是(Exception e)了，而是直接跟大括号{}
   * 在catch的大括号中，需要用case去匹配异常的类型
   * case e : Exception => 处理异常的语句
   */
  def tryCatch1() {
    var i = 0;
    try {
      if (i % 2 == 0) {
        throw new RuntimeException("被2整除了");
      }
    } catch {
      case re : RuntimeException => println("捕获到 运行时异常：" + re.getMessage)
    }
  }

  /**
   * 多个异常
   * 各个异常的处理语句之间不需要用break分割
   */
  def tryCatch2() {
    var i = 3;
    try {
      if (i % 2 == 0) {
        throw new RuntimeException("被2整除了");
      } else if (i % 3 == 0) {
        throw new Exception("被3整除了");
      }
    } catch {
      case re : RuntimeException => println("捕获到 运行时异常：" + re.getMessage)
      case e : Exception         => println("捕获到 异常：" + e.getMessage)
    }
  }

}
