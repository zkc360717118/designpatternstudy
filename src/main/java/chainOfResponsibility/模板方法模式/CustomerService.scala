package chainOfResponsibility.模板方法模式

import chainOfResponsibility.模板方法模式.template.HandlerNode

import scala.util.Random


class CustomerService extends HandlerNode {

  def canHandleByCustomService(request: String): Boolean = {
    val random = new Random()
    if (random.nextInt()%2==0){
      println("客服能处理 %s".format(request))
      true
    }else{
      println("客服不能处理 %s".format(request))
      false
    }
  }

  def handleByCustomService(request: String): String = {
    println("客服处理了 %s".format(request))
    "客服处理了"
  }

  override protected def canHandle(request: String): Boolean = canHandleByCustomService(request)

  override protected def doHandle(request: String): String = handleByCustomService(request)
}
