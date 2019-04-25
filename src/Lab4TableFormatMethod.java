import java.util.Scanner;
public class Lab4TableFormatMethod {
	
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);

			String repeat = null;

			do {
				System.out.println("Please enter a number");
				int num = scan.nextInt();

				// set left justified
				System.out.printf("%-10s | %-12s | %-12s|\n", " Numbers", " Squared", " Cubed");
				System.out.printf("-----------------------------------------------\n");

				for (int i = 0; i <= num; i++) {
					System.out.printf("%6s\n", (i));
					System.out.printf("%18s\n", square(i));
					System.out.printf("%33s\n", cubed(i));
				}

				System.out.println();
				System.out.println("Would you like to enter another number? (yes/no)");
				repeat = scan.next();

			} while (repeat.equalsIgnoreCase("yes"));
			System.out.println("goodbye.");

		}

		public static int square(int num) {
			return (num * num);
		}

		public static int cubed(int num) {
			return ((num * num) * num);
		}

	}


