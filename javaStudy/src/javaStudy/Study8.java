package javaStudy;

public class Study8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		
		for(i = 1; i <= 5; i++)
		{
			for(j = 1; j <= 5 - i; j++)
			{
				System.out.print("��");
			}
			for(j = 1; j <= 2 * (i - 1) + 1; j++)
			{
				System.out.print("��");
			}
			for(j = 1; j <= 5 - i; j++)
			{
				System.out.print("��");
			}
			
			System.out.println();
		}
		for(i = 1; i <= 4; i++)
		{
			for(j = 1; j <= i; j++)
			{
				System.out.print("��");
			}
			for(j = 1; j <= (5 - i)* 2 - 1; j++)
			{
				System.out.print("��");
			}
			for(j = 1; j <= i; j++)
			{
				System.out.print("��");
			}
			System.out.println();
		}
	}

}
