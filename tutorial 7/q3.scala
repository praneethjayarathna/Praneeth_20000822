class Account(a:String,b:Double) {
	def name=a;
	var balance=b;
	def transfer(x:Account,b:Double):Unit=
		x.balance=x.balance+b;
		balance=balance-b;
	
}
object q3{
	def main(args:Array[String])={
		val x = new Account("a1",1000);
		val y = new Account("a2",1000);
		x.transfer(y,500);
		println(y.balance);
		println(x.balance);
	}
}