package chainOfResponsibility.偏函数式版本



import chainOfResponsibility.偏函数式版本.bean.{Input, Output}

import scala.util.Random


object CustomerService  {

  def canHandleByCustomService(request: Input): Boolean = {
    val random = new Random()
    if (random.nextInt()%2==0){
      println("客服能处理 %s".format(request))
      true
    }else{
      println("客服不能处理 %s".format(request))
      false
    }
  }

  def handleByCustomService(request: Input): Output = {
    println("客服处理了 %s".format(request))
    Output("客服处理了")
  }

    def canHandle(request: Input): Boolean = canHandleByCustomService(request)

    def handle(request: Input): Output = handleByCustomService(request)
}
