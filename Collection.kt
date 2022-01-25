fun main()
{
	println("Immutable Collection...")
	println("List Example")
	val lst=listOf("A","B","B")
	println(lst)
	
	println("\nSet Example")
	val st=setOf("A","B","B")
	println(st)
	
	println("\nMap Example")
	val mp=mapOf(0 to "A",1 to "B",2 to "C")
	println(mp)
	
	println("\nMutable Collection...")
	println("List Example")
	val mlst=mutableListOf("A","B","B")
	mlst[0]="B"
	mlst.add("C")
	for(item in mlst)
	{
        	println(item)
    	}
    	
    	println("\nSet Example")
    	val mst=mutableSetOf(1,1,2,3)
	mst.add(4)
	mst.add(5)
	for(item in mst)
	{
		println(item)
	}
	
	println("\nMap Example")
	val mmp=mutableMapOf(0 to "A",1 to "B")
	mmp.put(1,"Z") //Modify
	mmp.put(2,"C") //Add
	mmp.remove(1,"Z") //Remove
	for(item in mmp)
	{
		println(item)
	}
}
