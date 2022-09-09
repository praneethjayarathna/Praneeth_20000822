object prime{
	def prime(n:Int, m:Int):Boolean={
		if(n<=2){
			if(n==2){
				return true;
			}else{
				return false;
			}
		}
		if(n%m==0)
			return false;
		if(m*m>n)
			return true;
		return prime(n,m+1)
	}
	def main(args:Array[String])={
		if(prime(27,2)){
			println("true");
		}else{
			println("false");
		}
	}
}