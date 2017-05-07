package com.intellimed.springdemo;

import java.util.Random;

public class BeautifulWeatherService implements WeatherService {
	@Override
	public String getTodaysWeather() {
		
		String[] weatherConditions = {"sunny!", "hot!", "warm!"};
		Random random = new Random();
		int i = random.nextInt(weatherConditions.length);
		return "Today is " + weatherConditions[i];
	}

}
