package model;

public class Request {
	String hostid;
	String request;
	String time;
	public Request(String hostid, String request, String time) {
		super();
		this.hostid = hostid;
		this.request = request;
		this.time = time;
	}
	public String getHostid() {
		return hostid;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
