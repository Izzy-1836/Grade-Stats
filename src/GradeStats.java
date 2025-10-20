import java.util.Scanner;

public class GradeStats {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] grades = new double[10];
		double sum = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		
		for (int i = 0; i < grades.length; i++) {
			System.out.print("Enter grade #" + (i + 1) + ": ");
			while (!input.hasNextDouble()) {
				System.out.println("Invaild input. Please enter a number.");
				input.next();
			}
			grades[i] = input.nextDouble();
			sum+= grades[i];
			
			if (grades[i] > max) {
				max = grades[i];
			}
			if (grades[i] < min) {
				min = grades[i];
			}
		}
		
		
			}
		}

	}

}
