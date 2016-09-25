package quiz2;
import java.util.Scanner;
public class Tuition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the initial tuition cost");
		double Base = input.nextDouble();
		System.out.println("Enter the percentage increase");
		double Percentage = input.nextDouble();
		double total = Base;
		double  new_base = Base;
		int count = 0;
		while (count <3){
			new_base = ((new_base)*(1+Percentage));
			total = total + new_base;
			count++;
		}
		System.out.printf("Your tuition for four years is $%.2f ", total);
		input.close();
	}
}
