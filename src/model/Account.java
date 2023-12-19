package model;

public class Account implements InterfaceSearch<Account> {
	private int userId;
    private String accountName;
    private String password;

    public Account(int userId, String accountName, String password) {
        this.userId = userId;
        this.accountName = accountName;
        this.password = password;
    }

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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
        return "Account{" +
                "userId=" + userId +
                ", accountName='" + accountName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

	@Override
	public Account[] searchALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account[] searchByName() {
		// TODO Auto-generated method stub
		return null;
	}
}
