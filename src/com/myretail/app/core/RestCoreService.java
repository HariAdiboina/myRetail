package com.myretail.app.core;

import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;
import org.jboss.resteasy.plugins.providers.RegisterBuiltin;
import org.jboss.resteasy.plugins.providers.jackson.ResteasyJacksonProvider;
import org.jboss.resteasy.spi.ResteasyProviderFactory;

public class RestCoreService {

	static {
		ResteasyProviderFactory instance = ResteasyProviderFactory.getInstance();
		RegisterBuiltin.register(instance);
		instance.registerProvider(ResteasyJacksonProvider.class);
	}

	public static Object postResponse(String endpointSessionUrl, Object data, Class clazz) throws Exception {
		ClientRequest request = new ClientRequest(endpointSessionUrl);

		if (request != null) {
			request.accept(MediaType.APPLICATION_JSON);

			// Only put the JSON object, if it is not null.
			if (data != null) {
				request.body("application/json", data);
			}
		}
		ClientResponse response = request.post(clazz);
		return response.getEntity(clazz);
	}

	public static Object putResponse(String endpointSessionUrl,  Object data, Class clazz) throws Exception {
		ClientRequest request = new ClientRequest(endpointSessionUrl);
		
		if (request != null) {
			request.accept(MediaType.APPLICATION_JSON);

			// Only put the JSON object, if it is not null.
			if (data != null) {
				request.body("application/json", data);
			}
		}
		
		ClientResponse response = request.put(clazz);
		return response.getEntity(clazz);
	}

	public static Object getResponse(String endpointSessionUrl, Class clazz) throws Exception {
		ClientRequest request = new ClientRequest(endpointSessionUrl);
		ClientResponse response = request.get(clazz);
		return response.getEntity(clazz);
	}

}
