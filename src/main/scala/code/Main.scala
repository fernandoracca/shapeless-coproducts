package code

import shapeless._
import shapeless.ops.coproduct._
object Main extends App {
  // Code goes here

  case class A()
  case class B()
  case class C()
  case class D()

  type ABC = A :+: B :+: C :+: D :+: CNil

}
