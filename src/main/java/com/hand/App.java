package com.hand;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		TransactionTool tt = SpringBeanFactory.getBeanFactory().getBean("transactionTool", TransactionTool.class);
		Film film = new Film();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入 电影名称(title):");
		String input = sc.nextLine();
		film.setTitle(input);
		System.out.println("请输入电影描述(description):");
		input = sc.nextLine();
		film.setDescription(input);
		System.out.println("请输入语言ID (language_id):");
		input = sc.nextLine();
		film.setLanguage_id(Integer.parseInt(input));
		
	}
}
