package assgnmnent4;

public class Lion {
	
	String name;
	boolean isHungry;
	int age;
	static int totalDeaths;
	
	static void printKillings()
	{
		System.out.println("total deaths in jungle = "+totalDeaths);
	}
	
	void thinking()
	{
		if(isHungry==false)
		{
			System.out.println("lion is sleeping");
		}
		
		else if(isHungry==true && age>12)
		{
			totalDeaths=totalDeaths+2;
			System.out.println( name+ " has killed two animals");
		}
		else if(isHungry==true && age>=2 && age <=12)
		{
			totalDeaths=totalDeaths+1;
			System.out.println(name+" has killed one animal");
		}
		else if(isHungry==true && age<2)
		{
			System.out.println( name+" is calling mom");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion l1=new Lion();
		l1.name="Lion1";
		l1.isHungry=true;
		l1.age=14;
		l1.thinking();
		
		Lion l2=new Lion();
		l2.name="Lion2";
		l2.isHungry=true;
		l2.age=10;
		l2.thinking();
		
		Lion l3=new Lion();
		l3.name="Lion3";
		l3.isHungry=true;
		l3.age=1;
		l3.thinking();
		
		printKillings();
		
		Lion l4=new Lion();
		l4.isHungry=false;
		l4.thinking();
				

	}

}
