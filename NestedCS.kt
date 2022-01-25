class Mclass
{
	val str="Outer Class"
	class Nclass
	{
		class Inner
		{
			val st="I am Inner Sub Class"
		}
		val n="Inner Class"
		fun show()
		{
			println("This is Inner Class Method")
		}
	}
}

fun main()
{
	println(Mclass().str)
	println(Mclass.Nclass().n)
	var ob=Mclass.Nclass()
	ob.show()
	println(Mclass.Nclass.Inner().st)
}
