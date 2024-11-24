public class Act1_Zabala{//modified act 1
	public static void main(String[] args) {
		String Question[] = {
			"Employee's Name:", "Age:","Employee Id:",
			"Position:","Salary:","Nature of Employment:",
			"Employer:","Employer Address:","Data started:"
		};
		int Age = 19, 
			Id = 221002368;
		float Salary = 24560;
		boolean nature = true;
		String 	Da1 = "Kurt Gabrielle B. Zabala",
				Da2 = "Jr Developer",
				Da3 = "Manila World Security",
				Da4 = "Cavite, Philippines",
				Date = "12/12/53";

		for(int i = 0; i<Question.length;i++){
			System.out.print(Question[i] + " ");
			switch(i){
				case 0:
					System.out.print(Da1);
					break;
				case 1:
					System.out.print(Age);
					break;
				case 2:
					System.out.print(Id);
					break;
				case 3:
					System.out.print(Da2);
					break;
				case 4:
					System.out.print(Salary +" Php");
					break;
				case 5:
					if(nature){
						System.out.print("Regular");
					}else{
						System.out.print("COS");
					}
					break;
				case 6:
					System.out.print(Da3);
					break;
				case 7:
					System.out.print(Da4);
					break;
				case 8:
					System.out.print(Date);
					break;
			}
			System.out.print("\n");
		}
	}
}