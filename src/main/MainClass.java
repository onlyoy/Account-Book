package main;

import java.util.Scanner;

import Dao.AccountDao;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// menu
		
		Scanner sc = new Scanner(System.in);
		
		AccountDao dao = new AccountDao();
		
		
		
		// menu
		while(true) {
			
			dao.method();
			
			System.out.println(" << 가계부 >> ");
			System.out.println("1. 입력");
			System.out.println("2. 삭제");
			System.out.println("3. 날짜기준검색");		// 연월일, 수입/지출, 용도
			System.out.println("4. 수입/지출검색");
			System.out.println("5. 용도별검색");
			System.out.println("6. 종료");
			
			System.out.print(">> ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					dao.insert();
					break;
				case 2:
					dao.delete();
					break;
				case 3:
					dao.selectMonth();
					break;
				case 4:	
					dao.selectUse();
					break;
				case 5:				
					dao.select();
					break;
				case 6:	
					System.exit(0);
					break;
				default:
					
			}
		}
		
	}

}
