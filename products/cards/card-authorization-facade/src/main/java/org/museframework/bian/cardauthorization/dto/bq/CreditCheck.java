/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.cardauthorization.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditCheck {
    /*The returned available balance is used to perform credit check - uses product instance reference to identify account*/
    @MetaField(0)
    private String cardAccountavailablebalancecheckresult;

    public void setCardAccountavailablebalancecheckresult(String cardAccountavailablebalancecheckresult) {
        this.cardAccountavailablebalancecheckresult = cardAccountavailablebalancecheckresult;
    }

    public String getCardAccountavailablebalancecheckresult() {
        return cardAccountavailablebalancecheckresult;
    }
}