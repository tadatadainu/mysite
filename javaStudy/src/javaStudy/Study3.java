package javaStudy;

public class Study3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int language = 40;
		int math = 60;
		int score = language + math;
		System.out.println("����̃e�X�g�F" + language + "�_");
		System.out.println("���w�̃e�X�g�F" + math + "�_");
		System.out.println("���v�F" + score + "�_");
		
		if (language < 40 || math < 40)
		{
			System.out.println("�ǎ�");
		}
		else
		{
			if(score >= 160) 
			{
				System.out.println("�D");
			}
			else if (score >= 140)
			{
				System.out.println("��");
			}
			else if (score >= 100)
			{
				System.out.println("��");
			}
			else if (score < 100)
			{
			System.out.println("�ǎ�");
			}
		}
		
	}
	
}
