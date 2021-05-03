package chainOfResponsibility.策略者模式版本

import chainOfResponsibility.策略者模式版本.bean.Input

object StragetyAndCORTest {
  def main(args: Array[String]): Unit = {
    val chain = new FilterChain
    //模拟有4请求
    val arr = Array(Input("r1"), Input("r2"), Input("r3"), Input("r4"))
    for (elem <- arr) {
      chain.handle(elem)
    }
  }

}
