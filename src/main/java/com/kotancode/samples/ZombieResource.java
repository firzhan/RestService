package com.kotancode.samples;

import org.json.JSONException;
import org.json.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 * Created by firzhan on 8/26/14.
 */
@Path("/zombies")
public class ZombieResource {

    @GET
    @Produces("application/json")
    @Path("nearby/{zipcode}")
    public String getZombiesNearby(@PathParam("zipcode") String zipCode) throws JSONException {

        // Do calculations
        // Get object, convert to JSON string.

        System.out.println("Obtained zip code value="+zipCode);
        String zombiesNearbyJsonString = new JSONObject().put("JSON", "Hello, World!").toString();
        return zombiesNearbyJsonString;
    }


}
