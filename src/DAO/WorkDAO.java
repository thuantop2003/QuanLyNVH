package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Work;

public class WorkDAO {
	public static WorkDAO getInstance() {
			return new WorkDAO();
	}
	public ArrayList<Work> selectAll() {
		ArrayList<Work> ketQua = new ArrayList<>();
		Connection connection = JDBCUtil.getConnection();
		String sql1= "SELECT account.userid,accountname,timeloggin,timeloggout FROM account, work where account.userid=work.userid ";
		String sql2= "SELECT account.userid,accountname,timeloggin,timeloggout FROM account, work where account.userid=work.userid ";
		try {
			ResultSet rs = connection.createStatement().executeQuery(sql1);
			while (rs.next()) {
				String userid = rs.getString("account.userid");
				String accountname = rs.getString("accountname");
				LocalDateTime timeloggin = (LocalDateTime) rs.getObject("timeloggin");
				LocalDateTime timeloggout = (LocalDateTime) rs.getObject("timeloggout");
				Work a= new Work(userid,accountname,timeloggin,timeloggout);
				ketQua.add(a);
			}
			ResultSet rs2 = connection.createStatement().executeQuery(sql2);
			while (rs2.next()) {
				String userid = rs2.getString("account.userid");
				String accountname = rs2.getString("accountname");
				LocalDateTime timeloggin = (LocalDateTime) rs2.getObject("timeloggin");
				LocalDateTime timeloggout = (LocalDateTime) rs2.getObject("timeloggout");
				Work a= new Work(userid,accountname,timeloggin,timeloggout);
				ketQua.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JDBCUtil.CloseConnection(connection);
		return ketQua;
		// TODO Auto-generated method stub
	}
	public ArrayList<Work> selectByTime(LocalDateTime t1, LocalDateTime t2){
		 ArrayList<Work> a=this.selectAll();
		 ArrayList<Work> b=new ArrayList<>();
		 for(int i=0;i<a.size();i++) {
			 if(a.get(i).getTimeloggin().compareTo(t1)>=0&&a.get(i).getTimeloggin().compareTo(t2)<=0) {
				 b.add(a.get(i));
			 }
		 }
		
		return b;
		
	}

}
