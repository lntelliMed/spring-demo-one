package com.intellimed.springdemo;

public class BaseballCoach implements Coach{

	private WeatherService weatherService;
	
	public BaseballCoach(WeatherService theWeather){
		this.weatherService = weatherService;
	}
	
	
	
	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}



	@Override
	public String getDailyWorkout(){
		return "Work on batting for 30 minutes";
	}

	@Override
	public String getDailyWeather() {
		return weatherService.getTodaysWeather();
	}
}
