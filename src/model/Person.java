package model;

public class Person implements InterfaceSearch<Person> {
	private int id;
    private String name;
    private int hostId;
    private String sdt;
    private String status;
    private String address;
    
    public Person(int id, String name, String sdt, String address) {
        this.id = id;
        this.name = name;
        this.sdt = sdt;
        this.address = address;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", hostId=" + hostId + ", sdt=" + sdt + ", status=" + status
				+ ", address=" + address + "]";
	}

	@Override
	public Person[] searchALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person[] searchByName() {
		// TODO Auto-generated method stub
		return null;
	}
}
