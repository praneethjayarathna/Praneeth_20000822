object Demo4{
	def main(args:Array[String])={
		var a=2; var b=3; var c=4; var d=5;
		var k=4.3f;
		println(--b * a + c *d--);//syntax error & not found error
		println(a++);//syntax error
		println (-2 * ( g - k ) +c);//not found error
		println (c=c++);//syntax error
		println (c=++c*a++);//syntax error & not found error
	}
}