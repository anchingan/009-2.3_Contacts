/*
 * Used to store contact data.
 */
public class Contacts {
	//Used to store account data.
	private Account[] accounts = new Account[50];
	//Used to count number of input data.
	private int count = 0;
	
	public Contacts() {
		
	}
	
	//Add new data into array.
	public void add(String name, int age, CDate birthday) {
//		accounts[count].setData(name, age, birthday);  //incorrect way!

		//Create new object of Account.
		Account newAccount = new Account(name, age, birthday);
		
		//If number of input is more than array size.
		if (this.count >= accounts.length)
			this.resize();

		//Store this new object into array.
		this.accounts[this.count++] = newAccount;
		
	}
	
	//Print out all data.
	public void print() {
		for (int i = 0; i < count; i++) {
			Account person = this.accounts[i];
			String name = person.getName();
			int age = person.getAge();
			CDate birthday = person.getBirthday();
			System.out.printf("%2d%10s", i + 1, name);
			System.out.printf("%5d", age);
			System.out.print("  ");
			birthday.print();
			System.out.println("");
		}
	}
	
	//Resize store array when number of inputs is more than array size.
	private void resize() {
		//Regenerate an array which size is twice of the original one.
		Account[] newArray = new Account[accounts.length * 2];
		
		//Copy data of original one to new array.
		for (int i = 0; i < this.count; i++) 
			newArray[i] = this.accounts[i];
		
		this.accounts = null;
		this.accounts = newArray;
		
	}
}
