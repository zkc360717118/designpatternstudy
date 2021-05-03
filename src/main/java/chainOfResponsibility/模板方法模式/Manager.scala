package chainOfResponsibility.模板方法模式

import chainOfResponsibility.模板方法模式.template.HandlerNode

import scala.util.Random

class Manager extends HandlerNode {

  def canHandleByManager(request: String): Boolean = {
    val random = new Random()
    if (random.nextInt()%2==0){
      println("manager能处理 %s".format(request))
      true
    }else{
      println("manager不能处理 %s".format(request))
      false
    }
  }

  def handleByManager(request: String): String = {
    println("manager处理了 %s".format(request))
    "manager处理了"
  }

  override protected def canHandle(request: String): Boolean = canHandleByManager(request)

  override protected def doHandle(request: String): String = handleByManager(request)
}
