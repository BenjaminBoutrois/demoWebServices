package eu.ensup.presentation;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Lanceur
{
	public static void main(String[] args)
	{
		System.out.println("### GET ###\n");

		try
		{
			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:8080/demoWebService/rest/json/get");

			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200)
			{
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Réponse de l'URL http://localhost:8080/demoWebService/rest/json/get \n");
			System.out.println(output);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		System.out.println("\n### POST ###\n");

		try
		{
			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:8080/demoWebService/rest/json/post");

			String input = "{\"prenom\":\"James\",\"nom\":\"Bond\"}";

			ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);

			if (response.getStatus() != 201)
			{
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			System.out.println("Réponse de l'URL http://localhost:8080/demoWebService/rest/json/post \nObjet : " + input + "\n");
			String output = response.getEntity(String.class);
			System.out.println(output);
		}
		catch (Exception e)
		{

			e.printStackTrace();

		}
	}
}
