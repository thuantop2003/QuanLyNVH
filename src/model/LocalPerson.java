package model;

public class LocalPerson extends Person implements InterfaceSearch<Person> {
    private int hostId;
    private String status;
  
    public LocalPerson(int id, String name, int hostId, String sdt, String status, String address) {
    	super(id, name, sdt, address);
        this.hostId = hostId;
        this.status = status;
    }
	public int getHostId() {
		return hostId;
	}

	public void setHostId(int hostId) {
		this.hostId = hostId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "LocalPerson [hostId=" + hostId + ", status=" + status + "]";
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
