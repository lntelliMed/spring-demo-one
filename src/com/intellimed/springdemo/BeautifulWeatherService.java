package com.intellimed.springdemo;

public class BeautifulWeatherService implements WeatherService {

	@Override
	public String getTodaysWeather() {
		return "Today is sunny!";
	}

}
