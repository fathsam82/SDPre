public class Objective8Lab2 {
	public static void main(String [] args) {
		int sum = 0;

		for(int count=1; count<=20; count++) {
			sum = count + sum;
		}
		System.out.println(sum);
	}
}