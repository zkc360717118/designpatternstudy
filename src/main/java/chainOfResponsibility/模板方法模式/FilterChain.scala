package chainOfResponsibility.模板方法模式

class  FilterChain {
  val customerService  = new CustomerService
  val manager = new Manager
  val engineer = new Engineer
  customerService.next=manager
  manager.next=engineer


  def handle(request:String):Option[String]={
   customerService.handle(request)
  }

}
