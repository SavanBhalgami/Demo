sealed class Demo
{
	class A:Demo()
	{
		fun display()
		{
			println("Subclass A of sealed class Demo")
		}
	}
	
	class B:Demo()
	{
		fun display()
		{
			println("Subclass B of sealed class Demo")
		}
	}
}

fun main()
{
	val ob=Demo.A()
	ob.display()
	
	val obb=Demo.B()
	obb.display()
	
}
