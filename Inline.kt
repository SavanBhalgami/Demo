fun main()
{
	inFun{ println("Calling Inline Function") }
}

inline fun inFun(fn:()->Unit)
{
	fn()
	println("Code Inside Inline Function")
}
