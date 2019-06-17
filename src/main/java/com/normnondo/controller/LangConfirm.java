package com.normnondo.controller;

import com.normnondo.persistence.RegisterDao;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/lang/confirm")
public class LangConfirm {

    @GET
    @Path("/{param}")

    @Produces(MediaType.APPLICATION_JSON)
    public Response getLangClass(@PathParam("param") String langParam) {
        List<LangClass> output = new RegisterDao(LangClass.class).getByEmail(langParam);
        return Response.status(200).entity(output).build();
    }

}



