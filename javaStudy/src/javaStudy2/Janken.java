package javaStudy2;

import java.util.Random;
import java.util.Scanner;

public class Janken {
	
	//�����̎�
	public static void myhand() 
	 {
		int GU = 0;
		int CHOKI = 1;
		int PA = 2;
		int myhand;
		String te1;
		Scanner i = new Scanner(System.in);
	    int hand1 = i.nextInt();
	    switch (hand1) 
	    {
	    	case 0:
	    		myhand = GU;
	    		te1 = "�O�[";
	    		break;
	    	case 1:
	            myhand = CHOKI;
	            te1 = "�`���L";
	            break;	
	        case 2:
	            myhand = PA;
	            te1 = "�p�[";
	            break;
	    }
	        
	 }
	
	//CPU�̎�
	public static void cpuhand()
	{
		int GU = 0;
		int CHOKI = 1;
		int PA = 2;
		int cpuhand;
		String te2;
		Random y = new Random();
	    int hand2 = y.nextInt(2);
	    switch (hand2) 
	    {
	    	case 0:
	    		cpuhand = GU;
	    		te2 = "�O�[";
	    		break;
	    	case 1:
	            cpuhand = CHOKI;
	            te2 = "�`���L";
	            break;	
	        case 2:
	            cpuhand = PA;
	            te2 = "�p�[";
	            break;
	     }
	    
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int te1 = 0;
		int te2 = 0;
		myhand();
		cpuhand();
		
		System.out.println(te1);
	
	}
}
