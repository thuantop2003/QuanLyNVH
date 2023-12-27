package model;

import DAO.RentDAO;

public class Rent {
	private int rentId;
    private Person renter;
    private int cost;
    private int activityId;
    private int deviceId;
    private int roomId;
    private int roomAmount;
    private int deviceAmount;
    private int renterId;
    
    public Rent(int rentId, Person renter, int cost, int activityId, int deviceId, int roomId, int roomAmount,
			int deviceAmount, int renterId) {
		super();
		this.rentId = rentId;
		this.renter = renter;
		this.cost = cost;
		this.activityId = activityId;
		this.deviceId = deviceId;
		this.roomId = roomId;
		this.roomAmount = roomAmount;
		this.deviceAmount = deviceAmount;
		this.renterId = renterId;
	}
    
    public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getRoomAmount() {
		return roomAmount;
	}

	public void setRoomAmount(int roomAmount) {
		this.roomAmount = roomAmount;
	}

	public int getDeviceAmount() {
		return deviceAmount;
	}

	public void setDeviceAmount(int deviceAmount) {
		this.deviceAmount = deviceAmount;
	}

	public int getRenterId() {
		return renterId;
	}

	public void setRenterId(int renterId) {
		this.renterId = renterId;
	}


	public int getRentId() {
		return rentId;
	}

	public void setRentId(int rentId) {
		this.rentId = rentId;
	}

	public Person getRenter() {
		return renter;
	}

	public void setRenter(Person renter) {
		this.renter = renter;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Rent [rentId=" + rentId + ", renter=" + renter + ", cost=" + cost + ", activityId=" + activityId
				+ ", deviceId=" + deviceId + ", roomId=" + roomId + ", roomAmount=" + roomAmount + ", deviceAmount="
				+ deviceAmount + ", renterId=" + renterId + "]";
	}
    
	//ham extraPaymen
	public int extraPayment() {
		int extra = 0;
		int maxRoom = 20;
		int maxDevice = 50;
		
		if(this.getRoomAmount()>maxRoom) {
			extra += (this.getRoomAmount() - maxRoom)*this.getCost();		
		}
		if(this.getDeviceAmount()>maxDevice) {
			extra += (this.getDeviceAmount() - maxDevice)*this.getCost();
		}
		return extra;
	}

}
