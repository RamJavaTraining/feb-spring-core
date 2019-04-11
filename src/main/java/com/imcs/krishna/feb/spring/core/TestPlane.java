package com.imcs.krishna.feb.spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPlane {
	
	public static void main(String argsp[]) {
		//RouteChecker routeChecker= new RouteChecker();
		//Plane plane = new Plane(routeChecker);
	
		//plane.setRouteChecker(routeChecker);
		
		//plane.route();
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("application-context.xml");
		Plane plane =(Plane) context.getBean("plane");
		//plane.setPlaneName("XYZ");
		plane.route();
		System.out.println(plane.getPlaneName());
		
		
		
		
	}

}
