package com.normnondo.controller;

import com.normnondo.entity.Smith;
import com.normnondo.persistence.RegisterDao;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/smith/register")
public class SmithClass {

    @POST
    @Path("/{param1}/{param2}/{param3}")

    public void postSmithClass(@PathParam("param1") String smithParam1, @PathParam("param2") String smithParam2,
                               @PathParam("param3") String smithParam3) {
        RegisterDao registerDao = new RegisterDao(SmithClass.class);
        String firstName = smithParam1;
        String lastName = smithParam2;
        String email = smithParam3;
        Smith smith = new Smith(firstName, lastName, email);
        int id = registerDao.insert(smith);
    }

}
