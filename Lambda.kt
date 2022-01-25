fun main()
{
	val sum={a:Int,b:Int -> a+b} //Lambda Expression
	println("Addition is :- ${sum(5,5)}")
	
	val ob:(Int,Int)->Int = {a,b-> a*b} //Lambda Expression
	val res=ob(5,5)
	println("Multiplication is :- $res")
}
