package com.coolweather.app.model;

public class City {
	//每张表在代码中最好有一个对应的实体类
	
		private int id;
		private String cityName;
		private String cityCode;
		private int provinceId;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	    public String getCityName(){
	    	return cityName;
	    }
	    public void setCityName(String cityName){
	    	this.cityName = cityName;
	    }
	    public String getCityCode(){
	    	return cityCode;
	    }
	    public void setCityCode(String cityCode){
	    	this.cityCode = cityCode;
	    }
	    public int getProvinceId() {
			return provinceId;
		}
		public void setProvinceId(int provinceId) {
			this.provinceId = provinceId;
		}


}
