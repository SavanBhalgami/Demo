fun main()
{
	val a=10
	val b=20
	
	println("Enter operator +,-")
	val op=readLine()
	
	val res=when(op)
	{
		"+" -> a+b
		"-" -> a-b
		else -> "Invalid Operator"
	}
	println("Result = $res")
}
