package jyc.offer._3_FindInPartiallySortedMatirx;
/**
 *  思路：
 *  1、从右上角开始查找
 *  2、如果值大于num，列数减1；小于num，则行数加1。
 * @author Administrator
 *
 */
public class FindInPartiallySortedMatirx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] matrix = {{1,2,8,9}, {2,4,9,12}, {4,7,10,13}, {6,8,11,15} };
		int[][] matrix = {};
		System.out.println(changeValue(matrix, 7));
	}

	private static boolean changeValue(int[][] matrix, int num) {
		boolean result = false;
		int columns, rows;
		//判断是否有元素
		if(matrix.length > 0 ){
			columns = matrix[0].length;
			rows = matrix.length;
		}
		else {
			columns = 0;
			rows = 0;
		}
		if(columns >=0 && rows >=0 && matrix != null){  //保证数组有效
			int c = columns-1, r = 0;
			while (c >= 0 && r < rows) {  //依次取出元素
				if(matrix[c][r] == num){ //相等时
					result = true;
					break;
				}
				else if(matrix[c][r] > num) {c = c-1;}  //如果值大于num，列数减1
				else {r=r+1;}  //小于num，则行数加1。
			}
		}
		return result;
	}
}
