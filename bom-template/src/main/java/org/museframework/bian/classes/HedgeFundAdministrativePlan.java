/*An Administrative Plan that handles all aspects of the set-up and operation of a hedge fund*/
package org.museframework.bian.classes;

public class HedgeFundAdministrativePlan {
    /**/
    private org.museframework.bian.enumerations.Hedgefundadministrativeplannedactiontypevalues hedgeFundAdministrativePlannedActionType;

    public void setHedgeFundAdministrativePlannedActionType(org.museframework.bian.enumerations.Hedgefundadministrativeplannedactiontypevalues hedgeFundAdministrativePlannedActionType) {
        this.hedgeFundAdministrativePlannedActionType = hedgeFundAdministrativePlannedActionType;
    }

    public org.museframework.bian.enumerations.Hedgefundadministrativeplannedactiontypevalues getHedgeFundAdministrativePlannedActionType() {
        return hedgeFundAdministrativePlannedActionType;
    }
}