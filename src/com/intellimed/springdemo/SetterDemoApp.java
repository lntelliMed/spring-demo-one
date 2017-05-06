package com.intellimed.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach = context.getBean("cricketCoach", CricketCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyWeather());
		
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		

	}

}
