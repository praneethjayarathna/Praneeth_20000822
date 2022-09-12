class Account(a:String,b:Double) {
	def name=a;
	def balance=b;
}
object q4{
	var acc = new Array[Account](3);
	def neg():Unit={
		for(i<- 0 to 2){
			if(acc(i).balance<0)
				println(acc(i).name);
		}
	}
	def sum():Unit={
		var sum=0;
		for(i<- 0 to 2){
			sum=sum+acc(i).balance;
		}
		println(sum);
	}
	def inter():Unit={
		var fin=0;
		for(i<- 0 to 2){
			if(acc(i).balance<0){
				fin=(acc(i).balance*0.1)+acc(i).balance;
				print(fin);
			}else{
				fin=(acc(i).balance*0.05)+acc(i).balance;
				print(fin);
			}
		
		}
	}
	def main(args:Array[String])={
		
		val acc(0) = new Account("a1",1000);
		val acc(1) = new Account("a2",-1000);
		val acc(2) = new Account("a3",2000);
		neg();sum();
	}
}