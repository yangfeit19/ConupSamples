package cn.edu.nju.moon.intergration.pondage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.oasisopen.sca.annotation.Remotable;

@Remotable
public interface JaxrsPondage {

    @GET
    @Path("getPondage")
    @Produces(MediaType.TEXT_PLAIN)
    String getPondage(@QueryParam("name") String station, @QueryParam("time") String time);
}
