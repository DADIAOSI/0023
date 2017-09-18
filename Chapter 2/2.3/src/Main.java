//问题描述： 编写一个程序，把变量n的初始值设置为1678,使用除法和余数运算把每个变量的数字都提取出来。


public class Main {
	public static void main(String[] args)
	{
		int n=1678;
		int m;
		final int k=10;//k的值不能修改  教材25页
		String s="";
		while(n!=0)//教材28页 算数与逻辑运算符
		{
			m=n%k;// 教材26页
			n=n/k;
			System.out.println(m);
			s=m+","+s;
		}
		System.out.println(s);
	}
}
