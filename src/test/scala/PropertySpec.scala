import org.scalacheck.Properties
import org.scalacheck.Prop
import org.scalacheck.Gen.{listOf, alphaStr, numChar}
object PropertySpec  extends Properties("PropertyUtil")  {
  property("square") =
    Prop.forAll {
      (x: Int) =>
      PropertyUtil.square(x) == x * x
    }
  property("concate") =
    Prop.forAll {
      (l1: List[Int], l2: List[Int]) =>
      PropertyUtil.concate(l1, l2) ==
      l1 ++  l2
    }

}
