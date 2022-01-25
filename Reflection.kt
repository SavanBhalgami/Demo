fun main()
{
	fun Positive(a:Int) = a>0
	
	val lst= listOf(-10,20,30,-40,50,60)
	println(lst.filter(::Positive))
}
