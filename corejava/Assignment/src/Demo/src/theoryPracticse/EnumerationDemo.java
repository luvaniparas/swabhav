package theoryPracticse;

enum WeekDays {
	sun, mon, tues, wed, thurs, fri, sat
}

class EnumerationDemo {
	public static void main(String args[]) {
		WeekDays wk = WeekDays.sun;
		System.out.println("Today is " + wk);
	}
}
