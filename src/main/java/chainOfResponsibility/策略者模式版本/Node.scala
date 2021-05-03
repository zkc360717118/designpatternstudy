package chainOfResponsibility.策略者模式版本

import chainOfResponsibility.策略者模式版本.bean.{Input, Output}

import scala.annotation.tailrec

class Node(handler: Handler) {
  var nextNode: Node = _

  @tailrec final def handle(request: Input): Option[Output] = {
    if (handler canHandle request) Some(handler handle request)
    else if (nextNode == null) None
    else nextNode handle request
  }

}
