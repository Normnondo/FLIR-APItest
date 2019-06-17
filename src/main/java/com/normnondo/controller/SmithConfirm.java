package com.normnondo.controller;

import com.normnondo.persistence.RegisterDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/smith/confirm")
public class SmithConfirm {

    @GET
    @Path("/{param}")

    @Produces(MediaType.APPLICATION_JSON)
    public Response getSmithClass(@PathParam("param") String smithParam) {
        List<SmithClass> output = new RegisterDao(SmithClass.class).getByEmail(smithParam);
        return Response.status(200).entity(output).build();
    }

}


