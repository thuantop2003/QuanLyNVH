package model;

import java.util.ArrayList;

import DAO.AccountDAO;
import DAO.ManagerAccountDAO;

public class ManagerAccount {
	private String userId;
    private String accountName;
    private String password;
    private String securityQuestion;
    private String answer;
    

    
	public ManagerAccount() {
		super();
	}

	public ManagerAccount(String accountName, String password, String securityQuestion, String answer) {
		super();
		this.accountName = accountName;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.answer = answer;
	}

	public ManagerAccount(String userId, String accountName, String password, String securityQuestion, String answer) {
		super();
		this.userId = userId;
		this.accountName = accountName;
		this.password = password;
		this.securityQuestion = securityQuestion;
		this.answer = answer;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "ManagerAccount [userId=" + userId + ", accountName=" + accountName + ", password=" + password
				+ ", securityQuestion=" + securityQuestion + ", answer=" + answer + "]";
	}

	public ArrayList<ManagerAccount> selectManagerAccountAll() {
		 ArrayList<ManagerAccount> a= ManagerAccountDAO.getInstance().selectAll();
		return a;
	}

	public ManagerAccount searchByName(String accountName) {
		ManagerAccount a = ManagerAccountDAO.getInstance().selectByName(accountName);
		return a;
	}
	public Account searchAccountByName(String s) {
		Account t=AccountDAO.getInstance().selectByName(s);
		return t;
	}
	public ArrayList<Account> selectAccountAll(){
		ArrayList<Account> a=AccountDAO.getInstance().selectAll();
		return a;	
	}
}