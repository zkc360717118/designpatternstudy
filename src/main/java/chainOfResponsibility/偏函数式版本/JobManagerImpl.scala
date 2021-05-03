package chainOfResponsibility.偏函数式版本

import chainOfResponsibility.偏函数式版本.bean.{Input, Output}

import scala.util.{Random, Try}

class JobManagerImpl extends BuilderChainOneForPH{


  /**
   * 组装责任链
   */
  def assembleChain() = {
    val customService = handler(CustomerService.canHandleByCustomService,CustomerService. handleByCustomService)
    val manager = handler(Manager.canHandleByManager, Manager.handleByManager)
    val engineer = handler(Engineer.canHandleByEngineer, Engineer.handleByEngineer)

    handlerChain = customService orElse manager orElse engineer
  }

  /**
   * 对外提供服务的api
   * @param request
   * @return
   */
  def handle(request:Input)= {
    assembleChain()
    Try(handlerChain(request)).toOption

  }




}
