package com.intellimed.springdemo;

public class TrackCoach implements Coach {

	private WeatherService weatherService;

	public TrackCoach(WeatherService theWeather){
		this.weatherService = theWeather;
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
	
	public void doMyStartupStuff(){
		System.out.println("TrackCoach: inside doMyStartupStuff()");
	}
	
	public void doMyCleanupStuff(){
		System.out.println("TrackCoach: inside doMyCleanupStuff()");
	}

}
