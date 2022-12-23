/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.parroupro.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Rating {
    /*Defines the type of rating (e.g. credit rating)*/
    @MetaField
    private String customerRelationshipRatingType;

    /*The maintained rating value (historical values may be retained as appropriate)*/
    @MetaField
    private String customerRelationshipRating;

    /*Explanation/description for given rating value if necessary*/
    @MetaField
    private String customerRelationshipRatingNarrative;

    /*Indication when the rate value is updated and time until given value applies/is relevant as appropriate*/
    @MetaField
    private String customerRelationshipRatingValidFromToDate;

    public void setCustomerRelationshipRatingType(String customerRelationshipRatingType) {
        this.customerRelationshipRatingType = customerRelationshipRatingType;
    }

    public String getCustomerRelationshipRatingType() {
        return customerRelationshipRatingType;
    }

    public void setCustomerRelationshipRating(String customerRelationshipRating) {
        this.customerRelationshipRating = customerRelationshipRating;
    }

    public String getCustomerRelationshipRating() {
        return customerRelationshipRating;
    }

    public void setCustomerRelationshipRatingNarrative(String customerRelationshipRatingNarrative) {
        this.customerRelationshipRatingNarrative = customerRelationshipRatingNarrative;
    }

    public String getCustomerRelationshipRatingNarrative() {
        return customerRelationshipRatingNarrative;
    }

    public void setCustomerRelationshipRatingValidFromToDate(String customerRelationshipRatingValidFromToDate) {
        this.customerRelationshipRatingValidFromToDate = customerRelationshipRatingValidFromToDate;
    }

    public String getCustomerRelationshipRatingValidFromToDate() {
        return customerRelationshipRatingValidFromToDate;
    }
}