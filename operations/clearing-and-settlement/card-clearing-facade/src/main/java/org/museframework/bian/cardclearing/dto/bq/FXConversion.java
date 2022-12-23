/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cardclearing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FXConversion {
    /*The FX rates and fees that are applied to the transactions*/
    @MetaField
    private String FXConversionRatesandFees;

    /*Details of the transaction FX conversion*/
    @MetaField
    private String FXConversionTaskResult;

    public void setFXConversionRatesandFees(String FXConversionRatesandFees) {
        this.FXConversionRatesandFees = FXConversionRatesandFees;
    }

    public String getFXConversionRatesandFees() {
        return FXConversionRatesandFees;
    }

    public void setFXConversionTaskResult(String FXConversionTaskResult) {
        this.FXConversionTaskResult = FXConversionTaskResult;
    }

    public String getFXConversionTaskResult() {
        return FXConversionTaskResult;
    }
}