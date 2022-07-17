object time{
	def pacetime(d1:Int):Double={
		var time1=d1*8;
		return time1;
	}
	def tempotime(d2:Int):Double={
		var time2=d2*7;
		return time2;
	}
	def tottime(t1:Double,t2:Double,t3:Double):Double={
		var tot=t1+t2+t3;
		return tot;
	}
	def main(args:Array[String])={
		var a=pacetime(2);
		var b=tempotime(3);
		var c=pacetime(2);
		println("Total running time is "+tottime(a,b,c)+" min");
	}
}