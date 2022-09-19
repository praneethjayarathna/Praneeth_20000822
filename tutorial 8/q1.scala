case class Point(a:Int,b:Int) {
	var x=a;
	var y=b;
	def add():Unit=
		println(x+y);

	def move(dx:Int,dy:Int):Unit=
		x=x+dx; y=y+dy;
		println(x+" "+y);

	def distance():Unit=
		if(x>=y){
			println(x-y);
		}else{
			println(y-x);
		}

	def invert():Unit=
		var z=x; x=y; y=z;
		println(x+" "+y);

}
object q1{
	def main(args:Array[String])={
		val e=Point(4,5);
		e.add(); 
		e.move(2,4);
		e.distance();
		e.invert(); 
	}
}