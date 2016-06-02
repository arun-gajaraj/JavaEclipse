package ocajp_study;

public class ExceptionsOC {
	
	public float parseFloat(String s) {
		float f= 0.0f;
		
		try{
			f= Float.valueOf(s).floatValue();
			return f;
			
		}
		catch(NumberFormatException e){
			e.printStackTrace();
		}
//		finally{
//			f=10.0f;
//			return f;
//		}
		return f;
		} 

	public static void main(String[] args) throws RuntimeException
//	throws Throwable 
	{
	
		
		System.out.println(new ExceptionsOC().parseFloat("0.0"));
		
		
		String strArray [] = new String[3];
		
	strArray [0] = "Hello";
	strArray [1] = "There";
	
	
	for (String s : strArray) {
		System.out.println(s); //Prints strArray[2] as null
	}
		System.out.println(strArray[0].length());
//		System.out.println(strArray[2].length()); //NullPointer Exception
//		System.out.println(strArray[3]);	//ArrayOutofBounds Exception
		
		
		
//		try {
//			
//			throw new Exception("thrown ha ha!"); } //Checked Excp. Must be handled or declared	
//		catch (RuntimeException e) {	//Less hierarchical exceptions first.
//			e.printStackTrace();
//		} catch (Exception e){
//			e.printStackTrace(); 
////			System.exit(0); //Exits. stops everything
//		} finally {
//			System.out.println("Finally block");  //Always Executed
//		}
		
//		Object obj = new Integer(4);
//		String str = (String) obj;
		System.out.println( );
	
		
		
	}

}
