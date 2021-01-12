package daftyw;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import io.smallrye.mutiny.Uni;
import org.jboss.resteasy.spi.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/ping")
public class GreetingResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingResource.class);
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Uni<Hello> hello(@Context HttpRequest request) {
        //LOGGER.info("GET on /ping from: {} on {}", request.getRemoteHost(), request.getUri().getBaseUri());
        return Uni.createFrom().item(Hello.of("Hello RESTEasy"));
    }
}