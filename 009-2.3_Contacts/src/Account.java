/*
 * Used to store data of contact.
 * 
 */

public class Account {
	private String name = new String("");
	private int age = 0;
	private CDate birthday = new CDate(1, 1, 1);
	
	//Constructor of Account including all data.
	public Account(String n, int a, CDate b) {
		this.setData(n, a, b);
	}
	
	//Method that can be called to edit data.
	public void setData(String n, int a, CDate b) {
		if (n != null)
			name = n;
		if (a > 0)
			age = a;
		if (b != null)
			birthday = b;
	}
	
	//Get name of this object.
	public String getName() {
		return name;
	}
	
	//Get age of this object.
	public int getAge() {
		return age;
	}
	
	//Get birthday of this object.
	public CDate getBirthday() {
		return birthday;
	}

}
