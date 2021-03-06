/*
 * NeutrinoAPI
 *
 * This file was automatically generated for NeutrinoAPI by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.neutrinoapi.sdk.models;

import java.util.*;

public class HLRLookupResponseBuilder {
    //the instance to build
    private HLRLookupResponse hLRLookupResponse;

    /**
     * Default constructor to initialize the instance
     */
    public HLRLookupResponseBuilder() {
        hLRLookupResponse = new HLRLookupResponse();
    }

    /**
     * Is this a valid phone number (mobile or otherwise)
     */
    public HLRLookupResponseBuilder numberValid(boolean numberValid) {
        hLRLookupResponse.setNumberValid(numberValid);
        return this;
    }

    /**
     * Numbers international calling code
     */
    public HLRLookupResponseBuilder internationalCallingCode(String internationalCallingCode) {
        hLRLookupResponse.setInternationalCallingCode(internationalCallingCode);
        return this;
    }

    /**
     * The mobile MNC number (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder mnc(String mnc) {
        hLRLookupResponse.setMnc(mnc);
        return this;
    }

    /**
     * The number type, possible values are: mobile, fixed-line, premium-rate, toll-free, voip, unknown
     */
    public HLRLookupResponseBuilder numberType(String numberType) {
        hLRLookupResponse.setNumberType(numberType);
        return this;
    }

    /**
     * Was the HLR lookup successful. If true then this is a working and registered cell-phone or mobile device (SMS and phone calls will be delivered)
     */
    public HLRLookupResponseBuilder hlrValid(boolean hlrValid) {
        hLRLookupResponse.setHlrValid(hlrValid);
        return this;
    }

    /**
     * The HLR lookup status. See API docs for specific status details
     */
    public HLRLookupResponseBuilder hlrStatus(String hlrStatus) {
        hLRLookupResponse.setHlrStatus(hlrStatus);
        return this;
    }

    /**
     * If the number has been ported, the ported to mobile carrier name (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder portedNetwork(String portedNetwork) {
        hLRLookupResponse.setPortedNetwork(portedNetwork);
        return this;
    }

    /**
     * The mobile IMSI number (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder imsi(String imsi) {
        hLRLookupResponse.setImsi(imsi);
        return this;
    }

    /**
     * The mobile MCC number (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder mcc(String mcc) {
        hLRLookupResponse.setMcc(mcc);
        return this;
    }

    /**
     * Number represented in international format
     */
    public HLRLookupResponseBuilder internationalNumber(String internationalNumber) {
        hLRLookupResponse.setInternationalNumber(internationalNumber);
        return this;
    }

    /**
     * Number represented in local format
     */
    public HLRLookupResponseBuilder localNumber(String localNumber) {
        hLRLookupResponse.setLocalNumber(localNumber);
        return this;
    }

    /**
     * Number location ISO 2-letter country code
     */
    public HLRLookupResponseBuilder countryCode(String countryCode) {
        hLRLookupResponse.setCountryCode(countryCode);
        return this;
    }

    /**
     * Has this number been ported to another network
     */
    public HLRLookupResponseBuilder isPorted(boolean isPorted) {
        hLRLookupResponse.setIsPorted(isPorted);
        return this;
    }

    /**
     * The mobile MSIN number (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder msin(String msin) {
        hLRLookupResponse.setMsin(msin);
        return this;
    }

    /**
     * Number location (could be a city, region or country)
     */
    public HLRLookupResponseBuilder location(String location) {
        hLRLookupResponse.setLocation(location);
        return this;
    }

    /**
     * The origin mobile carrier name (only set if HLR lookup valid)
     */
    public HLRLookupResponseBuilder originNetwork(String originNetwork) {
        hLRLookupResponse.setOriginNetwork(originNetwork);
        return this;
    }

    /**
     * Is this a mobile number
     */
    public HLRLookupResponseBuilder isMobile(boolean isMobile) {
        hLRLookupResponse.setIsMobile(isMobile);
        return this;
    }

    /**
     * Is this number currently roaming from its origin country
     */
    public HLRLookupResponseBuilder isRoaming(boolean isRoaming) {
        hLRLookupResponse.setIsRoaming(isRoaming);
        return this;
    }

    /**
     * The phone number country
     */
    public HLRLookupResponseBuilder country(String country) {
        hLRLookupResponse.setCountry(country);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public HLRLookupResponse build() {
        return hLRLookupResponse;
    }
}