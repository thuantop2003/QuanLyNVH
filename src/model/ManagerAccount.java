package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import DAO.AccountDAO;
import DAO.LocalPersonDAO;
import DAO.ManagerAccountDAO;
import DAO.WorkDAO;

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
	

	public ManagerAccount(String accountName, String password) {
		super();
		this.accountName = accountName;
		this.password = password;
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
	public boolean checkManagerAccount() {
		ArrayList<ManagerAccount> accounts = new ArrayList<ManagerAccount>();
		accounts = ManagerAccountDAO.getInstance().selectAll();
		for (int i = 0; i < accounts.size(); i++) {
			if (this.getAccountName().equals(accounts.get(i).getAccountName()) &&
		            this.getPassword().equals( accounts.get(i).getPassword())) {
				this.setUserId(accounts.get(i).getUserId());
				return true;
			}
		}
		return false;
	}
	public boolean changePassword(String newpassword){
		if(this.checkManagerAccount()) {
			this.setPassword(newpassword);
			ManagerAccountDAO.getInstance().update(this);
			return true;
		}
		return false;
	}

	public ArrayList<ManagerAccount> selectManagerAccountAll() {
		 ArrayList<ManagerAccount> a= ManagerAccountDAO.getInstance().selectAll();
		return a;
	}

	public ManagerAccount searchManagerAccountByName(String accountName) {
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
	public int makeNewAccount(Account t) {
		if(!t.checkAccount()) {
		AccountDAO.getInstance().insert(t);
		return 1;
		}
		return 0;
	}
	public int makeNewManagerAccount(ManagerAccount t) {
		if(!t.checkManagerAccount()) {
		ManagerAccountDAO.getInstance().insert(t);
		return 1;
		}
		return 0;
	}
	public ArrayList<Work> searchWorkALL() {
		 ArrayList<Work> a = WorkDAO.getInstance().selectAll();
		 return a;
	}
	public ArrayList<Work> searchWorkByTime(LocalDateTime t1,LocalDateTime t2){
		ArrayList<Work> a = WorkDAO.getInstance().selectAll();
		ArrayList<Work> b = new ArrayList<>();
		for (int i=0; i< a.size();i++) {
			if(a.get(i).getTimeloggin().compareTo(t1)>=0 && a.get(i).getTimeloggin().compareTo(t2)<=0) {
				b.add(a.get(i));
			}
		}
		return b;
	}
	public ArrayList<Person> searchLocalPersonALL() {
		ArrayList<Person> p= LocalPersonDAO.getInstance().selectAll();
		return p;
	}
	public int addLocalPerson(Person t) {
		int ketqua = LocalPersonDAO.getInstance().insert(t);
		return ketqua;
	}
	public int updateLocalPerson(Person t) {
		int ketqua = LocalPersonDAO.getInstance().update(t);
		return ketqua;
	}
	public ArrayList<Person> searchHouseholdByHostID(String t){
		ArrayList<Person> p= LocalPersonDAO.getInstance().selectListByHostid(t);
		return p;
	}
	public ArrayList<Person> searchPersonsByName(String t){
		ArrayList<Person> p= LocalPersonDAO.getInstance().selectListByName(t);
		return p;
	}
	public Person searchPersonsByID(String t){
		Person p= LocalPersonDAO.getInstance().selectByID(t);
		return p;
	}
	public int deleteAccount(Account t ) {
		int ketqua=AccountDAO.getInstance().delete(t);	
		return ketqua;
				}
	public int deleteManagerAccount(ManagerAccount t ) {
		int ketqua=ManagerAccountDAO.getInstance().delete(t);	
		return ketqua;
		}
	public int forgetPassword(String accountname,String answer,String newpassword) {
		int ketqua = ManagerAccountDAO.getInstance().forgetPasswork(accountname, answer, newpassword);
		return ketqua;
		
	}
	public ArrayList<Work> selectWorkByTime(LocalDateTime t1, LocalDateTime t2){
		ArrayList<Work> a= WorkDAO.getInstance().selectByTime(t1, t2);
		return a;
	}
	public ArrayList<Work> selectWorkALL(){
		ArrayList<Work> a= WorkDAO.getInstance().selectAll();
		return a;
	}
}