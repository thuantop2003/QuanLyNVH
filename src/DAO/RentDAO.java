package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.Activity;
import model.Rent;



public class RentDAO  {
	public static RentDAO getInstance() {
		return new RentDAO();
	}


	public int insert(Rent t) {
		Connection connection = JDBCUtil.getConnection();
		int ketqua=0;
		String sql= "INSERT INTO rent (renterId, renter, cost, activityId, deviceId, roomId, roomAmount, deviceAmount, renterId)"
				+ "VALUES(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			
			pst.setInt(1, t.getRentId());
			pst.setObject(2, t.getRenter());
			pst.setInt(3, t.getCost());
			pst.setInt(4, t.getActivityId());
			pst.setInt(5, t.getDeviceId());
			pst.setInt(6, t.getRoomId());
			pst.setInt(7, t.getRoomAmount());
			pst.setInt(8, t.getDeviceAmount());
			pst.setInt(8, t.getRenterId());
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


	public int update(Rent t) {
		Connection connection = JDBCUtil.getConnection();
		int ketqua=0;
		String sql= "UPDATE rent "
				+" SET renter=?, cost=?, activityid=?, deviceid=?, roomid=?, roomamount=?, deviceamount=?, rentid=?"
				+" WHERE rentid=?";
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(9, t.getRentId());
			pst.setObject(1, t.getRenter());
			pst.setInt(2, t.getCost());
			pst.setInt(3, t.getActivityId());
			pst.setInt(4, t.getDeviceId());
			pst.setInt(5, t.getRoomId());
			pst.setInt(6, t.getRoomAmount());
			pst.setInt(7, t.getDeviceAmount());
			pst.setInt(8, t.getRenterId());
			
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


	public int delete(Rent t) {
		Connection connection = JDBCUtil.getConnection();
		int ketqua=0;
		String sql= "DELETE from rent "
				+" WHERE rentid=?";
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


	public ArrayList<Rent> selectAll() {
		ArrayList<Rent> ketQua = new ArrayList<>();
		Connection connection = JDBCUtil.getConnection();
		
		String sql= "SELECT rent.rentid, rent.cost, rent.activity, rent.deviceid, rent.roomid, rent.roomamount, rent.deviceamount, rent.renterid FROM rent, renter, device, room Where rent.renterid=renter.renterid and rent.roomid=room.roomid and rent.deviceid=device.deviceid";
		System.out.println(sql);
		try {
			ResultSet rs = connection.createStatement().executeQuery(sql);
			while (rs.next()) {
				int activityid = rs.getInt("activityid");
				int rentid = rs.getInt("rentid");
				int roomid = rs.getInt("roomid");
				int deviceid = rs.getInt("deviceid");
				int cost = rs.getInt("cost");
				//cho nay chua chac lam
				Person renter = new PersonDAO(connection).getPersonById(rs.getInt("renterid"));
				int roomamount = rs.getInt("roomamount");
				int deviceamount = rs.getInt("deviceamount");
				int renterid = rs.getInt("renterid");
				
				Rent a = new Rent(rentid, renter, cost, activityid,deviceid,roomid,roomamount,deviceamount,renterid);
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


	public Rent selectByID(Rent t) {
		Rent ketQua = null;
		try {
			Connection connection = JDBCUtil.getConnection();
			String sql= "SELECT * FROM rent WHERE rentid =? ";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1,t.getRentId());
			System.out.println(sql);
			ResultSet rs =pst.executeQuery();
			while (rs.next()) {
				int activityid = rs.getInt("activityid");
				int rentid = rs.getInt("rentid");
				int roomid = rs.getInt("roomid");
				int deviceid = rs.getInt("deviceid");
				int cost = rs.getInt("cost");
				//cho nay chua chac lam
				Person renter = new PersonDAO(connection).getPersonById(rs.getInt("renterid"));
				int roomamount = rs.getInt("roomamount");
				int deviceamount = rs.getInt("deviceamount");
				int renterid = rs.getInt("renterid");
				
				Rent a = new Rent(rentid, renter, cost, activityid,deviceid,roomid,roomamount,deviceamount,renterid);
			}
			
			JDBCUtil.CloseConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	public ArrayList<Rent> selectByCost(Rent t){
		ArrayList<Rent> ketQua = new ArrayList<>();
		try {
			Connection connection = JDBCUtil.getConnection();
			String sql= "SELECT * FROM rent WHERE cost =? ";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1,t.getRentId());
			System.out.println(sql);
			ResultSet rs =pst.executeQuery();
			while (rs.next()) {
				int activityid = rs.getInt("activityid");
				int rentid = rs.getInt("rentid");
				int roomid = rs.getInt("roomid");
				int deviceid = rs.getInt("deviceid");
				int cost = rs.getInt("cost");
				//cho nay chua chac lam
				Person renter = new PersonDAO(connection).getPersonById(rs.getInt("renterid"));
				int roomamount = rs.getInt("roomamount");
				int deviceamount = rs.getInt("deviceamount");
				int renterid = rs.getInt("renterid");
				
				Rent a = new Rent(rentid, renter, cost, activityid,deviceid,roomid,roomamount,deviceamount,renterid);
				ketQua.add(a);
			}
			
			JDBCUtil.CloseConnection(connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}
}
