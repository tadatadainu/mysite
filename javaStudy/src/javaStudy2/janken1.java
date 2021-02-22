package javaStudy2;

import java.util.Random;
import java.util.Scanner;

public class janken1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		Random y = new Random();
		System.out.println("0：グー　1：チョキ　2：パー のどれかを入力してください");
		int cpuhand;
		int myhand;
		int result;
		
		//
		
			//１２３以外を入力させない
			for ( ; ; )
			{
				myhand = i.nextInt();
				if (myhand != 0 && myhand != 1 && myhand != 2)
				{
					System.out.println("0、1、2のどれかを入力してください");
				}
				else 
				{
					cpuhand = y.nextInt(2);
					break;
				}
			}
			
			//自分の手
			if(myhand == 0)
			{
				System.out.println("自分はグーを出しました");
			}
			else if(myhand == 1)
			{
				System.out.println("自分はチョキを出しました");
			}
			else
			{
				System.out.println("自分はパーを出しました");
			}
		
			System.out.println(cpuhand);
			
			//相手の手
			if(cpuhand == 0)
			{
				System.out.println("相手はグーを出しました");
			}
			else if(cpuhand == 1)
			{
				System.out.println("相手はチョキを出しました");
			}
			else
			{
				System.out.println("相手はパーを出しました");
			}
		
			//勝敗
			result = (myhand - cpuhand + 3) % 3;
			
			for( ; ; )
			{
				switch(result)
				{
				case 0:
					System.out.println("引き分けでした");
					break;
				case 1:
					System.out.println("あなたの負けです");
					break;	
				case 2:
					System.out.println("あなたの勝ちです");
					break;	
				default:
				}
				if(result == 0)
				{
					continue;
				}
				else
				{
					break;
				}
			}
			
		
		
//		if(myhand % cpuhand == 0)
//		{
//			System.out.println("引き分け");
//		}
//		else if(myhand % cpuhand == 1)
//		{
//			System.out.println("負け");
//		}
//		else if(myhand % cpuhand == 2)
//		{
//			System.out.println("勝ち");
		
//		}
	}
}
