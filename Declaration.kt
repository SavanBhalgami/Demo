data class demo(val enno:Int,val name:String,val age:Int)

fun showData():demo
{
	return demo(1,"DEMO",21)
}

fun main()
{
	val (enno,name,age) = showData()  //Destructuting Declartions
	println("Enrollment No is : $enno")
	println("Name is : $name")
	println("Age is : $age")
}
