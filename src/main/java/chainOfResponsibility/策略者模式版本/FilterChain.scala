package chainOfResponsibility.策略者模式版本

import chainOfResponsibility.策略者模式版本.bean.{Input, Output}

class  FilterChain {
  val customerService  =new Node(new CustomerService)
  val manager = new Node(new Manager)
  val engineer = new Node(new Engineer)
  customerService.nextNode=manager
  manager.nextNode=engineer


  def handle(request:Input):Option[Output]={
   customerService.handle(request)
  }

}
