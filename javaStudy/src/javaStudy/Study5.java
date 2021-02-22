package javaStudy;

public class Study5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height = 1.60;
		double weight = 80;
		double BMI = weight / (height * height);
		
		System.out.printf("身長は%.2f%n", height);
		System.out.printf("体重は%.2f%n", weight);
		System.out.printf("BMIは%.2f%n", BMI);
		
		if (BMI >= 25.00)
		{
			System.out.println("肥満");
		}
		else if (18.50<= BMI)
		{
			System.out.println("標準");
		}
		else if (18.50 > BMI)
		{
			System.out.println("低体重");
		}
		
		
		
	}
}
