package javaStudy;

public class Study3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int language = 40;
		int math = 60;
		int score = language + math;
		System.out.println("国語のテスト：" + language + "点");
		System.out.println("数学のテスト：" + math + "点");
		System.out.println("合計：" + score + "点");
		
		if (language < 40 || math < 40)
		{
			System.out.println("追試");
		}
		else
		{
			if(score >= 160) 
			{
				System.out.println("優");
			}
			else if (score >= 140)
			{
				System.out.println("良");
			}
			else if (score >= 100)
			{
				System.out.println("可");
			}
			else if (score < 100)
			{
			System.out.println("追試");
			}
		}
		
	}
	
}
