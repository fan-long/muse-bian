/*An evaluation of model.*/
package org.museframework.bian.classes;

public class ModelTest {
    /*Defines the type of test (e.g. unit, integration, load, user acceptance etc.)
*/
    private String modelTestType;

    /*Reference to the testing environment used to apply the test.
*/
    private String modelTestHarness;

    /**/
    private String modelTestActivity;

    /**/
    private String modelTestResult;

    public void setModelTestType(String modelTestType) {
        this.modelTestType = modelTestType;
    }

    public String getModelTestType() {
        return modelTestType;
    }

    public void setModelTestHarness(String modelTestHarness) {
        this.modelTestHarness = modelTestHarness;
    }

    public String getModelTestHarness() {
        return modelTestHarness;
    }

    public void setModelTestActivity(String modelTestActivity) {
        this.modelTestActivity = modelTestActivity;
    }

    public String getModelTestActivity() {
        return modelTestActivity;
    }

    public void setModelTestResult(String modelTestResult) {
        this.modelTestResult = modelTestResult;
    }

    public String getModelTestResult() {
        return modelTestResult;
    }
}