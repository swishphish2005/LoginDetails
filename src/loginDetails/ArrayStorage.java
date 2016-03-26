package loginDetails;

import java.util.ArrayList;

public class ArrayStorage {

	private static ArrayList<String> studentUserNames = new ArrayList<String>();
	
	private static ArrayList<String> studentPasswords = new ArrayList<String>();
	
	private static ArrayList<String> staffUserNames = new ArrayList<String>();
	
	private static ArrayList<String> staffPasswords = new ArrayList<String>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void setArrayStudentUserNameValues(){
		studentUserNames.add("Paul");
		studentUserNames.add("Jessica");
		studentUserNames.add("Michael");
		studentUserNames.add("Connor");
		studentUserNames.add("David");
	}
	
	public void setArrayStudentPasswordValues(){
		studentPasswords.add("Tummon");
		studentPasswords.add("Black");
		studentPasswords.add("Clarke");
		studentPasswords.add("Beardy");
	}
	
	public ArrayList<String> getArrayUserNameValues(){
		return studentUserNames;
	}
	
	public ArrayList<String> getArrayPasswordValues(){
		return studentPasswords;
	}
	
	public void setArrayStaffUserNames(){
		staffUserNames.add("Aidan");
		staffUserNames.add("Ian");
		staffUserNames.add("Kim");
		staffUserNames.add("Joe");
		
	}
	
	
	public void setArrayStaffPasswords(){
		staffPasswords.add("McGowan");
		staffPasswords.add("McKiltock");
		staffPasswords.add("Swedish");
		staffPasswords.add("Android");
	}
	
	public ArrayList<String> getArrayStaffUserNames(){
		
		return staffUserNames;
	}
	
	public ArrayList<String> getArrayStaffPasswords(){
		
		return staffPasswords;
	}
	
}
