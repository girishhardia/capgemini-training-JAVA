import java.util.Scanner;
public class SwitchCase2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day you want to know about - ");
		String day = sc.nextLine();

		switch (day){
		case "monday":
			System.out.println("Named after Tiw, the Norse god of single-combat and law. It originates from the Old English Tīwesdæg, corresponding to the Roman \"Day of Mars.\"");
			break;
		case "tuesday":
			System.out.println("Named after Tiw, the Norse god of single-combat and law. It originates from the Old English Tīwesdæg, corresponding to the Roman \"Day of Mars.\"");
			break;

		}
	}
}