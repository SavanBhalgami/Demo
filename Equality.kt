class Demo(var name:String)
{

}

fun main()
{
	var m=Demo("ABC")
	var n=Demo("ABC")
	
	println("Referential Equality")
	println(m===n)
	println(m!==n)
	
	val a="DEF"
	val b="DEF"
	println()
	println("Structural Equality")
	println(a==b)
	println(a!=b)
}
