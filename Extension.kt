class Circle(val r:Double)
{
	fun area():Double
	{
		val PI=3.14
		return PI*r*r
	} 
}

fun main()
{
	fun Circle.newArea():Double
	{
		val PI=3.14
		return 2*PI*r
	}
	
	val ob=Circle(2.5)
	println("Area of Circle is : ${ob.area()}")
	println("Perimeter of Circle is : ${ob.newArea()}")
}
