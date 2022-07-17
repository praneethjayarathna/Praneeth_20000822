object volume{
	def calvolume(r:Int):Double={
		var vol=(4/3)*3.14*r*r*r;
		return vol;
	}
	def main(args:Array[String])={
		println("Volume is "+calvolume(5));//enter the radius
	}
}