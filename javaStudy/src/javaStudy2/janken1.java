package javaStudy2;

import java.util.Random;
import java.util.Scanner;

public class janken1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		Random y = new Random();
		System.out.println("0�F�O�[�@1�F�`���L�@2�F�p�[ �̂ǂꂩ����͂��Ă�������");
		int cpuhand;
		int myhand;
		int result;
		
		//
		
			//�P�Q�R�ȊO����͂����Ȃ�
			for ( ; ; )
			{
				myhand = i.nextInt();
				if (myhand != 0 && myhand != 1 && myhand != 2)
				{
					System.out.println("0�A1�A2�̂ǂꂩ����͂��Ă�������");
				}
				else 
				{
					cpuhand = y.nextInt(2);
					break;
				}
			}
			
			//�����̎�
			if(myhand == 0)
			{
				System.out.println("�����̓O�[���o���܂���");
			}
			else if(myhand == 1)
			{
				System.out.println("�����̓`���L���o���܂���");
			}
			else
			{
				System.out.println("�����̓p�[���o���܂���");
			}
		
			System.out.println(cpuhand);
			
			//����̎�
			if(cpuhand == 0)
			{
				System.out.println("����̓O�[���o���܂���");
			}
			else if(cpuhand == 1)
			{
				System.out.println("����̓`���L���o���܂���");
			}
			else
			{
				System.out.println("����̓p�[���o���܂���");
			}
		
			//���s
			result = (myhand - cpuhand + 3) % 3;
			
			for( ; ; )
			{
				switch(result)
				{
				case 0:
					System.out.println("���������ł���");
					break;
				case 1:
					System.out.println("���Ȃ��̕����ł�");
					break;	
				case 2:
					System.out.println("���Ȃ��̏����ł�");
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
//			System.out.println("��������");
//		}
//		else if(myhand % cpuhand == 1)
//		{
//			System.out.println("����");
//		}
//		else if(myhand % cpuhand == 2)
//		{
//			System.out.println("����");
		
//		}
	}
}
