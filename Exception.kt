fun main()
{
	try
	{
		var num = 10 / 0  
	}
	catch(e:Exception)
	{
		println(e)
	}
	finally
	{
		println("I am Finally Block")
	}
}

