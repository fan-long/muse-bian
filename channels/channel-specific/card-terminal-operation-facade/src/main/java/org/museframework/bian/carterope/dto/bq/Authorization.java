/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.carterope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Authorization {
    /*The date time the authorization is obtained*/
    @MetaField
    private String authorizationTransactionDateTime;

    public void setAuthorizationTransactionDateTime(String authorizationTransactionDateTime) {
        this.authorizationTransactionDateTime = authorizationTransactionDateTime;
    }

    public String getAuthorizationTransactionDateTime() {
        return authorizationTransactionDateTime;
    }
}