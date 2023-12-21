package model;

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
    
}
