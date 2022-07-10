object Demo3{
	def main(args:Array[String])={
		var j=10; var i=j; var k=i;
		var n=5; var m=n;
		var f=12.0f; var g=4.0f;
		var c='X';
		println(k+12*m); println(m/j); println(n%j);
		println(m/j*j); println(f+10*5+g); 
		println(++i*n); //syntax error & not found error
	}
}