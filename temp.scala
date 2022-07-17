object temp{
	def caltemp(c:Int):Double={
		var f=c*1.8+32;
		return f;
	}
	def main(args:Array[String])={
		println("Temperature is "+caltemp(35)+" Fahrenheit");//enter the Temperature in Celcius
	}
}