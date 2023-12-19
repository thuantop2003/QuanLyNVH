package model;
public class Rent {
	private int rentId;
    private Person renter;
    private int cost;
    
    public Rent(int rentId, Person renter, int cost) {
        this.rentId = rentId;
        this.renter = renter;
        this.cost = cost;
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
        return "Rent{" +
                "rentId=" + rentId +
                ", renter=" + renter +
                ", cost=" + cost +
                '}';
    }
}
