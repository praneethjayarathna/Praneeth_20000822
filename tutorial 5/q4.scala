object q4{
	def q4(n:Int):Boolean={
		if(n==0){
			return true;
		}else if(n==1){
			return false;
		}else if(n<0){
			return q4(-n);
		}else{
			return q4(n-2);
		}
	}
	def main(args:Array[String])={
		if(q4(-3)){
			println("Even");
		}else{
			println("Odd");
		}
	}
}