/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.consumerinvestments.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Quote extends org.museframework.bian.classes.Quote {
    /*The prevailing bank buy/sell quote for the security*/
    @MetaField
    private String securitiesPrice;

    public void setSecuritiesPrice(String securitiesPrice) {
        this.securitiesPrice = securitiesPrice;
    }

    public String getSecuritiesPrice() {
        return securitiesPrice;
    }
}