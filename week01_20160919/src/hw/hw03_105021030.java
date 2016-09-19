package hw;
import java.util.*;
public class hw03_105021030 {
	/*
	 * Topic:請寫一個程式讓使用者輸入 6 個數(可以有小數)的值，每一個值都取四捨五入後輸出這 6 個數中的最小值
	 * Date: 2016/09/19
	 * Author: 105021030 張廷毓
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a1=sc.nextFloat();
		Math.round(a1);
		float a2=sc.nextFloat();
		Math.round(a2);
		float a3=sc.nextFloat();
		Math.round(a3);
		float a4=sc.nextFloat();
		Math.round(a4);
		float a5=sc.nextFloat();
		Math.round(a5);
		float a6=sc.nextFloat();
		Math.round(a6);
		
		float x=Math.min(a1, a2);
		x=Math.min(x, a3);
		x=Math.min(x, a4);
		x=Math.min(x, a5);
		x=Math.min(x, a6);
		System.out.print(x);
		
		
	}

}
