package javaStudy2;

import java.util.Random;
import java.util.Scanner;

public class omikuji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//‘å‹g1A‹g2A’†‹g3A¬‹g4A––‹g5A‹¥6A‘å‹¥7
		System.out.println("–¼‘O‚ğ“ü—Í‚µ‚Ä‰º‚³‚¢");
		Scanner n = new Scanner(System.in);
		Random r = new Random();	
		String name = n.nextLine();
		int count = 0;
		for ( ; ; )
		{	
		int x = r.nextInt(6) + 1;
		System.out.println(x);
		
		
			if (x == 1)
			{
				count++;
				System.out.println("‘å‹g");
				break;
			}
			else if (x == 2)
			{
				count++;
				System.out.println("‹g");
			}
			else if (x == 3)
			{
				System.out.println("’†‹g");
			}
			else if (x == 3)
			{
				count++;
				System.out.println("¬‹g");
			}
			else if (x == 4)
			{
				count++;
				System.out.println("––‹g");
			}
			else if (x == 5)
			{
				count++;
				System.out.println("‹¥");
			}
			else if (x == 6)
			{
				count++;
				System.out.println("‘å‹¥");
			}
		}
		System.out.println("ˆø‚¢‚½‰ñ”‚Í" + count + "‚Å‚·");
	}

}
