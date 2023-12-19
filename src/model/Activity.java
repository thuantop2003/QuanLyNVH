package model;

public class Activity implements InterfaceSearch<Activity>  {
	private int activityId;
    private String activityName;
    private int renterId;
    private String timeStart;
    private String timeFinish;
    private int rentId;
	
    public Activity(int activityId, String activityName, int renterId, String timeStart, String timeFinish, int rentId) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.renterId = renterId;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
        this.rentId = rentId;
    }

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public int getRenterId() {
		return renterId;
	}

	public void setRenterId(int renterId) {
		this.renterId = renterId;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public String getTimeFinish() {
		return timeFinish;
	}

	public void setTimeFinish(String timeFinish) {
		this.timeFinish = timeFinish;
	}

	public int getRentId() {
		return rentId;
	}

	public void setRentId(int rentId) {
		this.rentId = rentId;
	}
    
	@Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", name='" + activityName + '\'' +
                ", renterId=" + renterId +
                ", timeStart='" + timeStart + '\'' +
                ", timeFinish='" + timeFinish + '\'' +
                ", rentId=" + rentId +
                '}';
    }

	@Override
	public Activity[] searchALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Activity[] searchByName() {
		// TODO Auto-generated method stub
		return null;
	}
}
