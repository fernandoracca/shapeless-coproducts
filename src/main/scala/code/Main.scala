package code

import shapeless._
import shapeless.ops.coproduct._
object Main  {

  case class A()
  case class B()
  case class C()
  case class D()

  type ABC = A :+: B :+: C :+: D :+: CNil

  def main(args: Array[String]): Unit = {
    val x: ABC = Inr(Inl(B()))
    println(x)
  }

}
