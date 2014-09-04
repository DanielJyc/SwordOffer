package jyc.offer._9_Fibonacci;

/**
 * 裴波那契数列
 * @author Administrator
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numN =0;
		
		//方法一：复杂度超级大
//		numN = fiboRecursion(100);
//		System.out.println(numN);
		
		//方法二：O(n)
		numN = fiboTimeN(20);
		System.out.println(numN);
		
		//方法三：O(lgn)
		//利用数学公式
		
	}

	/**
	 * 将中间结果存储。O(n)
	 * @param i
	 * @return
	 */
	private static int fiboTimeN(int n) {
		// TODO Auto-generated method stub
		int[] fibArr = new int[n+1];
		fibArr[0]=0;
		fibArr[1]=1;
		for (int i = 2; i <= n; i++) {
			fibArr[i] = fibArr[i-1] + fibArr[i-2];
		}
		return fibArr[n];
	}

	/**
	 * 递归的方式，时间复杂度超级大。
	 * @param n
	 * @return
	 */
	private static int fiboRecursion(int n) {
		// TODO Auto-generated method stub
		if(0 == n){
			return 0;
		}
		else if(1 == n) {
			return 1;
		}else {
			return fiboRecursion(n-1)+fiboRecursion(n-2);
		}
	}

}
