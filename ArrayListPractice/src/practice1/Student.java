package practice1;

public class Student {

	private String name;
	private String id;
	private String graduation;
	private String university;

	public Student(String name, String id, String graduation, String university) {
		super();
		this.name = name;
		this.id = id;
		this.graduation = graduation;
		this.university = university;
	}
	
	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getGraduation() {
		return graduation;
	}

	public String getUniversity() {
		return university;
	}
	
	public void getInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.println("�й� : " + this.id);
		System.out.println(this.university+"���б�");
		if(isInteger(this.graduation)) {
			System.out.println("�������� : " + this.graduation+"�г� (���� ��)");
		} else {
			System.out.println("�������� : " + this.graduation);
		}
		
	}
	
	// string���� �������� �ƴ��� Ȯ��
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    } catch(NullPointerException e) {
	        return false;
	    }
	    return true;
	}
}
