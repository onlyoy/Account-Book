package Dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Dto.AccountDto;

public class AccountDao {

	Scanner sc = new Scanner(System.in);
	
	private List<AccountDto> list = new ArrayList<AccountDto>();
	
	
	public void method() {
		
		AccountDto man = new AccountDto("22/10/05", "영화관람", "지출", 20000, "아바타2");
		list.add(man);
		
	}
	
	// CRUD 
	public void insert() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("내역을 추가합니다");
		
		System.out.print("날짜(xx/xx/xx) = ");
		String date = sc.next();
		
		System.out.print("용도 = ");
		String use = sc.next();
		
		System.out.print("수입/지출 = ");
		String classify = sc.next();
		
		System.out.print("금액 = ");
		int money = sc.nextInt();
	
		System.out.print("메모 = ");
		String memo = sc.next();
		
		AccountDto dto = new AccountDto(date, use, classify, money, memo);
		list.add(dto);
		
		
	}
	

	public void delete() {
		System.out.print("삭제할 내역 → ");		// 어떤기준으로 삭제할지??
		String use = sc.next();
		int index = -1;
		
		for (int i = 0; i < list.size(); i++) {
			AccountDto a = list.get(i);
			if(use.equals(a.getUse())) {
				System.out.println(a.toString());
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("내역을 찾을 수 없습니다");
		}
		else {
			list.remove(index);
			System.out.println("내역을 삭제하였습니다");
		}
	}
	
	public void selectMonth() {
		// 연도월별 결산
		System.out.print("검색날짜 → ");	
		String date = sc.next();
		int index = -1;
		
		for (int i = 0; i < list.size(); i++) {
			AccountDto a = list.get(i);
			if(date.equals(a.getDate())) {
				System.out.println(a.toString());
			}
		}
		
	}
	
	public void selectUse() {
		// 수입/
		System.out.print("수입/지출 → ");	
		String classify = sc.next();
		int index = -1;
		
		for (int i = 0; i < list.size(); i++) {
			AccountDto a = list.get(i);
			if(classify.equals(a.getClassify())) {
				System.out.println(a.toString());
			}
		}
		
//		list.stream()
//		.filter( a-> a.getClassify().equals(classify))
//		.map( a -> {
//			System.out.println(a.toString());
//			return a;
//		});
	}
	
	public void select() {
		// 용도
		System.out.print("용도 → ");	
		String use = sc.next();
		int index = -1;
		
		
//		list.stream()
//			.filter( a-> a.getUse().equals(use))
//			.map( a -> {
//				System.out.println(a.toString());
//				return a;
//			});
//		
		for (int i = 0; i < list.size(); i++) {
			AccountDto a = list.get(i);
			if(use.equals(a.getUse())) {
				System.out.println(a.toString());
			}
		}
		
	}
	
			
}
