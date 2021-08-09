package myPackage;

public abstract class Salary
{
	public int pf(int basic)
	{
		return 12*basic/100;
	}
	
	public int hra(int basic)
	{
		return 40*basic/100;
	}
	
	public abstract int sa();
	
	
	public abstract int ta();
	
}

class MicrosoftSalary extends Salary{

	public int pf(int basic)
	{
		return 12*basic/100;
	}
	
	public int hra(int basic)
	{
		return 40*basic/100;
	}
	
	public int sa()
	{
		return 30000;
	}
	
	public int ta()
	{
		return 2450;
	}
}

class CognizantSalary
{

	public int pf(int basic)
	{
		return 12*basic/100;
	}
	
	public int hra(int basic)
	{
		return 40*basic/100;
	}
	
	public int sa()
	{
		return 40000;
	}
	
	public int ta()
	{
		return 4450;
	}
	
}

class InfosysSalary
{
	public int pf(int basic)
	{
		return 12*basic/100;
	}
	
	public int hra(int basic)
	{
		return 40*basic/100;
	}
	
	public int sa()
	{
		return 30000;
	}
	
	
}
