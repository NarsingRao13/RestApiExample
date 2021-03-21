package com.javafiles;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class JerseyClientGet {
	public static void main(String[] args) {
		Client client = Client.create();
		WebResource resource = client
				.resource(String.format("http://localhost:8080/RestDemo/api/login/%s/%s", "admin", "admin1"));
		String response = resource.type("application/json").post(String.class);
		System.out.println(response);
	}
}
