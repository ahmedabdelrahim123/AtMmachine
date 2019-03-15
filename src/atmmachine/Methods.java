/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmachine;

public class Methods {

	private double balance;
	int n = 0;
	int m = 100;
	int i = 0;
	int j = 1;
	int flag = 0;
	private String a[] = new String[m];
	String s = "No pervious";
	String st = "No Next";

	/**
	 *
	 */
	public Methods() {
	}

	public void withdraw(double money) {
		if (money > 0) {
			if (money <= balance) {
				balance = balance - money;
				a[n++] = "withdraw " + Double.toString(money);
				j = 1;
			} else {
				System.out.println("you dont have enough money");
			}

		} else {
			System.out.println("eror");
		}
	}

	public void deposit(double money) {
		if (money > 0) {
			balance = balance + money;
			System.out.println(balance+"  ");
			a[n++] = "deposit " + Double.toString(money);
			j = 1;
		} else {
			System.out.println("eror ");
		}
	}

	public String balanceinquiry() {
		a[n++] = "Balance inquiry " + Double.toString(balance);
		j = 1;
		System.out.println(balance);
		return Double.toString(balance);
	}

	public String next() {
		if (flag == 2) {
			j = n - 1;
			flag = 0;
		}
		i = n - 1 - j;
		if (i < n && i >= 0) {
			j--;
			return a[i];

		}
		flag = 1;
		return st;

	}

	public String pervious() {
		if (flag == 1) {
			flag = 0;
			j = 0;
		}
		i = n - 1 - j;

		if (i > n - 5) {
			if (i >= 0) {
				j++;
				return a[i];
			}
		}
		flag = 2;
		return s;
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Methods atm = new Methods();
		atm.deposit(100);
		atm.withdraw(2);
		System.out.println(atm.balanceinquiry());
		System.out.println(atm.pervious());
		System.out.println(atm.pervious());
		System.out.println(atm.pervious());
		// TODO code application logic here
	}

}