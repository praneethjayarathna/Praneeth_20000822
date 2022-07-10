object tick{
	def caltick(a:Int):Double={
		if(a>15){
			var b=a-15;
			var tot_atten=120-4*b;
			var tot_cost=500+tot_atten*3;
			var profit=(a*tot_atten)-(tot_cost);
			return profit;
		}
		else if(a<15){
			var b=15-a;
			var tot_atten=120+4*b;
			var tot_cost=500+tot_atten*3;
			var profit=(a*tot_atten)-(tot_cost);
			return profit;
		}
		else{
			var tot_atten=120;
			var tot_cost=120*3+500;
			var profit=(a*tot_atten)-(tot_cost);
			return profit;
		}
	}
	def main(args:Array[String])={
		println("Profit = "+caltick(20));//enter the price of the ticket
	}                                                  
}