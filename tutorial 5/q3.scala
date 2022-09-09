object q3{
	def q3(n:Int):Int={
		if(n!=0){
			return n+q3(n-1);
		}else{
			return n;
		}
	}
	def main(args:Array[String])={
		println(q3(5));
	}
}