package chainOfResponsibility.模板方法模式

import chainOfResponsibility.模板方法模式.template.HandlerNode

import scala.util.Random

class Engineer extends HandlerNode {

  def canHandleByEngineer(request: String): Boolean = {
    val random = new Random()
    if (random.nextInt()%2==0){
      println("Engineer能处理 %s".format(request))
      true
    }else{
      println("Engineer不能处理 %s".format(request))
      false
    }
  }

  def handleByEngineer(request: String): String = {
    println("Engineer处理了 %s".format(request))
    "Engineer处理了"
  }

  override protected def canHandle(request: String): Boolean = canHandleByEngineer(request)

  override protected def doHandle(request: String): String = handleByEngineer(request)
}
