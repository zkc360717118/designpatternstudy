package chainOfResponsibility.策略者模式版本

import chainOfResponsibility.策略者模式版本.bean.{Input, Output}

trait Handler {
  def canHandle(request: Input): Boolean
  def handle(request: Input): Output
}
