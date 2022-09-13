class Rational(x: Int, y: Int) {
def numer = x
def denom = y
def neg = new Rational(-this.numer,this.denom)
}
object q1{
	def main(args:Array[String])={
		val x = new Rational(3,4);
		val a = x.neg;
		println(a.numer+"/"+a.denom);
	}
}