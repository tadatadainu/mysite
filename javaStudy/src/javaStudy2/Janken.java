package javaStudy2;

import java.util.Random;
import java.util.Scanner;

public class Janken {
	
	//自分の手
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
	    		te1 = "グー";
	    		break;
	    	case 1:
	            myhand = CHOKI;
	            te1 = "チョキ";
	            break;	
	        case 2:
	            myhand = PA;
	            te1 = "パー";
	            break;
	    }
	        
	 }
	
	//CPUの手
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
	    		te2 = "グー";
	    		break;
	    	case 1:
	            cpuhand = CHOKI;
	            te2 = "チョキ";
	            break;	
	        case 2:
	            cpuhand = PA;
	            te2 = "パー";
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
