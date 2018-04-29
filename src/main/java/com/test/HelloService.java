package com.test;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("greeting")
public class HelloService{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject greetings(){
        return Json.createObjectBuilder().add("hello", "world").build();
    }

}