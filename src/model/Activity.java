package model;

import java.util.ArrayList;
import java.util.List;

import DAO.ActivityDAO;


public class Activity  {
	private int activityId;
    private String activityName;
    private int renterId;
    private String timeStart;
    private String timeFinish;
	
    public Activity(int activityId, String activityName, int renterId, String timeStart, String timeFinish) {
        this.activityId = activityId;
        this.activityName = activityName;
        this.renterId = renterId;
        this.timeStart = timeStart;
        this.timeFinish = timeFinish;
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

    
	@Override
    public String toString() {
        return "Activity{" +
                "activityId=" + activityId +
                ", name='" + activityName + '\'' +
                ", renterId=" + renterId +
                ", timeStart='" + timeStart + '\'' +
                ", timeFinish='" + timeFinish + '\'' +
                '}';
    }
	
	//ham check activity
	public boolean checkActivity() {
		if (this.getActivityName() != null && !this.getActivityName().isEmpty()) {
            return true;  // Hoạt động hợp lệ
        } else {
            return false; // Hoạt động không hợp lệ
        }
	}
	//ham all pay
	public int allPay() {
		Activity pay = ActivityDAO.getInstance().selectByID(this);
		if(pay == null) {
			return 0;
		}else {
			return 1;
		}
	}
	//ham searchSoonAct
	public Activity[] searchSoonAct() {
        List<Activity> soonActivities = new ArrayList<>();
        ArrayList<Activity> act = new ArrayList<>();
        act = ActivityDAO.getInstance().selectAll();

        long currentTimeMillis = System.currentTimeMillis();

        
        for (Activity activity : act) {
            if (convertTimeStringToMillis(activity.getTimeStart()) > currentTimeMillis) {
                soonActivities.add(activity);
            }
        }

 
        return soonActivities.toArray(new Activity[0]);
    }

   //ham chuyen thoi gian thanh millis
    private long convertTimeStringToMillis(String timeString) {
        
        return 0;
    }
	//ham searchLateAct
    public Activity[] searchLateAct() {
        List<Activity> soonActivities = new ArrayList<>();
        ArrayList<Activity> act = new ArrayList<>();
        act = ActivityDAO.getInstance().selectAll();

        long currentTimeMillis = System.currentTimeMillis();

        
        for (Activity activity : act) {
            if (convertTimeStringToMillis(activity.getTimeFinish()) > currentTimeMillis) {
                soonActivities.add(activity);
            }
        }

 
        return soonActivities.toArray(new Activity[0]);
    }
    //ham searchActByTime
    public Activity[] searchActByTime() {
        List<Activity> soonActivities = new ArrayList<>();
        ArrayList<Activity> act = new ArrayList<>();
        act = ActivityDAO.getInstance().selectAll();

        long currentTimeMillis = System.currentTimeMillis();

        
        for (Activity activity : act) {
            if ((convertTimeStringToMillis(activity.getTimeStart()) < currentTimeMillis) && (convertTimeStringToMillis(activity.getTimeFinish()) > currentTimeMillis)) {
                soonActivities.add(activity);
            }
        }

 
        return soonActivities.toArray(new Activity[0]);
    }
}
