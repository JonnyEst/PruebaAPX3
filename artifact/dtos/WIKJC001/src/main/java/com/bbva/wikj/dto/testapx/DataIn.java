package com.bbva.wikj.dto.testapx;

public class DataIn {

    private Integer amount;
    private String frecuency;
    private Integer percentageInterest;
    private Integer NumberInstalments;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getFrecuency() {
        return frecuency;
    }

    public void setFrecuency(String frecuency) {
        this.frecuency = frecuency;
    }

    public Integer getPercentageInterest() {
        return percentageInterest;
    }

    public void setPercentageInterest(Integer percentageInterest) {
        this.percentageInterest = percentageInterest;
    }

    public Integer getNumberInstalments() {
        return NumberInstalments;
    }

    public void setNumberInstalments(Integer numberInstalments) {
        NumberInstalments = numberInstalments;
    }

    @Override
    public String toString() {
        return "DataIn{" +
                "amount=" + amount +
                ", frecuency='" + frecuency + '\'' +
                ", percentageInterest=" + percentageInterest +
                ", NumberInstalments=" + NumberInstalments +
                '}';
    }
}
