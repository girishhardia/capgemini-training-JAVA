import java.util.Scanner;
class TicketSystem{
	public static void main(String[] args) {
		Scanner sc = Scanner(System.in);

		System.out.print("Enter ID - ");
		int pID = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter name - ");
		String name = sc.nextLine();

		System.out.print("Enter age - ");
		int age = sc.nextInt();

		if(age<5){
			System.out.println("No booking required");
			return;
		}else if(age>80){
			System.out.println("Medical clearence required");
			return;
		}

		System.out.print("Select Travel Type\n1. Bus\n2. Train\n3. Flight");
		int travelType = sc.nextInt();

		int bookingType;

		double baseFare,finalFare;


		switch(travelType){
		case 1:

		System.out.print("Select class of travel Type\n1. Sleeper\n2. Seater\n");
		bookingType = sc.nextInt();

		System.out.print("Enter base fare - ");
		baseFare = sc.nextInt();

			switch(bookingType){
			case 1:
				finalFare = baseFare * 1.2;
				break;
			
			case 2:
				finalFare = baseFare * 1.0;
				break;
			}
			break;
		

		case 2:

		System.out.print("Select class of travel Type\n1. General\n2. Sleeper\n3. AC");
		bookingType = sc.nextInt();

		System.out.print("Enter base fare - ");
		baseFare = sc.nextInt();

			switch(bookingType){
			case 1:
				finalFare = baseFare * 1.0;
				break;
			
			case 2:
				finalFare = baseFare * 1.3;
				break;

			case 3:
				finalFare = baseFare * 1.6;
				break;
			}
			break;

		case 3:

		System.out.print("Select class of travel Type\n1. Economy\n2. Business");
		bookingType = sc.nextInt();

		System.out.print("Enter base fare - ");
		baseFare = sc.nextInt();

			switch(bookingType){
			case 1:
				finalFare = baseFare * 2.5;
				break;
			
			case 2:
				finalFare = baseFare * 3.5;
				break;
			}
			break;
		}

	}
}