package OOPInterface;

public interface USMedical extends GHC{
	
	int min_fee = 10;//final and static

	public void orthoServices();
	
	public void physioServices();
	
	public void NineOneOneServices();
	
	public void ENTServices();
	
	//100% abstraction -- all methods are abstract in nature
	
	
	//after JDK 1.8: method body is allowed in Interface:
	
	//static method is allowed with method body:
	
	public static void bloodBank(){
		System.out.println("US -- blood bank");
	}
	
	//default method:
	default void FDA(){
		System.out.println("US -- FDA");
	}
	

}
