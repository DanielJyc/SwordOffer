package jyc.offer._8_MinNumberInRotatedArray;

public class MinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] numArr = {3,4,5,6,7,9,23,54,1,2};
//		int[] numArr = {1,1,0,1,1,1,1};
//		int[] numArr = {1};
		int[] numArr = {};

		int minIndex = selectMin(numArr);
		
		System.out.println(minIndex);

//		printNum(numArr);
	}

	private static void printNum(int[] numArr) {
		for (int i : numArr) {
			System.out.println(i);
		}
	}

	/**
	 * 思路：两个指针向中间靠近，相邻时结束。
	 * 伪代码：笔记。
	 * @param numArr
	 * @return
	 */
	private static int selectMin(int[] numArr) {
		// TODO Auto-generated method stub
		int smallIndex = 0, bigIndex = numArr.length-1;
		//三种情况：
		if(numArr.length > 1){
			while (smallIndex != bigIndex-1) {  //终止条件：两个索引(指针)相邻
				int midIndex = (smallIndex+bigIndex)/2;
				//****特殊情况：三个索引指向的数字相同:遍历所有数字****
				if(numArr[midIndex] == numArr[smallIndex] && numArr[midIndex] == numArr[bigIndex]){
					System.out.println("mid");
					return selectInOrder(numArr);
				}
				//移动两个指针
				if(numArr[midIndex] >= numArr[smallIndex]){
					smallIndex = midIndex;
				}else if(numArr[midIndex] <= numArr[bigIndex]){
					bigIndex = midIndex;
				}
			}
		}
		else if(numArr.length == 0){  // 无数据返回-1
			bigIndex = -1;
		}

		return bigIndex;
	}

	/**
	 * 特殊情况： numArr = {1,1,1,0,1,1,1,1}
	 * @param numArr
	 * @return
	 */
	private static int selectInOrder(int[] numArr) {
		// TODO Auto-generated method stub
		int minIndex = numArr[0];

		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] < numArr[minIndex]) {
				minIndex = i;
			}		
		}
		return minIndex;
	}
	
}
