interface del
{
	fun show()
}

class Demo(val a:String):del
{
	override fun show()
	{
		println(a)
	}
}

class newDemo(b:del):del by b
{
	override fun show()
	{
		println("Hello")
	}
}

fun main()
{
	val ob=Demo("How Are You?")
	newDemo(ob).show()
}
