/*A bank guarantee refers to a commercial or financial instrument that is provided by a bank, where the bank assures or guarantees a beneficiary that it will make the payment to the bank in case the actual customer fails to meet his or her obligations*/
package org.museframework.bian.classes;

public class BankGuarantee {
    /**/
    private String bankGuaranteeType;

    public void setBankGuaranteeType(String bankGuaranteeType) {
        this.bankGuaranteeType = bankGuaranteeType;
    }

    public String getBankGuaranteeType() {
        return bankGuaranteeType;
    }
}