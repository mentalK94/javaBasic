package streamTest;

public class Customer {

	private int id;
	private String name;
	private int age;
	private int cost;
	
	public Customer(int id, String name, int age, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getCost() {
		return cost;
	}
	
	public String info() {
		return "이름 : "+name+", 나이 : "+age+", 비용 : "+cost;
	}
}
