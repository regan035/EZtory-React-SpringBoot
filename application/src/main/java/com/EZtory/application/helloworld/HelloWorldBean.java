package com.EZtory.application.helloworld;

public class HelloWorldBean {
	
	private String massage;

	public HelloWorldBean(String massage) {
		
		this.massage = massage;
	}

	
	public String getMassage() {
		return massage;
	}


	public void setMassage(String massage) {
		this.massage = massage;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [massage=" + massage + "]";
	}
	
	
}
