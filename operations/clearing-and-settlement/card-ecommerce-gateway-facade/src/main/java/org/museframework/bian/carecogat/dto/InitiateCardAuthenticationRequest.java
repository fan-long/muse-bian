package org.museframework.bian.carecogat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCardAuthenticationRequest {
    @MetaField
    private String cardecommercegatewayid;

    @MetaField
    private String cardauthenticationid;

    @MetaField(ref=true)
    private org.museframework.bian.carecogat.dto.bq.CardAuthentication cardAuthentication;

    public void setCardecommercegatewayid(String cardecommercegatewayid) {
        this.cardecommercegatewayid = cardecommercegatewayid;
    }

    public String getCardecommercegatewayid() {
        return cardecommercegatewayid;
    }

    public void setCardauthenticationid(String cardauthenticationid) {
        this.cardauthenticationid = cardauthenticationid;
    }

    public String getCardauthenticationid() {
        return cardauthenticationid;
    }

    public void setCardAuthentication(org.museframework.bian.carecogat.dto.bq.CardAuthentication cardAuthentication) {
        this.cardAuthentication = cardAuthentication;
    }

    public org.museframework.bian.carecogat.dto.bq.CardAuthentication getCardAuthentication() {
        return cardAuthentication;
    }
}