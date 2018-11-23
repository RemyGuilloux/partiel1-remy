package fr.formation.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.formation.partiel1.Rib;

/**
 * @author Administrateur
 */
@Path("rib")
public class RibController {

    private final static Map<String, Rib> RIBS = new HashMap<>();
    {
	RIBS.put("a", buildFirstRib());
	RIBS.put("b", buildSecondRib());
    }

    /**
     * @param rib
     * @return
     */
    @GET
    @Path("/one")
    @Produces(MediaType.APPLICATION_JSON)
    public Rib one() {
	return RIBS.get("a");
    }

    /**
     * @param rib
     * @return
     */
    private static Rib buildFirstRib() {
	int bankCode = 30002;
	int boxCode = 00550;
	String accountNumber = "0000157841Z";
	int keyRib = 25;
	Rib rib = new Rib(bankCode, boxCode, accountNumber, keyRib);
	return rib;
    }

    /**
     * @param rib
     * @return
     */
    private static Rib buildSecondRib() {
	int bankCode = 30002;
	int boxCode = 00650;
	String accountNumber = "0000157841X";
	int keyRib = 24;
	Rib rib = new Rib(bankCode, boxCode, accountNumber, keyRib);
	return rib;
    }
}
