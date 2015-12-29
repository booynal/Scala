package test.scala.helloworld.demo01

/**
 * 函数是有值的，所以函数的定义后边就会跟着一个等号(=)
 * 一般不需要指明返回值类型，但递归调用的函数必须声明函数返回值类型
 * @author Booynal
 *
 */
object Function {
  def main(args : Array[String]) {
    println(fun0);
    fun1(1);
    println(fun2(2));
    println(fun3(3));
    println(aValue(4));
    println(fac(5));
    println(fun6("这是内容，两边有标记围绕着我", "<"));
    println("不定参数函数：" + fun7(1, 2, 3, 4, 5));
  }

  /**
   * 这是一个简单函数，由关键字“def”定义：def methodName(argList):returnType={funBody}
   * 只包含一句话，所以内联了
   * 该函数名字：fun0，没有参数，有返回值类型为Int
   * 它始终返回数字2*10
   */
  def fun0 : Int = 2 * 10;

  /**
   * 第二个的函数，有一个参数，没有返回值
   * @param i 传递进来一个数字
   */
  def fun1(i : Int) {
    println("这是我接收到的参数：" + i);
  }

  /**
   * 第三个函数，既有参数，又有返回值
   * 返回值类型可以省略，但是如果要有返回值，“=”必不可少
   * “return”也可以省略，且须要与返回值类型同时省略，
   * @param i 传进来一个数字
   * @return 返回一句话
   */
  def fun2(i : Int) /*: String*/ = {
    /*return*/ "我是返回值，来自于fun2这个函数，我能够看到参数i的值为" + i;
  }

  /**
   * 第4个函数，它是第3个函数的精简版
   */
  def fun3(i : Int) = "我是一个很精简的函数，i的值为" + i

  /**
   * 第5个函数：匿名函数
   * 只有参数和函数体，没有函数名
   * 格式：用一对括号把参数列表括起来，然后跟上【=>】，在后面就是函数体
   * 下面的匿名函数被赋值给了一个常量(val)
   */
  val aValue = (i : Int) => i + 10

  /**
   * 第6个函数：递归函数
   * 递归函数必须要声明函数的返回值，否则编译会报出下列错误：
   * recursive method fac needs result type
   * 以下是计算斐波那契数列的递归算法
   */
  def fac(n : Int) : Int = if (n <= 0) 1 else n * fac(n - 1)

  /**
   * 第7个函数：参数默认值
   * 参数列表中可以为参数设定默认值，那么如果调用者没有传递某个参数，这个参数就取默认值
   * 以下是一个拼接字符串的函数，准备在msg的开始和结尾加上标记，默认的标记是[msg]
   */
  def fun6(msg : String, start : String = "[", end : String = "]") = {
    start + msg + end
  }

  /**
   * 第8个函数：不定长度参数
   * 类似于java的【String... strings】，args被当作集合处理
   * @param args 不定长度参数
   */
  def fun7(args : Int*) : Int = {
    var sum = 0;
    for (arg <- args) {
      sum += arg;
    }
    return sum;
  }

}
