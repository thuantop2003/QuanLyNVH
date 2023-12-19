package model;

public class Room implements InterfaceSearch<Room> {
	private int roomId;
    private String name;
    private int capacity;
    private int price;
    private String status;
    private String note;
    //constructors
    public Room(String name, int capacity, int price, String status, String note) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.status = status;
        this.note = note;
    }
    //getter and setter
	public int getRoomId() {
		return roomId;
	}
	
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
    //for debug and login
	@Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
	@Override
	public Room[] searchALL() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Room[] searchByName() {
		// TODO Auto-generated method stub
		return null;
	}
}
