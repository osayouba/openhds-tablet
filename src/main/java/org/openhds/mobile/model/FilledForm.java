package org.openhds.mobile.model;

/**
 * A filled form represents an ODK form that has been prefilled with values from
 * the OpenHDS application.
 */
public class FilledForm {
    private String formName;
    
    private String visitExtId;
    private String visitDate;
    private String roundNumber;
    private String locationId;
    private String houseName;
    private String fieldWorkerId;

    private String householdId;
    private String householdName;

    private String individualExtId;
    private String motherExtId;
    private String fatherExtId;
    private String individualFirstName;
    private String individualLastName;
    private String individualGender;
    private String individualDob;
    private String hierarchyId;
    private String latlong;
    private String child1Id;
    private String child2Id;
    private String childFatherId;
    private String childFatherFirstName;
    private String childFatherLastName;
    private String manId;
    private String womanId;
    
    public FilledForm(String formName) {
        this.formName = formName;
    }

    public String getFormName() {
        return formName;
    }

    public String getVisitExtId() {
        return visitExtId;
    }

    public void setVisitExtId(String visitExtId) {
        this.visitExtId = visitExtId;
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    public String getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(String roundNumber) {
        this.roundNumber = roundNumber;
    }

    public String getLocationId() {
        return locationId;
    }
    
    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getFieldWorkerId() {
        return fieldWorkerId;
    }

    public void setFieldWorkerId(String fieldWorkerId) {
        this.fieldWorkerId = fieldWorkerId;
    }

    public String getHouseholdId() {
        return householdId;
    }

    public void setHouseholdId(String householdId) {
        this.householdId = householdId;
    }

    public String getHouseholdName() {
        return householdName;
    }

    public void setHouseholdName(String householdName) {
        this.householdName = householdName;
    }

    public String getIndividualExtId() {
        return individualExtId;
    }

    public void setIndividualExtId(String individualExtId) {
        this.individualExtId = individualExtId;
    }

    public String getMotherExtId() {
        return motherExtId;
    }

    public void setMotherExtId(String motherExtId) {
        this.motherExtId = motherExtId;
    }

    public String getFatherExtId() {
        return fatherExtId;
    }

    public void setFatherExtId(String fatherExtId) {
        this.fatherExtId = fatherExtId;
    }

    public String getIndividualFirstName() {
        return individualFirstName;
    }

    public void setIndividualFirstName(String individualFirstName) {
        this.individualFirstName = individualFirstName;
    }

    public String getIndividualLastName() {
        return individualLastName;
    }

    public void setIndividualLastName(String individualLastName) {
        this.individualLastName = individualLastName;
    }

    public String getIndividualGender() {
        return individualGender;
    }

    public void setIndividualGender(String individualGender) {
        this.individualGender = individualGender;
    }

    public String getIndividualDob() {
        return individualDob;
    }

    public void setIndividualDob(String individualDob) {
        this.individualDob = individualDob;
    }

    public String getHierarchyId() {
        return hierarchyId;
    }

    public void setHierarchyId(String hierarchyId) {
        this.hierarchyId = hierarchyId;
    }

    public String getLatlong() {
        return latlong;
    }

    public void setLatlong(String latlong) {
        this.latlong = latlong;
    }

    public String getChild1Id() {
        return child1Id;
    }

    public void setChild1Id(String child1Id) {
        this.child1Id = child1Id;
    }

    public String getChild2Id() {
        return child2Id;
    }

    public void setChild2Id(String child2Id) {
        this.child2Id = child2Id;
    }

    public String getChildFatherId() {
        return childFatherId;
    }

    public void setChildFatherId(String childFatherId) {
        this.childFatherId = childFatherId;
    }

    public String getChildFatherFirstName() {
        return childFatherFirstName;
    }

    public void setChildFatherFirstName(String childFatherFirstName) {
        this.childFatherFirstName = childFatherFirstName;
    }

    public String getChildFatherLastName() {
        return childFatherLastName;
    }

    public void setChildFatherLastName(String childFatherLastName) {
        this.childFatherLastName = childFatherLastName;
    }

    public String getManId() {
        return manId;
    }

    public void setManId(String manId) {
        this.manId = manId;
    }

    public String getWomanId() {
        return womanId;
    }

    public void setWomanId(String womanId) {
        this.womanId = womanId;
    }

}
