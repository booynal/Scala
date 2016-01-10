package test.scala.helloworld.demo01

/**
 * 循环的高级功能
 * 1. 带条件的for循环
 * 2. 双重for循环的写法
 * 3. 多重for循环的写法
 */
object For2 {

  def main(args : Array[String]) : Unit = {
    for0();
    for1();
    for2();
    for3();
  }

  /**
   * 带条件的for循环
   */
  def for0() {
    println("带条件的for循环: 在for括号的后部分加上if语句");
    for (i <- 1 to 2 if i % 2 == 0) {
      println("i=" + i)
    }

    println("等同代码：")
    for (i <- 1 to 2) {
      if (i % 2 == 0) {
        println("i=" + i)
      }
    }
  }

  /**
   * 双重for循环
   */
  def for1() {
    println("双重for循环: i是外层循环，j是内层循环。用一个分号隔开");
    for (i <- 1 to 2; j <- 1 to 2) {
      println("i=" + i + ",j=" + j);
    }

    println("等同代码：");
    for (i <- 1 to 2) {
      for (j <- 1 to 2) {
        println("i=" + i + ",j=" + j);
      }
    }
  }

  /**
   * 带条件的双重for循环
   */
  def for2() {
    println("带条件的双重for循环: ");
    for (i <- 1 to 2; j <- 1 to 2 if i != j) {
      println("i=" + i + ",j=" + j);
    }

    println("等同代码");
    for (i <- 1 to 2) {
      for (j <- 1 to 2) {
        if (i != j) {
          println("i=" + i + ",j=" + j);
        }
      }
    }
  }

  /**
   * 多重for循环
   */
  def for3() {
    println("多重for循环: 每一层循环之间用分号隔开就行");
    for (i <- 1 to 2; j <- 1 to 2; k <- 1 to 2) {
      println("i=" + i + ",j=" + j + ",k=" + k);
    }
  }

}
