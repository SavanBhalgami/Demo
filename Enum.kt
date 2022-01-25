enum class DAY
{
	Sunday,
	Monday,
}

fun main()
{
	for(day in DAY.values())
	{
		println("${day.ordinal} = ${day.name}")  //ordinal: start with zero index  //name: store the name of the constant
	}
	println()
	
	println("${DAY.valueOf("Sunday")}")   //valueOf: returns the define enum otherwise IllegalArgumentException

}
