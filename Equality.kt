class Demo(var name:String)
{

}

fun main()
{
	var m=Demo("Savan")
	var n=Demo("Savan")
	
	println("Referential Equality")
	println(m===n)
	println(m!==n)
	
	val a="Savan"
	val b="Savan"
	println()
	println("Structural Equality")
	println(a==b)
	println(a!=b)
}
