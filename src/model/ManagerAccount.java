package model;

public class ManagerAccount {
	private int userId;
    private String accountName;
    private String password;
    private String securityQuestion;
    private String answer;
    
    public ManagerAccount(int userId, String accountName, String password, String securityQuestion, String answer) {
        this.userId = userId;
        this.accountName = accountName;
        this.password = password;
        this.securityQuestion = securityQuestion;
        this.answer = answer;
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
        return "ManagerAccount{" +
                "userId=" + userId +
                ", accountName='" + accountName + '\'' +
                ", password='" + password + '\'' +
                ", securityQuestion='" + securityQuestion + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

	public ManagerAccount[] searchALL() {
		// TODO Auto-generated method stub
		return null;
	}

	public ManagerAccount[] searchByName() {
		// TODO Auto-generated method stub
		return null;
	}
}
