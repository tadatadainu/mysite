package javaStudy;

public class Study7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i;
        int num = 2;
        int ans = num;
        System.out.printf("%d��1���%d%n", num, ans);
        
        for (i = 2; i < 9; i++)
        {
        	ans *= 2;
        	System.out.printf("%d��%d���%d%n", num, i, ans);
        }
        
	}

}
