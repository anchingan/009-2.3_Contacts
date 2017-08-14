/*
 * Used to represent date data.
 */

public class CDate {
	private int year, month, day;
	
	//Constructor of this class, including assigning year, month and day.
	public CDate(int y, int m, int d) {
		this.setData(y, m, d);
	}
	
	//Method that can edit input data and allow constructor to call.
	public void setData(int y, int m, int d) {
		year = month = day = 1;
		if (y >= 1)
			year = y;
		if (m >= 1 && m <= 12)
			month = m;
		if (CDate.isValid(y, m, d) == true)
			day = d;
	}
	
	//Check if input date is valid and return result in boolean type.
	public static boolean isValid(int y, int m, int d) {
		//Use array to record valid days of each month.
		int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		//Year and month is not valid.
		if (y <= 0 || m <= 0 || m > 12)
			return false;
		
		//The month is not February.
		if (m != 2) {
			if (d <= 0 || d >= days[m])
				return false;
			return true;
		}
		
		//The month is February, check by year.
		//If the year is leap year.
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			if (d <= 0 || d > 29)
				return false;
			return true;
		}
		
		if (d <= 0 || d > 28)
			return false;
		return true;
	}
	
	//Allow the user to get value of year.
	public int getYear() {
		return year;
	}
	
	//Allow the user to get value of month.
	public int getMonth() {
		return month;
	}
	
	//Allow the user to get value of day.
	public int getDay() {
		return day;
	}
	
	//Compare two object of CDate and return negative number if the former is earlier than the latter,
	//                                return 0 if the compares are the same day and 
	//                                return positive number if the former is latter than the former.
	public static int compare(CDate a, CDate b) {
		if (a.year - b.year != 0)
			return (a.year - b.year);
		if (a.month - b.month != 0)
			return (a.month - b.month);
		
		return (a.day - b.day);
	}
	
	//Print date in specific form.
	public void print() {
		System.out.printf("%04d/%02d/%02d", this.year, this.month, this.day);
	}

}
