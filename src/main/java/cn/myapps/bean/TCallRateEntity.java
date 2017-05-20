package cn.myapps.bean;

import javax.persistence.*;

/**
 * Created by wanggan on 2017/5/19.
 */
@Entity
@Table(name = "t_call_rate", schema = "test", catalog = "")
public class TCallRateEntity {
    private int cId;
    private String country;
    private String callPrefixNum;
    private int billingCycle;
    private double perSecondRate;
    private String remarks;

    @Id
    @Column(name = "c_id")
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "call_prefix_num")
    public String getCallPrefixNum() {
        return callPrefixNum;
    }

    public void setCallPrefixNum(String callPrefixNum) {
        this.callPrefixNum = callPrefixNum;
    }

    @Basic
    @Column(name = "billing_cycle")
    public int getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(int billingCycle) {
        this.billingCycle = billingCycle;
    }

    @Basic
    @Column(name = "per_second_rate")
    public double getPerSecondRate() {
        return perSecondRate;
    }

    public void setPerSecondRate(double perSecondRate) {
        this.perSecondRate = perSecondRate;
    }

    @Basic
    @Column(name = "remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TCallRateEntity that = (TCallRateEntity) o;

        if (cId != that.cId) return false;
        if (billingCycle != that.billingCycle) return false;
        if (Double.compare(that.perSecondRate, perSecondRate) != 0) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (callPrefixNum != null ? !callPrefixNum.equals(that.callPrefixNum) : that.callPrefixNum != null)
            return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = cId;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (callPrefixNum != null ? callPrefixNum.hashCode() : 0);
        result = 31 * result + billingCycle;
        temp = Double.doubleToLongBits(perSecondRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }
}
