package hw;
import java.util.*;
public class hw02_105021030 {
	/*
	 * Topic:請寫一個程式讓使用者輸入 n 並產生 6 個介於 1~n 之間的亂數 (輸出的亂數可重覆)
	 * Date: 2016/09/19
	 * Author: 105021030 張廷毓
	 */
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Random rnd=new Random();
			int v=sc.nextInt();
			int v1=rnd.nextInt(v)+1;
			int v2=rnd.nextInt(v)+1;
			int v3=rnd.nextInt(v)+1;
			int v4=rnd.nextInt(v)+1;
			int v5=rnd.nextInt(v)+1;
			int v6=rnd.nextInt(v)+1;
			System.out.println(v1);
			System.out.println(v2);
			System.out.println(v3);
			System.out.println(v4);
			System.out.println(v5);
			System.out.println(v6);

	}

}
