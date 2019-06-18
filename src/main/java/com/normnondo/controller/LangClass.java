package com.normnondo.controller;

import com.normnondo.entity.Lang;
import com.normnondo.RegisterDao;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/lang/register")
public class LangClass {

    @POST
    @Path("/{param1}/{param2}/{param3}")

    public void postLangClass(@PathParam("param1") String langParam1, @PathParam("param2") String langParam2,
                               @PathParam("param3") String langParam3) {
        RegisterDao registerDao = new RegisterDao(LangClass.class);
        String firstName = langParam1;
        String lastName = langParam2;
        String email = langParam3;
        Lang lang = new Lang(firstName, lastName, email);
        int id = registerDao.insert(lang);
        if (id > 0) {
            System.out.println("Success");
        }
    }

}

