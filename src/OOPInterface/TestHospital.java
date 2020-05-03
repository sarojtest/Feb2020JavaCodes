package OOPInterface;

public class TestHospital {

	public static void main(String[] args) {

		
		FortisHospital fs = new FortisHospital();
		
		fs.cardioServices();
		fs.orthoServices();
		fs.emergencyServices();
		fs.medicalInsuranceServices();
		fs.virusVaccination();
		fs.pandemicServices();
		fs.polioServices();
		fs.birthControl();
		
		USMedical.bloodBank();
		System.out.println(USMedical.min_fee);		
		
		USMedical us = new FortisHospital();
		us.orthoServices();
		us.physioServices();
		us.NineOneOneServices();
		us.ENTServices();
		us.birthControl();
		
		
		IndianMedical im = new FortisHospital();
		im.pathologyServices();
		im.cardioServices();
		im.physioServices();
		im.oPTServices();
		
		
		
	}

}
