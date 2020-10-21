package org.openshift;
import
import
import
import
import
java.util.HashMap;
javax.enterprise.context.RequestScoped;
javax.ws.rs.GET;
javax.ws.rs.Path;
javax.ws.rs.Produces;
@RequestScoped
@Path("/insult")
public class InsultResource {
@GET()
@Produces("application/json")
public HashMap<String,String> getInsult() {
HashMap<String, String> theInsult = new HashMap<String, String>();
theInsult.put("insult", new InsultGenerator().generateInsult());
return theInsult;
 }
}
