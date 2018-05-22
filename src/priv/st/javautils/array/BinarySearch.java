package priv.st.javautils.array;
import java.util.Arrays;

//此法为二分搜索法，故查询前需要用sort()方法将数组排序，如果数组没有排序，则结果是不确定的
//另外如果数组中含有多个指定值的元素，则无法保证找到的是哪一个

public class BinarySearch {
	//pattern1:binarySearch(object[], object key);
	//如果key在数组中，则返回搜索值的索引，否则返回-1或者”-“(插入点)
	//不存在时由1开始计数，存在时由0开始计数。
	public static void pattern1(){
		int[] a = new int[] { 1, 3, 4, 6, 8, 9 };
		int x1 = Arrays.binarySearch(a, 5);
		int x2 = Arrays.binarySearch(a, 4);
		int x3 = Arrays.binarySearch(a, 0);
		int x4 = Arrays.binarySearch(a, 10);
		System.out.println("x1:" + x1 + ", x2:" + x2);
		System.out.println("x3:" + x3 + ", x4:" + x4);
		/*输出结果：
		x1:-4, x2:2
		x3:-1, x4:-7
		*/
	}
	
	//pattern2:binarySearch(object[], int fromIndex, int endIndex, object key);
	//如果要搜索的元素key在指定的范围内，则返回搜索键的索引；否则返回-1或者”-“(插入点)。
	//搜索区域包括fromIndex 但是不包括endIndex  [fromIndex,endIndex)
	public static void pattern2(){
		int a[] = new int[] { 1, 3, 4, 6, 8, 9 };
		int x1 = Arrays.binarySearch(a, 1, 4, 5);
		int x2 = Arrays.binarySearch(a, 1, 4, 4);
		int x3 = Arrays.binarySearch(a, 1, 4, 2);
		int x4 = Arrays.binarySearch(a, 1, 5, 3);
		int x5 = Arrays.binarySearch(a, 1, 3, 10);
		System.out.println("x1:" + x1 + ", x2:" + x2);
		System.out.println("x3:" + x3 + ", x4:" + x4);
		System.out.println("x5:" + x5);
	}
	public static void main (String []args){
       pattern1();
       pattern2();
    }
}
