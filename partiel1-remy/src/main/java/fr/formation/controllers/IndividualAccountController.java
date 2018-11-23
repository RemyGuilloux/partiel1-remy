package fr.formation.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.formation.partiel1.IndividualAccount;

@Path("individualAccount")
public class IndividualAccountController {

    private final static Map<String, IndividualAccount> ACCOUNTS = new HashMap<>();
    {
	ACCOUNTS.put("1", buildFirstAccount());
	ACCOUNTS.put("2", buildSecondAccount());
    }

    @GET
    @Path("/one")
    @Produces(MediaType.APPLICATION_JSON)
    public IndividualAccount one() {
	return ACCOUNTS.get("1");
    }

    private static IndividualAccount buildFirstAccount() {
	String countryCode = "fr";
	int controlKey = 33;
    }

    private IndividualAccount buildSecondAccount() {
	String countryCode = "fr";
	int controlKey = 34;
    }

    private IndividualAccount buildSecondAccount() {
	return null;
    }
}
