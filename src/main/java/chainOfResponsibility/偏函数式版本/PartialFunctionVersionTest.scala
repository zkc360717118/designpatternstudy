package chainOfResponsibility.偏函数式版本

import chainOfResponsibility.偏函数式版本.bean.Input

object PartialFunctionVersionTest {

  def main(args: Array[String]): Unit = {
    val impl = new JobManagerImpl()

    //模拟有4请求
    val arr = Array(Input("r1"), Input("r2"), Input("r3"), Input("r4"))
    for (elem <- arr) {
      val maybeOutput = impl.handle(elem)
      println(maybeOutput.getOrElse("没人处理这个鬼"))
    }
  }

}
