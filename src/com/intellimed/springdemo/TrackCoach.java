package com.intellimed.springdemo;

public class TrackCoach implements Coach {

	private WeatherService weatherService;

	public TrackCoach(WeatherService theWeather){
		this.weatherService = weatherService;
	}
	
	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		return "Run a 5K today";
	}

	@Override
	public String getDailyWeather() {
		return weatherService.getTodaysWeather();
	}

}
