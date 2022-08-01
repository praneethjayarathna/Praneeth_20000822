object inter{
	def calinter(a:Int):Double=a match{
		case a if a<=20000 =>a*0.02;
		case a if a<=200000 =>a*0.04;
		case a if a<=2000000 =>a*0.035;
		case a if a>2000000 => a*0.065;
	}
	def main(args:Array[String])={
		println("Interest is "+calinter(10000000));//enter the depositamount
	}
}