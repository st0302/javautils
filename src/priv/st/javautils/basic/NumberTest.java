package priv.st.javautils.basic;

//default class is default, can be see in same class and same package
class PrivilegeTest{
	int num = 3;
	void printSelf(){
		System.out.println("I'm PrivilegeTest");
	}
}

public class NumberTest {
	// 转换为包装类
	// static Integer valueOf(int i)
	// static Integer valueOf(String s)
	// static Integer valueOf(String s, int radix)
	public static void valueOfTest() {
		Integer x = Integer.valueOf(9);
		Double c = Double.valueOf(5);
		Float a = Float.valueOf("80");
		Integer b = Integer.valueOf("444", 16); // 使用 16 进制
		System.out.println(x);
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
	}

	// 把String类型转化为int类型
	// static int parseInt(String s)
	// static int parseInt(String s, int radix)
	public static void parseIntTest() {
		String a = "123";
		int b = Integer.parseInt(a, 16);
		double c = Double.parseDouble("5");
		System.out.println(b);
		System.out.println(c);
	}

	// 将 Number 对象转换为 xxx 数据类型的原生值并返回
	public static void xxxValueTest() {
		Integer x = 5;
		// 返回 byte 原生数据类型
		System.out.println(x.byteValue());
		// 返回 double 原生数据类型
		System.out.println(x.doubleValue());
		// 返回 long 原生数据类型
		System.out.println(x.longValue());
	}

	public static void main(String[] args) {
		valueOfTest();
		parseIntTest();
		xxxValueTest();
	}
}
