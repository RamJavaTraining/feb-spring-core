package com.imcs.krishna.feb.spring.core;

public class Plane {
	
	private String planeName;
	private RouteChecker routeChecker;
	
	
	public void route() {
		routeChecker.roteFinder();
	}
	
	public Plane() {
		//this.routeChecker = new RouteChecker();
	}
	
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
	public void setRouteChecker(RouteChecker routeChecker) {
		this.routeChecker = routeChecker;
	}
	
	
	

}
