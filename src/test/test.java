package test;

import java.sql.Connection;
import java.time.LocalDateTime;
import java.util.ArrayList;

import DAO.AccountDAO;
import DAO.RequestDAO;
import model.Account;
import model.Request;
public class test {
	public static void main(String[] args) {
		Account a= new Account();
		ArrayList<Request> aa=a.searchRequest();
		for (int i=0;i<aa.size();i++) {
			System.out.println(aa.get(i).toString());
		}
}
}
