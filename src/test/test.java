package test;

import java.sql.Connection;

import database.JDBCUtil;

public class test {
	public static void main(String[] args) {
		Connection connection = JDBCUtil.getConnection();
		System.out.println(connection);
		JDBCUtil.CloseConnection(connection);
	}

}
