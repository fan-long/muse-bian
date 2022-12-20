/*A measure taken to check the quality, performance, or reliability of (something), especially before putting it into widespread use or practice.*/
package org.museframework.bian.classes;

public class Test {
    /**/
    private String testResult;

    /**/
    private String testGuidance;

    /**/
    private String testType;

    /**/
    private String testDescription;

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestGuidance(String testGuidance) {
        this.testGuidance = testGuidance;
    }

    public String getTestGuidance() {
        return testGuidance;
    }

    public void setTestType(String testType) {
        this.testType = testType;
    }

    public String getTestType() {
        return testType;
    }

    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }

    public String getTestDescription() {
        return testDescription;
    }
}