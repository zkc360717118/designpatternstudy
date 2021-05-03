package chainOfResponsibility.偏函数式版本

import chainOfResponsibility.偏函数式版本.bean.{Input, Output}

import scala.util.Random

object Manager  {

  def canHandleByManager(request: Input): Boolean = {
    val random = new Random()
    if (random.nextInt()%2==0){
      println("manager能处理 %s".format(request))
      true
    }else{
      println("manager不能处理 %s".format(request))
      false
    }
  }

  def handleByManager(request: Input): Output = {
    println("manager处理了 %s".format(request))
    Output("manager处理了")
  }

   def canHandle(request: Input): Boolean = canHandleByManager(request)

   def handle(request: Input): Output = handleByManager(request)
}
