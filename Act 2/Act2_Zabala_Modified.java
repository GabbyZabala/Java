import java.util.Scanner;

public class Act2_Zabala_Modified {
	public static void main(String[] args) {
		try (Scanner lin = new Scanner(System.in);) {
			String[] Details = { "Year", "Month", "Day" };
			int[] input = new int[3];
			boolean trap = false;
			for (int i = 0; i < Details.length; i++) {
				System.out.print("Enter " + Details[i] + ": ");
				int console = lin.nextInt();
				switch (i) {
					case 1:
						if (console < 1 || console > 12)
							trap = true;
						else
							input[i] = console;
						break;
					case 2:
						if (console < 1 || console > 31)
							trap = true;
						else
							input[i] = console;
						break;
					default:
						input[i] = console;
						break;
				}
				if (trap) {
					System.out.println("Invalid " + Details[i]);
					break;
				}
			}
			String monthNmae = "";
			switch (input[1]) {
				case 1:
					monthNmae = "January";
					break;
				case 2:
					monthNmae = "February";
					break;
				case 3:
					monthNmae = "March";
					break;
				case 4:
					monthNmae = "April";
					break;
				case 5:
					monthNmae = "May";
					break;
				case 6:
					monthNmae = "June";
					break;
				case 7:
					monthNmae = "July";
					break;
				case 8:
					monthNmae = "August";
					break;
				case 9:
					monthNmae = "September";
					break;
				case 10:
					monthNmae = "October";
					break;
				case 11:
					monthNmae = "November";
					break;
				case 12:
					monthNmae = "December";
					break;
			}
			String Dayish;
			int day = input[2];
			if (day == 1 || day == 11 || day == 21 || day == 31)
				Dayish = "st";
			else if (day == 2 || day == 12 || day == 22)
				Dayish = "nd";
			else if (day == 3 || day == 13 || day == 23)
				Dayish = "rd";
			else
				Dayish = "th";
			if (!trap) {
				System.out.println("It is the " + day + Dayish + " day of " + monthNmae + " " + input[0] + "!");
			}
		}
	}
}