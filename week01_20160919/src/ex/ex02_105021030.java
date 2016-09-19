package ex;
import java.util.*;
/*
 * Topic: 請寫一個程式讓使用者輸入體重單位 "公斤"，轉換成 "磅" (1磅 = 0.45359 公斤)
 * Date: 2016/09/19
 * Author: 105021030 張廷毓
 */

public class ex02_105021030 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		float b=0;
		b=a*100000/45359;
		System.out.print(b);
		
		
	}

}
