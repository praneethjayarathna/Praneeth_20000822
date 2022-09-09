object q6{
	def q6(n:Int):Int={
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			return (q6(n-1)+q6(n-2));
		}
	}
	def main(args:Array[String])={
		var a=0;
		var b=0;
		var n=5;
		for(b<-1 to n){
			print(q6(a)+" ");
			a=a+1;
		}
	}
}