package fr.formation.partiel1;

import java.util.Objects;

/**
 * @author Administrateur
 */
public class Rib {

    private int bankCode;

    private int boxCode;

    private String accountNumber;

    private int keyRib;

    /**
     * @param bankCode
     * @param boxCode
     * @param accountNumber
     * @param keyRib
     */
    public Rib(int bankCode, int boxCode, String accountNumber, int keyRib) {
	this.bankCode = bankCode;
	this.boxCode = boxCode;
	this.accountNumber = accountNumber;
	this.keyRib = keyRib;
    }

    /**
     * @return
     */
    public int getBankCode() {
	return bankCode;
    }

    /**
     * @param bankCode
     */
    public void setBankCode(int bankCode) {
	Objects.requireNonNull(bankCode, "banCode must be declared");
	this.bankCode = bankCode;
    }

    /**
     * @return
     */
    public int getBoxCode() {
	return boxCode;
    }

    /**
     * @param boxCode
     */
    public void setBoxCode(int boxCode) {
	Objects.requireNonNull(boxCode, "boxCode must be declared");
	this.boxCode = boxCode;
    }

    /**
     * @return
     */
    public String getAccountNumber() {
	return accountNumber;
    }

    /**
     * @param accountNumber
     */
    public void setAccountNumber(String accountNumber) {
	Objects.requireNonNull(accountNumber, "accountNumber must be declared");
	this.accountNumber = accountNumber;
    }

    /**
     * @return
     */
    public int getKeyRib() {
	return keyRib;
    }

    /**
     * @param keyRib
     */
    public void setKeyRib(int keyRib) {
	Objects.requireNonNull(keyRib, "keyRib must be declared");
	this.keyRib = keyRib;
    }
}
