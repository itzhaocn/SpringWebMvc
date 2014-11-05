package it.zhao.cn.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class DataBinderTestModel {
	
	private String username;
	private boolean bool;//Boolean值测�?
	private SchoolInfoModel schooInfo;
	private List hobbyList;//集合测试，此处可以改为数�?Set进行测试
	private Map map;//Map测试
	
	@Value("010-12345678")
	private PhoneNumberModel phoneNumber;//String->自定义对象的转换测试
	private Date date;//日期类型测试
	private UserState state;//String—�?>Enum类型转换测试
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}
	public SchoolInfoModel getSchooInfo() {
		return schooInfo;
	}
	public void setSchooInfo(SchoolInfoModel schooInfo) {
		this.schooInfo = schooInfo;
	}
	public List getHobbyList() {
		return hobbyList;
	}
	public void setHobbyList(List hobbyList) {
		this.hobbyList = hobbyList;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	public PhoneNumberModel getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(PhoneNumberModel phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public UserState getState() {
		return state;
	}
	public void setState(UserState state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "DataBinderTestModel [username=" + username + ", bool=" + bool
				+ ", schooInfo=" + schooInfo + ", hobbyList=" + hobbyList
				+ ", map=" + map + ", phoneNumber=" + phoneNumber + ", date="
				+ date + ", state=" + state + "]";
	}

	
	
	
}
