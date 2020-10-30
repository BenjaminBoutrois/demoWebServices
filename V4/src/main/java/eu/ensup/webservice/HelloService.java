package eu.ensup.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloService
{
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String message)
	{
		String output = "Héllo " + message + " !";

		return Response.status(200).entity(output).build();
	}
}
