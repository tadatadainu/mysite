package javaStudy;

public class Study5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height = 1.60;
		double weight = 80;
		double BMI = weight / (height * height);
		
		System.out.printf("�g����%.2f%n", height);
		System.out.printf("�̏d��%.2f%n", weight);
		System.out.printf("BMI��%.2f%n", BMI);
		
		if (BMI >= 25.00)
		{
			System.out.println("�얞");
		}
		else if (18.50<= BMI)
		{
			System.out.println("�W��");
		}
		else if (18.50 > BMI)
		{
			System.out.println("��̏d");
		}
		
		
		
	}
}
