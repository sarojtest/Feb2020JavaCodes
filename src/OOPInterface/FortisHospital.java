package OOPInterface;

public class FortisHospital extends WHO implements USMedical, UKMedical, IndianMedical {
	
	
	@Override
	public void FDA(){
		System.out.println("FDA services");
	}
	
	@Override
	public void birthControl() {
		System.out.println("FS -- birthControl");
	}

	@Override
	public void orthoServices() {
		System.out.println("FS -- orthoServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FS -- physioServices");
	}

	@Override
	public void NineOneOneServices() {
		System.out.println("FS -- NineOneOneServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("FS -- ENTServices");

	}

	@Override
	public void emergencyServices() {
		System.out.println("FS -- emergencyServices");

	}

	@Override
	public void oncologyServices() {
		System.out.println("FS -- oncologyServices");

	}

	@Override
	public void pathologyServices() {
		System.out.println("FS -- pathologyServices");

	}

	@Override
	public void oPTServices() {
		System.out.println("FS -- oPTServices");

	}

	@Override
	public void cardioServices() {
		System.out.println("FS -- cardioServices");
	}

	// non override methods:
	public void gynecServices() {
		System.out.println("FS -- gynecServices");

	}

	public void medicalInsuranceServices() {
		System.out.println("FS -- medicalInsuranceServices");

	}

	public void nueroServices() {
		System.out.println("FS -- nueroServices");

	}

}
