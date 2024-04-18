package constructures;

public class Phone {
	String color;
	String model;
	String os;
	int mygfyear;
	
	
	
	
	//parameterized constructure
	public Phone(String mycolor,String inputmodel, String myos, int xxmfgyear)
	{
		color=mycolor;
		model=inputmodel;
		os=myos;
		mygfyear =xxmfgyear;
	//If we want to indicate the parameters are belongs to the current class we can 
	//use the following .	
		//this.color=mycolor;
		//this.model=inputmodel;
		//this.os=myos;
		//this.mygfyear =xxmfgyear;
	}
	// default constructure.
  public Phone()
  {
	  
  }
  
  public static void method1()
  {
	  method2();
	  System.out.println("method one");
  }
  private static void method2()
  {
	  method3();
	  System.out.println("method two");
  }
  private static void method3()
  {
	  method4();
	  System.out.println("method three");
  }
  private static void method4()
  {
	 method5();
	  System.out.println("method four");
  }
  private static void method5()
  {
	  System.out.println("method five");
  }

	

}
