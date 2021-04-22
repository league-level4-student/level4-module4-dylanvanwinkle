package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private static int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private static float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private static String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private static Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public static int getItemsReceived(){
		return itemsReceived;
	}
	
	public static float getdegreesTurned(){
		return degreesTurned;
	}
	
	public static String getnomenclature(){
		return nomenclature;
	}
	
	public static Object getmemberObj(){
		return memberObj;
	}
	
	public static void setItemsReceived(int newValue) {
		if(newValue >= 0){
			itemsReceived = newValue;
		}else {
			itemsReceived = 0;
		}
	}
	
	public static void setdegreesTurned(float newValue){
	if (newValue >= 0 && newValue <= 360) {
		degreesTurned = newValue;
	}else {
		System.out.println("Degrees turned must be beetween 0 and 360.");
	} 	
	}
	
	public static void setnomenclature(String newValue){
	if (newValue != "") {
		nomenclature = newValue;
	}else {
		nomenclature = " ";
	}	
	}
	
	public static void setmemberObj(Object newValue){
		if (newValue instanceof String) {
			memberObj = new Object();
		}else {
			memberObj = newValue;
		}
	}
	
	public static void main(String[] args) {
		 
	}
}
