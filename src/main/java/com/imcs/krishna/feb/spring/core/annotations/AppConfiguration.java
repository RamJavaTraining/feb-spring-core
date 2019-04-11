package com.imcs.krishna.feb.spring.core.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.imcs.krishna.feb.spring.core.annotations")
public class AppConfiguration {
	
	
	@Bean(name="plane")
	public Plane getPlane(RouteChecker routeChecker) {
		return new Plane(routeChecker);
	}
	
	@Bean(name= {"routeChecker","routeChecker1"})
	public RouteChecker getRouteChecker() {
		return new RouteChecker();
	}

}
