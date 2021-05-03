package chainOfResponsibility.模板方法模式.template

import scala.annotation.tailrec

abstract class HandlerNode(){
  var next: HandlerNode = _

  @tailrec final def handle(request: String): Option[String] = {
    if (canHandle(request)) {
      Some(doHandle(request))
    }else if (next == null){
      println("没有可以处理%s的handler了".format(request))
      None
    } else {next handle request}
  }

  protected def canHandle(request: String): Boolean
  protected def doHandle(request: String): String
}
