package it.zhao.cn.model;

/**
 * 用户状�?
 *
 */
public enum UserState {

	normal("正常状�?"), blocked("锁定");
	
	private String desc;
	private UserState(String desc) {
		this.desc = desc;;
	}
	
	public String getDesc() {
		return desc;
	}
	
	@Override
	public String toString() {
		return this.desc;
	}
	
}
