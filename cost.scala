object cost{
	def calcost(n:Int):Unit={
		var a=0.0;
		n>50 match{
			case true => a=(n-50)*0.75+(50*3);
			case false => a=n*3;
		}
		var totcost=((n*24.95)-(n*24.95*0.4))+a;
		println("Total wholesale cost is "+totcost);
	}
	def main(args:Array[String])={
		calcost(60);//enter the no of copies
	}
}