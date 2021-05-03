package chainOfResponsibility.偏函数式版本

import chainOfResponsibility.偏函数式版本.bean.{Input, Output}

import scala.util.Try

trait BuilderChainOneForPH {
  var handlerChain: PartialFunction[Input, Output] =_;
  /**
   * partial function
   * @param canHandle
   * @param handle
   * @return
   */
  def handler(canHandle: Input => Boolean, handle: Input => Output): PartialFunction[Input, Output] = {
    case request: Input if canHandle(request) => handle(request)
  }


}
