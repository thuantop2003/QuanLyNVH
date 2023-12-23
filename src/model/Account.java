package model;

import java.util.ArrayList;

import DAO.AccountDAO;

public class Account {
	private String userId;
    private String accountName;
    private String password;
	public Account(String userId, String accountName, String password) {
		super();
		this.userId = userId;
		this.accountName = accountName;
		this.password = password;
	}
	
	public Account(String accountName, String password) {
		super();
		this.accountName = accountName;
		this.password = password;
	}

	public Account() {
		// TODO Auto-generated constructor stub
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
	@Override
	public String toString() {
		return "Account [userId=" + userId + ", accountName=" + accountName + ", password=" + password + "]";
	}
	public boolean checkAccount() {
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts = AccountDAO.getInstance().selectAll();
		for (int i = 0; i < accounts.size(); i++) {
			if (this.accountName.equals(accounts.get(i).getAccountName()) &&
		            this.password.equals( accounts.get(i).getPassword())) {
				this.setUserId(accounts.get(i).getUserId());
				return true;
			}
		}
		return false;
	}
	public boolean changePassword(String newpassword){
		if(this.checkAccount()) {
			this.setPassword(newpassword);
			AccountDAO.getInstance().update(this);
			return true;
		}
		
		
		return false;
	}
    
}
