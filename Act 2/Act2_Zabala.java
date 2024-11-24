Import java.util.Scanner;
public class Act2_Zabala{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int years = input.nextint();
		system.out.println("Enter Year: "+years);
		int month = input.nextint();
		system.out.println("Enter Month: "+month);
		boolean askmonth = true, askday =true;
		string monthNmae,dayNmae;
		switch(month){
			case 1:
				monthNmae = "January";
				if(day )
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
			default:
				monthNmae = "Invalid month.";
				break;
		}
		if(askmonth){
			system.out.println("Enter Days: "+days);
			if(days>31){
				switch(days){
					case 1:
						dayName = "1st";
						break;
					case 2:
						dayNmae = "2nd";
						break;
					c
				}
				system.out.println("It is the"+ dayNmae + "Day of "+ monthNmae + " " + years);
			}else{
				system.out.println("Invalid day");
			}

		}else{
			System.out.println(monthNmae);
		}
	}
}