package JavaSessions;

public class StringManipulations {

	public static void main(String[] args) {

		String str = "This is my first java code and i am so happy";
		
		System.out.println("length = "+ str.length());
		System.out.println("li = " + 0);
		System.out.println("hi = " + (str.length()-1));
		
		System.out.println(str.charAt(3));
		//System.out.println(str.charAt(44));//StringIndexOutOfBoundsException

		System.out.println(str.indexOf('T'));
		System.out.println(str.indexOf('s'));//1st occurrence of s
		
		System.out.println(str.indexOf('s', str.indexOf('s')+1));//2nd occurrence of s

		System.out.println(str.indexOf("java"));
		
		System.out.println(str.indexOf("hello"));//-1
		
		String welcome = "welcome admin";
		
		if(welcome.indexOf("admin")>0){
			System.out.println("admin is present in String");
		}
		else{
			System.out.println("admin is not present in String");
		}
		
		//trim:
		String s = "     hello world   ";
		System.out.println(s.trim());
		
		String s1 = "   hello java    ";
		//System.out.println(s1.trim().replace(" ", ""));
		System.out.println(s1.replace(" ", ""));
		
		String dob = "10-10-1970"; //10/10/1970
		System.out.println(dob.replace("-", "/"));
		
		//comparison:
		String browser = "chrome";
		String browser1 = "Chrome";
		
		System.out.println(browser.equals(browser1));
		System.out.println(browser.equalsIgnoreCase(browser1));

		//contains:
		String mesg = "    Welcom to Java World   ";
		
		System.out.println(mesg.trim().contains("Java"));
		
		String mesg1 = mesg.trim();
		System.out.println(mesg1);
		System.out.println(mesg1.contains("Java"));
		
		if(mesg.trim().contains("Java")){
			System.out.println("Java is found");
		}
		
		//split:
		String lang = "Java;Python;Ruby;JavaScript";
		
		String langVal[] = lang.split(";");
		
		System.out.println(langVal.length);
		
		for(int i=0; i<langVal.length; i++){
			System.out.println(langVal[i]);
		}
		
		System.out.println("-------");
		String name = "xXtestxxXjavaXxXselenium";
		String nameArr[] = name.split("xX");
		
		for(int i=0; i<nameArr.length; i++){
			System.out.println(nameArr[i]);
		}
		System.out.println("-------");

		//split in Selenium for test data:
		String userData = "Tom;steve;tom@gmail.com;test@123;99999;London";
		System.out.println(userData.split(";")[0]);
		System.out.println(userData.split(";")[1]);
		System.out.println("-------");

		
		//cases:
		String value = "this is java world";
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());
		
		
		//subString:
		String message = "your transaction id is 12345";
		//System.out.println(message.substring(0, 10));
		System.out.println(message.indexOf("is"));
		String trID = message.substring( message.indexOf("is")+3, message.length());
		System.out.println(trID);
		
		
		
		
	}

}
