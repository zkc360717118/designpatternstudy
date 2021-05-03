package chainOfResponsibility.偏函数式版本

import chainOfResponsibility.偏函数式版本.bean.{Input, Output}

import scala.util.Random

object Engineer {

  def canHandleByEngineer(request: Input): Boolean = {
    val random = new Random()
    if (random.nextInt()%2==0){
      println("Engineer能处理 %s".format(request))
      true
    }else{
      println("Engineer不能处理 %s".format(request))
      false
    }
  }

  def handleByEngineer(request: Input): Output = {
    println("Engineer处理了 %s".format(request))
    Output("Engineer处理了")
  }

 def canHandle(request: Input): Boolean = canHandleByEngineer(request)

  def handle(request: Input): Output = handleByEngineer(request)
}
