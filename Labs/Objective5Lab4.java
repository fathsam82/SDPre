import java.util.Scanner;

public class Objective5Lab4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int isModNum = scanner.nextInt();

		if (isModNum % 2 == 0) {
			System.out.println("The number is even");
		}
		else if (isModNum % 2 ==1) {
			System.out.println("The number is odd");
		}

		scanner.close();
	}
}