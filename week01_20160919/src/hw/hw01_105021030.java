package hw;
import java.util.*;
public class hw01_105021030 {
	/*
	 * Topic: 假設我們要用二進制來表示 n 種狀態，請寫一個程式來計算記錄這 n 種狀態需要多少位元 (例如: n = 3 則需要 2bits)  (log(n)/log(2)
	 * Date: 2016/09/19
	 * Author: 105021030 張廷毓
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.print((int) Math.ceil(Math.log(n)/Math.log(2)) );

	}

}
