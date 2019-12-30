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
		System.out.println("이름 : " + this.name);
		System.out.println("학번 : " + this.id);
		System.out.println(this.university+"대학교");
		if(isInteger(this.graduation)) {
			System.out.println("졸업여부 : " + this.graduation+"학년 (재학 중)");
		} else {
			System.out.println("졸업여부 : " + this.graduation);
		}
		
	}
	
	// string값이 숫자인지 아닌지 확인
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
