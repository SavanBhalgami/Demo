class A
{
	var name:String=""
	
	get() = field
	
	set(value)
	{
		field=value
	}
}

fun main()
{
	val ob=A()
	ob.name="Demo"
	println("Name is : ${ob.name}")
}
