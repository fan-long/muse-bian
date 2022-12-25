/*The sub-tasks involved in the execution of the financial transaction*/
package org.museframework.bian.consumerinvestments.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Quote
@MetaDto
public class Quote {
    /*The prevailing bank buy/sell quote for the security*/
    @MetaField(0)
    private String securitiesPrice;

    public void setSecuritiesPrice(String securitiesPrice) {
        this.securitiesPrice = securitiesPrice;
    }

    public String getSecuritiesPrice() {
        return securitiesPrice;
    }
}