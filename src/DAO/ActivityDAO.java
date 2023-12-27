package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Activity;


public class ActivityDAO  {
	public static ActivityDAO getInstance() {
		return new ActivityDAO();
	}


	public int insert(Activity t) {
		Connection connection = JDBCUtil.getConnection();
		int ketqua=0;
		String sql= "INSERT INTO activity (activityId, activityName, renterId, timeStart, timeFinish)"
				+ "VALUES(?,?,?,?)";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			
			pst.setInt(1, t.getActivityId());
			pst.setString(2, t.getActivityName());
			pst.setInt(3, t.getRenterId());
			pst.setString(4, t.getTimeStart());
			pst.setString(5, t.getTimeFinish());
			ketqua =pst.executeUpdate();
			System.out.println(ketqua);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JDBCUtil.CloseConnection(connection);
		// TODO Auto-generated method stub
		return ketqua;
	}


	public int update(Activity t) {
		Connection connection = JDBCUtil.getConnection();
		int ketqua=0;
		String sql= "UPDATE activity "
				+" SET activityName=?, timeStart=?, timeFinish=?"
				+" WHERE activityId=?";
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(4, t.getActivityId());
			pst.setString(1, t.getActivityName());
			pst.setString(2, t.getTimeStart());
			pst.setString(3, t.getTimeFinish());
			ketqua =pst.executeUpdate();
			System.out.println(ketqua);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JDBCUtil.CloseConnection(connection);
		// TODO Auto-generated method stub
		return ketqua;
	}


	public int delete(Activity t) {
		Connection connection = JDBCUtil.getConnection();
		int ketqua=0;
		String sql= "DELETE from activity "
				+" WHERE activityId=?";
		System.out.println(sql);
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1,t.getActivityId());
			ketqua =pst.executeUpdate();
			System.out.println(ketqua);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JDBCUtil.CloseConnection(connection);
		// TODO Auto-generated method stub
		return ketqua;
	}


	public ArrayList<Activity> selectAll() {
		ArrayList<Activity> ketQua = new ArrayList<>();
		Connection connection = JDBCUtil.getConnection();
		
		String sql= "SELECT * FROM activity ";
		System.out.println(sql);
		try {
			ResultSet rs = connection.createStatement().executeQuery(sql);
			while (rs.next()) {
				int activityid = rs.getInt("activityid");
				String activityname = rs.getString("activityname");
				int renterid = rs.getInt("renterid");
				String timestart = rs.getString("timestart");
				String timefinish = rs.getString("timefinish");
				Activity a = new Activity(activityid,activityname,renterid,timestart,timefinish);
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


	public Activity selectByID(Activity t) {
		Activity ketQua = null;
		try {
			Connection connection = JDBCUtil.getConnection();
			String sql= "SELECT * FROM activity WHERE activityid =? ";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1,t.getActivityId());
			System.out.println(sql);
			ResultSet rs =pst.executeQuery();
			while (rs.next()) {
				int activityid = rs.getInt("activityiid");
				String activityname = rs.getString("activityname");
				int renterid = rs.getInt("renterid");
				String timestart = rs.getString("timestart");
				String timefinish = rs.getString("timefinish");
				ketQua = new Activity(activityid,activityname,renterid,timestart,timefinish);
			}
			
			JDBCUtil.CloseConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}


	public Activity selectByName(Activity t) {
		Activity ketQua = null;
		try {
			Connection connection = JDBCUtil.getConnection();
			String sql= "SELECT * FROM activity WHERE activityname =? ";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1,t.getActivityName());
			System.out.println(sql);
			ResultSet rs =pst.executeQuery();
			while (rs.next()) {
				int activityid = rs.getInt("activityiid");
				String activityname = rs.getString("activityname");
				int renterid = rs.getInt("renterid");
				String timestart = rs.getString("timestart");
				String timefinish = rs.getString("timefinish");
				ketQua = new Activity(activityid,activityname,renterid,timestart,timefinish);
			}
			
			JDBCUtil.CloseConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}
}
