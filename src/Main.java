import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int input = 0;
		boolean repeat = true;

		while(repeat) {

			System.out.println("Enter seed number");

			try {

				input = scan.nextInt();
				scan.nextLine();
				
				for (int i = 1; input > 1; i++) {
					
					if(input % 2 == 0) {
						input /= 2;
					} else {
						input = (input * 3) + 1;
					}
					
					System.out.println(i + ". " + input);
					
				}

				System.out.println();

			} catch (InputMismatchException exception) {
				System.err.println("That's not a number dumbass");
				scan.next();
			}
		}
	}

}
