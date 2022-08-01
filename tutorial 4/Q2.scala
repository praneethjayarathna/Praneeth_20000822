object PM{
	def PMF(a:Int):String=a match{
		case a if a<=0 =>"Negative/Zero";
		case a if a%2==0 =>"even";
		case a if a%2!=0 =>"odd";
	}
	def main(args:Array[String])={
		print("Enter the integer: ");
		var x=scala.io.StdIn.readInt();
		println(PMF(x));
	}
}