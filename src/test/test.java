package test;

import java.sql.Connection;

import DAO.AccountDAO;
import database.JDBCUtil;
import model.Account;

public class test {
	public static void main(String[] args) {
		Account a= new Account("363", "hoangtranvan1", "1131");
		AccountDAO.getInstance().delete(a);
	}

}
