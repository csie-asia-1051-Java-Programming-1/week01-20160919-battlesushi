package ex;
import java.util.*;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105021030 張廷毓
 */
public class ex01_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=0;
		b=(a-32)*5/9;
		System.out.print(b);
		

	}

}
