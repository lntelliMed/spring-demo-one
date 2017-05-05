package com.intellimed.springdemo;

public class TennisCoach implements Coach {

	private WeatherService weatherService;
	
	public TennisCoach(WeatherService theWeather){
		this.weatherService = theWeather;
	}
	
	public TennisCoach() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice with your new racquet for half an hour";
	}

	@Override
	public String getDailyWeather() {
		return weatherService.getTodaysWeather();
	}

}
