//import scala.io.StdIn.readLine;
object sal{
	def calsal(a:Int,b:Int):Double={
		var sum=(a*250)+(b*85)-(((a*250)+(b*85))*0.12);
		return sum;
	}
	def main(args:Array[String])={
		println("Take home salary = "+calsal(10,20));//enter the no of working hours as first argument
	}                                                    //enter the no of OT hours as second argument
}