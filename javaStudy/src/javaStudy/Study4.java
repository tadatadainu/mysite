package javaStudy;

public class Study4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -501;
		
		if (i > 0)
		{
			if (i % 2 == 1)
			{
				System.out.println(i + "�͐��̊");
			}
			else if(i % 2 == 0)
			{
				System.out.println(i + "�͐��̋���");;
			}
			
		}
		else if (i == 0)
		{
			System.out.println(0);
		}
		else
		{ 
			if (i % -2 == -1)
			{
				System.out.println(i + "�͕��̊");
			}
			else if (i % -2 == 0)
			{
				System.out.println(i + "�͕��̋���");
			}
		}
		
		
	}

}
