package javaStudy;

public class Study7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i;
        int num = 2;
        int ans = num;
        System.out.printf("%d‚Ì1æ‚Í%d%n", num, ans);
        
        for (i = 2; i < 9; i++)
        {
        	ans *= 2;
        	System.out.printf("%d‚Ì%dæ‚Í%d%n", num, i, ans);
        }
        
	}

}
