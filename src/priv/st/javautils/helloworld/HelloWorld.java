package priv.st.javautils.helloworld;

public class HelloWorld {
	private int aaa;
	
	public static void main(String[] args){
		boolean a1 = false;
		int a2 = (int)23.5f;//不会四舍五入
		if(a2 == 23){
			System.out.println("the result is "+a2);
		}
		String name = "James";
		boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
		System.out.println("the result2 is "+result);
		System.out.println("ddd");
	}
}


