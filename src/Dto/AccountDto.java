package Dto;

import com.google.gson.Gson;

public class AccountDto {

	// 항목들
	private String date;		// 년월일		- 22/12/24	22/12/27
	private String use;			// 용도		- 영화관람		월급
	private String classify;	// 수입 지출	- 지출		수입
	private int money;			// 금액		- 25000		3000000
	private String Memo;		// 내용		- 아바타2		12월 급여
	
	public AccountDto() {
	}
	
	public AccountDto(String date, String use, String classify, int money, String memo) {
		this.date = date;
		this.use = use;
		this.classify = classify;
		this.money = money;
		Memo = memo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public String getClassify() {
		return classify;
	}

	public void setClassify(String classify) {
		this.classify = classify;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getMemo() {
		return Memo;
	}

	public void setMemo(String memo) {
		Memo = memo;
	}

	@Override
	public String toString() {
		return new Gson().toJson(this);
		
	//	return "AccountDto [날짜 = " + date + ", 용도 = " + use + ", 수입/지출 = " + classify + ", 금액 = " + money + ", Memo = "
		//		+ Memo + "]";
	}
	
	
	
}
