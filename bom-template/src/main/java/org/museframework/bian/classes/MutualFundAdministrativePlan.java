/*A plan to administer the Mutual Fund to handle all aspects of the set-up and operation of mutual funds that can be offered to the bank's general (non-accredited) customers
*/
package org.museframework.bian.classes;

public class MutualFundAdministrativePlan {
    /**/
    private org.museframework.bian.enumerations.Mutualfundadministrativeplannedactiontypevalues mutualFundAdministrativePlannedActionType;

    public void setMutualFundAdministrativePlannedActionType(org.museframework.bian.enumerations.Mutualfundadministrativeplannedactiontypevalues mutualFundAdministrativePlannedActionType) {
        this.mutualFundAdministrativePlannedActionType = mutualFundAdministrativePlannedActionType;
    }

    public org.museframework.bian.enumerations.Mutualfundadministrativeplannedactiontypevalues getMutualFundAdministrativePlannedActionType() {
        return mutualFundAdministrativePlannedActionType;
    }
}