/*Maintain a membership for some group or related collection of parties within Syndicate Management. */
package org.museframework.bian.syndicatemanagement.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SyndicateMembership {
    /*A Classification value that distinguishes between enrollments according to the type of business services and/or type of concern defined within Syndicate Membership*/
    @MetaField
    private String syndicateMembershipParameterType;

    /*A selected optional business service as subject matter of Syndicate Membership*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Service syndicateMembershipSelectedOption;

    /*Request to enroll Syndicate Membership*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction syndicateMembershipRequest;

    /*Reference to  Syndicate Membership Plan*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan syndicateMembershipPlan;

    /*Liability or duty to do something under the terms of Syndicate Membership*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement syndicateMembershipObligation;

    /*Right to do something under the terms of Syndicate Membership*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement syndicateMembershipEntitlement;

    /*An unique reference to an item or an occurrence of Syndicate Membership*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object syndicateMembershipReference;

    public void setSyndicateMembershipParameterType(String syndicateMembershipParameterType) {
        this.syndicateMembershipParameterType = syndicateMembershipParameterType;
    }

    public String getSyndicateMembershipParameterType() {
        return syndicateMembershipParameterType;
    }

    public void setSyndicateMembershipSelectedOption(org.museframework.bian.classes.Service syndicateMembershipSelectedOption) {
        this.syndicateMembershipSelectedOption = syndicateMembershipSelectedOption;
    }

    public org.museframework.bian.classes.Service getSyndicateMembershipSelectedOption() {
        return syndicateMembershipSelectedOption;
    }

    public void setSyndicateMembershipRequest(org.museframework.bian.classes.Instruction syndicateMembershipRequest) {
        this.syndicateMembershipRequest = syndicateMembershipRequest;
    }

    public org.museframework.bian.classes.Instruction getSyndicateMembershipRequest() {
        return syndicateMembershipRequest;
    }

    public void setSyndicateMembershipPlan(org.museframework.bian.classes.Plan syndicateMembershipPlan) {
        this.syndicateMembershipPlan = syndicateMembershipPlan;
    }

    public org.museframework.bian.classes.Plan getSyndicateMembershipPlan() {
        return syndicateMembershipPlan;
    }

    public void setSyndicateMembershipObligation(org.museframework.bian.classes.Arrangement syndicateMembershipObligation) {
        this.syndicateMembershipObligation = syndicateMembershipObligation;
    }

    public org.museframework.bian.classes.Arrangement getSyndicateMembershipObligation() {
        return syndicateMembershipObligation;
    }

    public void setSyndicateMembershipEntitlement(org.museframework.bian.classes.Arrangement syndicateMembershipEntitlement) {
        this.syndicateMembershipEntitlement = syndicateMembershipEntitlement;
    }

    public org.museframework.bian.classes.Arrangement getSyndicateMembershipEntitlement() {
        return syndicateMembershipEntitlement;
    }

    public void setSyndicateMembershipReference(org.museframework.bian.classes.Object syndicateMembershipReference) {
        this.syndicateMembershipReference = syndicateMembershipReference;
    }

    public org.museframework.bian.classes.Object getSyndicateMembershipReference() {
        return syndicateMembershipReference;
    }
}