object cipher{
	def encrypt(c:Char, key:Int, a:String):Char={//encryption function
		return a((a.indexOf(c.toUpper)+key)%a.size);
	}

	def decrypt(c:Char, key:Int, a:String):Char={//decryption function
		return a((a.indexOf(c.toUpper)-key)%a.size);
	}

	def cipher(func:(Char,Int,String)=>Char, s:String, key:Int, a:String):String={//cipher function
		return s.map(func(_,key,a));
	}

	def main(args:Array[String])={
		var al="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		var x=cipher(encrypt,"abcdef",1,al);
		println(x);
		var y=cipher(decrypt,x,1,al);
		println(y);
	}
}