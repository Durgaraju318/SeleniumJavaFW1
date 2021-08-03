package Demo;

public class ExceptionhandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		
		
		System.out.println("Hello World");
		int i=1/0;
		System.out.println("Completed");
		}
		catch(Exception exp)
		{
			
			System.out.println("I am in catch");
			System.out.println("Message is : "+exp.getMessage());
			System.out.println("Message is : "+exp.getCause());
			exp.printStackTrace();

			
		
		}

	finally {
		
		System.out.println("I am in finally block");
		
	}
	
	}

}
