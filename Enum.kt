enum class DAY
{
	Sunday,
	Monday,
}

fun main()
{
	for(day in DAY.values())
	{
		println("${day.ordinal} = ${day.name}")  
	}
	println()
	
	println("${DAY.valueOf("Sunday")}")   

}
