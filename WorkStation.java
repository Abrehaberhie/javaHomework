package constructures;

public class WorkStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new Phone();
		p.color="red";
		Phone p1= new Phone("blue","samsung","xx",345);
		
		System.out.println(p1.model);
		System.out.println(p1.mygfyear);
		System.out.println(p1.os);
		
		System.out.println(p.color);
		System.out.println(p1.color);
		p.method1();
		Phone.method1();
	
	}

}
