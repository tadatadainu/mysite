package javaStudy2;

	import java.util.Random;
	import java.util.Scanner;
	
public class JankenGame {


	    // �O�[�`���L�p�[�萔��`
	    int GU = 0;
	    int CHOKI = 1;
	    int PA = 2;

	    // �v���C���[;
	    int myhand;
	    int cpuhand;
	    
	    // ��
	    String te1;
	    String te2;
	    
	    //��������������
	    int mycount;
	    
	    //CPU����������
	    int cpucount;
	    
	    // �����̎����͂���
	    public void myhand() {
	    	for( ; ; )
	    	{
	    		Scanner i = new Scanner(System.in);
	    		int hand1 = i.nextInt();
	    		switch (hand1) 
	    		{
	            	case 0:
	            		myhand = GU;
		                te1 = "���[";
		                break;
		            case 1:
		            	myhand = CHOKI;
		                te1 = "���傫";
		                break;
		            case 2:
		            	myhand = PA;
		                te1 = "�ρ[";
		                break;
		        }
	    		
		        if(hand1 != 0 && hand1 != 1 && hand1 != 2)
		        {
		        	System.out.println("0�F�O�[�@1�F�`���L�@2�F�p�[�̒�������͂��Ă�������");
		        }
		        else 
		        {
		        	break;
		        }
	    	}
	    }
	    
	    //CPU�̎�������_���Ō��߂�
	    public void cpuhand() {
	        Random random = new Random();
	        int hand2 = random.nextInt(2);
	        switch (hand2) {
	            case 0:
	            	cpuhand = GU;
	                te2 = "���[";
	                break;
	            case 1:
	            	cpuhand = CHOKI;
	                te2 = "���傫";
	                break;
	            case 2:
	            	cpuhand = PA;
	                te2 = "�ρ[";
	                break;
	        }
	    }
	    //����
	    public void hantei() 
	    {
	    	 if (myhand == 0 && cpuhand == 1) 
		        {
	    		 	mycount++;
		            System.out.println("���Ȃ��̏����ł�");
		        } 
		        else if (myhand == 1 && cpuhand == 2)
		        {
		        	mycount++;
		            System.out.println("���Ȃ��̏����ł�");
		        } 
		        else if (myhand == 2 && cpuhand == 0) 
		        {
		        	mycount++;
		            System.out.println("���Ȃ��̏����ł�");
		        } 
		        else if (myhand == cpuhand) 
		        {
		            System.out.println("���������ł�");
		        } 
		        else 
		        {
		        	cpucount++;
		            System.out.println("���Ȃ��̕����ł�");
		        }
	    }
	    //���݂���������
	    public void omikuji()
	    {
	    	System.out.println("���O����͂��ĉ�����");
			Scanner n = new Scanner(System.in);
			Random r = new Random();
			String name = n.nextLine();
			System.out.println(name + "�̉^����");
			int x = r.nextInt(6) + 1;
			
			switch(x)
			{
				case 1:
				{
					System.out.println("��g�ł���");
					break;
				}
				case 2:
				{
					System.out.println("�g�ł���");
					break;
				}
				case 3:
				{
					System.out.println("���g�ł���");
					break;
				}
				case 4:
				{
					System.out.println("���g�ł���");
					break;
				}
				case 5:
				{
					System.out.println("���g�ł���");
					break;
				}
				case 6:
				{
					System.out.println("���ł���");
					break;
				}
				case 7:
				{
					System.out.println("�勥�ł���");
					break;
				}
			}
		}

	
	    	
	    
	    
	    //����񂯂�
	    public static void main(String[] args) {
	    	int i;
	        JankenGame janken = new JankenGame();
	        System.out.println("0�F�O�[�@1�F�`���L�@2�F�p�[�̒�������͂��Ă�������");
	        janken.myhand();
	        System.out.println("�����̎�: " + janken.te1);
	        janken.cpuhand();
	        System.out.println("CPU�̎�: " + janken.te2);
	        janken.hantei();
	        System.out.println("�������������񐔁F" + janken.mycount);
	        System.out.println("CPU�̏������񐔁F" + janken.cpucount);
	        
	        for( ; ; )
	        {
	        		System.out.println("0�F�O�[�@1�F�`���L�@2�F�p�[�̒�������͂��Ă�������");
	        		janken.myhand();
	    	        System.out.println("�����̎�: " + janken.te1);
	    	        janken.cpuhand();
	    	        System.out.println("CPU�̎�: " + janken.te2);
	    	        janken.hantei();
	    	        System.out.println("�������������񐔁F" + janken.mycount);
	    	        System.out.println("CPU�̏������񐔁F" + janken.cpucount);
	        	
	        	
	        	if(janken.mycount == 3)
	        	{
	        		System.out.println("3�񏟂��܂����̂ł��݂����������܂�");
	        		janken.omikuji();
	        		break;
	        	}
	        	else if(janken.cpucount == 3)
	        	{
	        		System.out.println("3�񕉂��܂���");
	        		break;
	        	}
	        }
	        
	        
	        
	        // ����
//	        if (janken.myhand == 0 && janken.cpuhand == 1) 
//	        {
//	            System.out.println("���Ȃ��̏����ł�");
//	        } 
//	        else if (janken.myhand == 1 && janken.cpuhand == 2)
//	        {
//	            System.out.println("���Ȃ��̏����ł�");
//	        } 
//	        else if (janken.myhand == 2 && janken.cpuhand == 0) 
//	        {
//	            System.out.println("���Ȃ��̏����ł�");
//	        } 
//	        //���������̎��͂���񂯂�����Ȃ���
//	        else if (janken.myhand == janken.cpuhand) 
//	        {
//	            System.out.println("��������");
//	            
//          } 
//          else 
//	        {
//	            System.out.println("���Ȃ��̕����ł�");
//	        }
	    }
	}

