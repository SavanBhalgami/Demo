open class parent
{
	fun showA()
	{
		println("Parent Class Method")
	}
}
class child:parent()
{
	fun showB()
	{
		println("Child Class Method")
	}
}

fun main()
{
	var obj=child()
	obj.showA()
	obj.showB()
}
