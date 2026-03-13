package com.sece.app.util;


//@Getter
//@Setter
public class CustomError {
	public String getTYPE() {
		return TYPE;
	}

	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	private String TYPE;
	private String msg;
	
	public CustomError(String TYPE, String msg){
		this.TYPE = TYPE;
		this.msg = msg;
	}
}
