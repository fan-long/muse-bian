/*A financial transaction concerning the exchange of security 

Exchange of securities. (ISO20022)
*/
package org.museframework.bian.classes;

public class SecuritiesTransaction {
    /**/
    private String securitiesTransactionDateTime;

    public void setSecuritiesTransactionDateTime(String securitiesTransactionDateTime) {
        this.securitiesTransactionDateTime = securitiesTransactionDateTime;
    }

    public String getSecuritiesTransactionDateTime() {
        return securitiesTransactionDateTime;
    }
}