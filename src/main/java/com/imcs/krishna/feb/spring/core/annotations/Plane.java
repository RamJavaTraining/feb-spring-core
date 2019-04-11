package com.imcs.krishna.feb.spring.core.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Plane {
	
	private String planeName;
	
	//@Autowired
	//@Qualifier("routeChecker1")
	private RouteChecker routeChecker;
	
	
	public void route() {
		routeChecker.roteFinder();
	}
	
	public Plane() {
		//this.routeChecker = new RouteChecker();
	}
	
	@Autowired
	public Plane(RouteChecker routeChecker) {
		this.routeChecker = routeChecker;
	}
	
	
	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}
	public RouteChecker getRouteChecker() {
		return routeChecker;
	}
	//@Autowired
	public void setRouteChecker(RouteChecker routeChecker) {
		this.routeChecker = routeChecker;
	}
	
	
	

}
