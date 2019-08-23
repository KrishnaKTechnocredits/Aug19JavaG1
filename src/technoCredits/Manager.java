package technoCredits;

class Manager
{
	int x = 10;
	String name = "Maulik";
	
	void m1()
	{
		System.out.println("In m1");
		m2();
	}
	
	static void m2()
	{
		System.out.println("In m2");
		Manager manager = new Manager();
		manager.m3();
	}

	static void m3()
	{
		System.out.println("In m3");
		//m1();
	}
}