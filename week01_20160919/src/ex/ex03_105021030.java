package ex;
import java.util.*;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a 與 b，程式 計算 a 的 b 次方後輸出結果 (請使用 Math.pow(a,b) 工具)
 * Date: 2016/09/19
 * Author: 105021030 張廷毓
 */

public class ex03_105021030 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		System.out.print((long)Math.pow(a, b));

	}

}
