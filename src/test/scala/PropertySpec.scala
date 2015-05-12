import org.scalacheck.Properties
import org.scalacheck.Prop
import org.scalacheck.Gen.{listOf, alphaStr, numChar}
object PropertySpec  extends Properties("Property")  {
  property("square") =
    Prop.forAll {
      (x: Int) =>
      Property.square(x) == x * x
    }
 }
