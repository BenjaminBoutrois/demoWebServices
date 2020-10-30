package eu.ensup.presentation;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Lanceur
{
	public static void main(String[] args)
	{
		try
		{
			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:8080/demoWebService/rest/hello/Benjamin");

			ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

			if (response.getStatus() != 200)
			{
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Réponse de l'URL http://localhost:8080/demoWebService/rest/hello/Benjamin \n");
			System.out.println(output);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
