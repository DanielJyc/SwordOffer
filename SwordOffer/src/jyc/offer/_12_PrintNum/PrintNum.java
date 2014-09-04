package jyc.offer._12_PrintNum;

/**
 * 书上有点复杂，感觉核心的就这点：
 * 	private static void testRecursion(int length) {
		if(length == 0){
			System.out.println(num[4]+""+num[3]+""+num[2]+""+num[1]);
			return ;
		}
		for (int i = 0; i <= 9; i++) {
			num[length]=i;
			testRecursion(length-1);
		}
	}
 * @author Administrator
 *
 */
public class PrintNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 4;
		int[] num = new int[N+1];
		testRecursion(num, N);
	}

	/**
	 * 写个最简单的吧，这样看着 更容易理解
	 * @param num
	 * @param length
	 */
	private static void testRecursion(int num[], int length) {
		// TODO Auto-generated method stub
		if(length == 0){
			System.out.println(num[4]+""+num[3]+""+num[2]+""+num[1]);  //N=4时
			return ;
		}
		for (int i = 0; i <= 9; i++) {
			num[length]=i;
			testRecursion(num, length-1);
		}
	}

}
