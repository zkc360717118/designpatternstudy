package chainOfResponsibility.模板方法模式

object Test {
  def main(args: Array[String]): Unit = {
    val chain = new FilterChain
    //模拟有4请求
    val arr = Array("r1", "r2", "r3", "r4")
    for (elem <- arr) {
      chain.handle(elem)
    }
  }

}
