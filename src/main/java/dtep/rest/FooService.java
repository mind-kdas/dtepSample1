package dtep.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/hoho")
public class FooService {


  @GET
  @Path("/hello")
  @Produces("text/plain")
  public String hello() {
    return "b3n was here 2014";
  }

  @GET
  @Path("/echo/{message}")
  @Produces("text/plain")
  public String echo(@PathParam("message")String message) {
    return message;
  }

}