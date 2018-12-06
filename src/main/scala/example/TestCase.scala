package example

import java.nio.ByteBuffer

object TestCase {
  import boopickle.shapeless.Default._

  case class Parametrized[T]()
  case class Container(include: Map[Parametrized[_], Seq[String]])

  def encode(c: Container): ByteBuffer = {
    Pickle.intoBytes(c)
  }
}
