package javaStudy2;

import java.util.Random;
import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		int ans = s.nextInt();			
		int x = r.nextInt(10) + 1;
		int y = r.nextInt(10) + 1;
		System.out.println(x);
		System.out.println(y);
		int z = x + y;
		
		if (z >= 11 && ans == 1)
		{
			System.out.println("“–‚½‚è");
		}
		else if (z < 11 && ans == 2)
		{
			System.out.println("“–‚½‚è");
		}
		else
		{
			System.out.println("‚Í‚¸‚ê");
		}
	}

}
