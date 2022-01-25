private class A
{
	private val a:Int=12 //Private
	
	fun display()
	{
		println("The value of a is : "+a)
	}
}

open class Demo
{
	protected val b=15 //Protected
	
}

class B:Demo() //Protected
{
	fun getvalue():Int
	{
		return b
	}
}

fun main()
{
	//Private
	var ob=A()
	ob.display()

	//Protected
	var obb=B()
	println("The value of b is : "+obb.getvalue())

}
