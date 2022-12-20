/*An agreement between the lessor (owner of the asset) and the lessee (user of the asset) whereby the lessor purchases an asset for the lessee and allows him to use it in exchange for periodical payments called lease rentals or minimum lease payments (MLP). 

An agreement outlining the arrangements, terms and conditions under which one party agrees to rent property owned by another party (adapted from Investopedia)

https://www.investopedia.com/terms/l/lessee.asp*/
package org.museframework.bian.classes;

public class LeaseAgreement {
    /**/
    private String leaseAgreementType;

    public void setLeaseAgreementType(String leaseAgreementType) {
        this.leaseAgreementType = leaseAgreementType;
    }

    public String getLeaseAgreementType() {
        return leaseAgreementType;
    }
}