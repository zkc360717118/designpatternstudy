package 自己玩

import scala.collection.mutable

object Play1 extends App {
  val m:mutable.HashMap[String,AnyVal] = new mutable.HashMap()
  m("1")=2
  println(m)

}
