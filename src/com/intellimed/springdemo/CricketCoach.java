package com.intellimed.springdemo;

public class CricketCoach implements Coach {

	private WeatherService weatherService;
	private String emailAddress;
	private String team;
	
	
	
	public CricketCoach(){
		System.out.println("CricketCoach - Inside CricketCoach()");
	}
	
	
	
	public WeatherService getWeatherService() {
		return weatherService;
	}



	public void setWeatherService(WeatherService weatherService) {
		System.out.println("CricketCoach - Inside setWeatherService(WeatherService weatherService)");
		this.weatherService = weatherService;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach - Inside setEmailAddress(String emailAddress)");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("CricketCoach - Inside setTeam(String team)");
		this.team = team;
	}



	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyWeather() {
		return weatherService.getTodaysWeather();
	}

}
