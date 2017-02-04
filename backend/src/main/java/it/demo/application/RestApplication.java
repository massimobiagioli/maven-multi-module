package it.demo.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import it.demo.resources.DummyResource;

@ApplicationPath("rest")
public class RestApplication extends Application {
	
	public RestApplication() {
	}
	
	@Override
	public Set<Object> getSingletons() {
		Set<Object> set = new HashSet<Object>();
	    set.add(new DummyResource());
	    return set;
	}
	
}
