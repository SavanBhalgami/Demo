class A
{
	fun sum(a:Int,b:Int)
	{
		val c=a+b
		println("The sum of two number $a + $b is : $c")
	}
		
	fun sum(x:Int,y:Int,z:Int)
	{
		val d=x+y+z
		println("The sum of three number $x + $y + $z is : $d")
	}
}

fun main()
{
	val obj=A()
	obj.sum(5,10)
	obj.sum(10,5,5)
}
