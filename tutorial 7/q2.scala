class Rational(x: Int, y: Int) {
def numer = x
def denom = y
def sub(r: Rational) = new Rational(numer * r.denom - r.numer * denom,denom * r.denom)

}
object q2{
	def main(args:Array[String])={
		val x = new Rational(3,4);
		val y = new Rational(5,8);
		val z = new Rational(2,7);
		val a = x.sub(y);
		val b = a.sub(z);
		println(b.numer+"/"+b.denom);
	}
}