import kotlin.math.*

fun mul(a:Int,b:Int)
{
	val c=a*b
	println("Multiplication of $a * $b is : $c") 
}

fun main()
{
	println("Standard Library Function")	
	
	//sum Function
	val a=arrayOf(1,2,3,4,5).sum()
	println("Sum of the array is : $a")
	
	//compareTo Function
	val b:String="Demo"
	val c:String="Demo"
	println(b.compareTo(c))
	
	//min & max Function
	val x=10
	val y=20
	println("Min is : ${min(x,y)}")
	println("Max is : ${max(x,y)}")
	
	//sqrt Function
	val d:Double=25.0
	println("Square Root of $d is : ${sqrt(d)}")
	
	println("\nUser Defined Function")
	mul(5,5) 
		
}
