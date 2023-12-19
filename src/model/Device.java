package model;

public class Device implements InterfaceSearch<Device> {
	private int deviceId;
    private String name;
    private int amount;
    private int roomId;
    private int price;
    private String note;
    
    public Device(String name, int amount, int roomId, int price, String note) {
        this.name = name;
        this.amount = amount;
        this.roomId = roomId;
        this.price = price;
        this.note = note;
    }

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
    
	@Override
    public String toString() {
        return "Device{" +
                "deviceId=" + deviceId +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", roomId=" + roomId +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }

	@Override
	public Device[] searchALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Device[] searchByName() {
		// TODO Auto-generated method stub
		return null;
	}
}
