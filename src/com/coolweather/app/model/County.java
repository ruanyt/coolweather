package com.coolweather.app.model;

public class County {
	
		//每张表在代码中最好有一个对应的实体类
		
			private int id;
			private String countyName;
			private String countyCode;
			private int cityId;
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			
		    public String getCountyName(){
		    	return countyName;
		    }
		    public void setCountyName(String countyName){
		    	this.countyName = countyName;
		    }
		    
		    public String getCountyCode(){
		    	return countyCode;
		    }
		    public void setCountyCode(String countyCode){
		    	this.countyCode = countyCode;
		    }
		    
		    public int getCityId() {
				return cityId;
			}
			public void setCityId(int cityId) {
				this.cityId = cityId;
			}



}
