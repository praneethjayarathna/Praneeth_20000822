object ST{
	def toUpper(a:String):String={
		var b=a.toUpperCase();
		return b;
	}

	def toLower(a:String):String={
		var b=a.toLowerCase();
		return b;
	}

	def func1(a:String):String={
		var b=a.toCharArray();
		b(0)=b(0).toUpper;
		b(1)=b(1).toUpper;
		var c=b.mkString("");
		return c;
	}

	def func2(a:String):String={
		var c= a.length();
		var b=a.toCharArray();
		b(c-1)=b(c-1).toUpper;
		var d=b.mkString("");
		return d;
	}
	
	def formatNames(name:String)(func:String=>String):String={
		return func(name);
	}

	def main(args:Array[String])={
		println(formatNames("Benny")(toUpper));
		println(formatNames("Niroshan")(func1));
		println(formatNames("Saman")(toLower));
		println(formatNames("Kumara")(func2));
	}
}