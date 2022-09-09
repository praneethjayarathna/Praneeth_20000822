object prime2{
	def prime2(n:Int, m:Int):Boolean={
		if(m==n){
			return false;
		}else{
			if(m%n==0){
				return true;
			}else{
				return prime2(n+1,m)
			}
		}
			
	}
	def main(args:Array[String])={
		var a=19;
		var n=0;
		for(n<-2 to a)
			if(prime2(2,n)==false)
				print(n+" ");
	}
}