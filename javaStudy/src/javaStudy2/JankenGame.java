package javaStudy2;

	import java.util.Random;
	import java.util.Scanner;
	
public class JankenGame {


	    // グーチョキパー定数定義
	    int GU = 0;
	    int CHOKI = 1;
	    int PA = 2;

	    // プレイヤー;
	    int myhand;
	    int cpuhand;
	    
	    // 手
	    String te1;
	    String te2;
	    
	    //自分が勝った回数
	    int mycount;
	    
	    //CPUが勝った回数
	    int cpucount;
	    
	    // 自分の手を入力する
	    public void myhand() {
	    	for( ; ; )
	    	{
	    		Scanner i = new Scanner(System.in);
	    		int hand1 = i.nextInt();
	    		switch (hand1) 
	    		{
	            	case 0:
	            		myhand = GU;
		                te1 = "ぐー";
		                break;
		            case 1:
		            	myhand = CHOKI;
		                te1 = "ちょき";
		                break;
		            case 2:
		            	myhand = PA;
		                te1 = "ぱー";
		                break;
		        }
	    		
		        if(hand1 != 0 && hand1 != 1 && hand1 != 2)
		        {
		        	System.out.println("0：グー　1：チョキ　2：パーの中から入力してください");
		        }
		        else 
		        {
		        	break;
		        }
	    	}
	    }
	    
	    //CPUの手をランダムで決める
	    public void cpuhand() {
	        Random random = new Random();
	        int hand2 = random.nextInt(2);
	        switch (hand2) {
	            case 0:
	            	cpuhand = GU;
	                te2 = "ぐー";
	                break;
	            case 1:
	            	cpuhand = CHOKI;
	                te2 = "ちょき";
	                break;
	            case 2:
	            	cpuhand = PA;
	                te2 = "ぱー";
	                break;
	        }
	    }
	    //判定
	    public void hantei() 
	    {
	    	 if (myhand == 0 && cpuhand == 1) 
		        {
	    		 	mycount++;
		            System.out.println("あなたの勝ちです");
		        } 
		        else if (myhand == 1 && cpuhand == 2)
		        {
		        	mycount++;
		            System.out.println("あなたの勝ちです");
		        } 
		        else if (myhand == 2 && cpuhand == 0) 
		        {
		        	mycount++;
		            System.out.println("あなたの勝ちです");
		        } 
		        else if (myhand == cpuhand) 
		        {
		            System.out.println("引き分けです");
		        } 
		        else 
		        {
		        	cpucount++;
		            System.out.println("あなたの負けです");
		        }
	    }
	    //おみくじを引く
	    public void omikuji()
	    {
	    	System.out.println("名前を入力して下さい");
			Scanner n = new Scanner(System.in);
			Random r = new Random();
			String name = n.nextLine();
			System.out.println(name + "の運勢は");
			int x = r.nextInt(6) + 1;
			
			switch(x)
			{
				case 1:
				{
					System.out.println("大吉でした");
					break;
				}
				case 2:
				{
					System.out.println("吉でした");
					break;
				}
				case 3:
				{
					System.out.println("中吉でした");
					break;
				}
				case 4:
				{
					System.out.println("小吉でした");
					break;
				}
				case 5:
				{
					System.out.println("末吉でした");
					break;
				}
				case 6:
				{
					System.out.println("凶でした");
					break;
				}
				case 7:
				{
					System.out.println("大凶でした");
					break;
				}
			}
		}

	
	    	
	    
	    
	    //じゃんけん
	    public static void main(String[] args) {
	    	int i;
	        JankenGame janken = new JankenGame();
	        System.out.println("0：グー　1：チョキ　2：パーの中から入力してください");
	        janken.myhand();
	        System.out.println("自分の手: " + janken.te1);
	        janken.cpuhand();
	        System.out.println("CPUの手: " + janken.te2);
	        janken.hantei();
	        System.out.println("自分が勝った回数：" + janken.mycount);
	        System.out.println("CPUの勝った回数：" + janken.cpucount);
	        
	        for( ; ; )
	        {
	        		System.out.println("0：グー　1：チョキ　2：パーの中から入力してください");
	        		janken.myhand();
	    	        System.out.println("自分の手: " + janken.te1);
	    	        janken.cpuhand();
	    	        System.out.println("CPUの手: " + janken.te2);
	    	        janken.hantei();
	    	        System.out.println("自分が勝った回数：" + janken.mycount);
	    	        System.out.println("CPUの勝った回数：" + janken.cpucount);
	        	
	        	
	        	if(janken.mycount == 3)
	        	{
	        		System.out.println("3回勝ちましたのでおみくじが引けます");
	        		janken.omikuji();
	        		break;
	        	}
	        	else if(janken.cpucount == 3)
	        	{
	        		System.out.println("3回負けました");
	        		break;
	        	}
	        }
	        
	        
	        
	        // 判定
//	        if (janken.myhand == 0 && janken.cpuhand == 1) 
//	        {
//	            System.out.println("あなたの勝ちです");
//	        } 
//	        else if (janken.myhand == 1 && janken.cpuhand == 2)
//	        {
//	            System.out.println("あなたの勝ちです");
//	        } 
//	        else if (janken.myhand == 2 && janken.cpuhand == 0) 
//	        {
//	            System.out.println("あなたの勝ちです");
//	        } 
//	        //引き分けの時はじゃんけんをしなおす
//	        else if (janken.myhand == janken.cpuhand) 
//	        {
//	            System.out.println("引き分け");
//	            
//          } 
//          else 
//	        {
//	            System.out.println("あなたの負けです");
//	        }
	    }
	}

