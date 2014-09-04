package jyc.offer._10_NumberOf1;

public class NumberOf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testNum = -23;
		System.out.println(numberOf1MoveRight(testNum));
		
		System.out.println(numberOf1MoveLeft(testNum));
		
		System.out.println(numberOf1BestMethod(testNum));
	}

	/**
	 * 方法三：最好的方法。
	 * 每次经过 n=n&(n-1) ，1的个数少一个；最后为0。
	 * 注意：对于负数，包含了负号1 的个数。
	 * @param testNum
	 * @return
	 */
	private static int numberOf1BestMethod(int testNum) {
		// TODO Auto-generated method stub
		int cnt=0;
		while(testNum != 0){
			cnt++;
			testNum = testNum & (testNum-1);
		}
		return cnt;
	}

	/**
	 * 方法二：左移标志数字flag--可用于负数
	 * @param testNum
	 * @return
	 */
	private static int numberOf1MoveLeft(int testNum) {
		// TODO Auto-generated method stub
		int cnt = 0, flag = 1;
		while (flag > 0) {
			if ((testNum&flag) >= 1) {
				cnt++;
			}
			flag = flag << 1;
		}
		return cnt;
	}


	/**
	 * 方法一：右移testNum
	 * 仅适用于正数
	 * @param testNum
	 * @return
	 */
	private static int numberOf1MoveRight(int testNum) {
		// TODO Auto-generated method stub
		int cnt=0;
		while (testNum>0) {
			if ((testNum&1) == 1) {
				cnt++;
			}
			testNum = testNum >> 1;
		}
		return cnt;
	}

}
