package fr.formation.partiel1;

import java.util.Objects;

/**
 * @author Administrateur
 */
public class IndividualAccount {

    public String countryCode;

    public int controlKey;

    public Rib rib;

    /**
     * @param countryCode
     * @param controlKey
     * @param rib
     */
    public IndividualAccount(String countryCode, int controlKey, Rib rib) {
	this.countryCode = countryCode;
	this.controlKey = controlKey;
	this.rib = rib;
    }

    /**
     * @return
     */
    public String getCountryCode() {
	return countryCode;
    }

    /**
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
	Objects.requireNonNull(countryCode, "countryCode must be declared");
	this.countryCode = countryCode;
    }

    /**
     * @return
     */
    public int getControlKey() {
	return controlKey;
    }

    /**
     * @param controlKey
     */
    public void setControlKey(int controlKey) {
	Objects.requireNonNull(controlKey, "controlKey must be declared");
	this.controlKey = controlKey;
    }

    /**
     * @return
     */
    public Rib getRib() {
	return rib;
    }

    /**
     * @param rib
     */
    public void setRib(Rib rib) {
	Objects.requireNonNull(rib, "rib must be declared");
	this.rib = rib;
    }
}
