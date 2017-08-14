/*
 * Practice 009-2.3_Contact 
 * Date 20170814
 */

public class ContactTest {

	public static void main(String[] args) {
		CDate d1 = new CDate(2011, 2, 29);
		CDate d2 = new CDate(-5, 1 ,3);
		CDate d3 = new CDate(2011, 13, 1);
		
		d1.print();
		System.out.println();
		d2.print();
		System.out.println();
		d3.print();
		System.out.println();
		
		int result1 = CDate.compare(d1, d2);
		int result2 = CDate.compare(d2, d3);
		System.out.println(result1);
		System.out.println(result2);
		
		CDate b1 = new CDate(1977, 6, 27);
		Account u1 = new Account("Joe", 40, b1);
		CDate b2 = new CDate(1987, 4, 30);
		Account u2 = new Account("Mary", 30, b2);
		System.out.print(u1.getName()+" "+u1.getAge()+" ");
		u1.getBirthday().print();
		System.out.println("");
				
		System.out.print(u2.getName()+" "+u2.getAge()+" ");
		u2.getBirthday().print();
		System.out.println("");

	}

}
