class Event<T>(text:T)
{
	var a=text
	init
	{
		println(a)
	}
}

fun main()
{
	var name: Event<String> = Event<String>("Demo")
	var rank: Event<Int> = Event<Int>(12)
}
