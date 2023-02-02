package com.rbu.hello;

import java.util.Date;

public class Message {
private Date timestamp;
private String status;
private String error;
private String path;
public Date getTimestamp() {
	return timestamp;
}
public void setTimestamp(Date timestamp) {
	this.timestamp = timestamp;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getError() {
	return error;
}
public void setError(String error) {
	this.error = error;
}
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}

}
