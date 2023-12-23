package test;

import java.sql.Connection;

import DAO.AccountDAO;
import model.Account;
import model.Request;
public class test {
	public static void main(String[] args) {
		Account t =new Account("tranthuan","thuan123");
		System.out.println(t.changePassword("thuan1"));		
}
}
