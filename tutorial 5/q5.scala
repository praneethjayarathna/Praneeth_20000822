object q5{
	def q5(n:Int, m:Int):Int={
		if(n>m)
			return 0;
		return n+q5(n+2,m);
	}
	def main(args:Array[String])={
		var n=2;
		println(q5(n,34));
	}
}