package com.example.ionlink.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Radgroupreply implements Serializable {
    @Id
    @GeneratedValue
    /** @pdOid 3632dfa0-c844-475f-acb2-360057ba83cb */
    private Long id;
    @ManyToOne
    @JoinColumn(name = "groupname", referencedColumnName = "label")
    /** @pdOid c818371f-03cf-401d-a987-d6c59a0832f3 */
    private BillingPlan groupname;
    /** @pdOid 8b9f8ed7-5a9f-4371-a13c-b4a11a17ad71 */
    private java.lang.String attribute;
    /** @pdOid ffa2789a-81d7-4441-8666-ea8b44e7d5f5 */
    private java.lang.String op;
    /** @pdOid d105bffe-746c-4cbd-a619-78259dd1f642 */
    private java.lang.String value;

    public Radgroupreply(BillingPlan groupname, String attribute, String op, String value) {
        this.groupname = groupname;
        this.attribute = attribute;
        this.op = op;
        this.value = value;
    }

    public Radgroupreply() {
    }

    public BillingPlan getGroupname() {
        return groupname;
    }

    public void setGroupname(BillingPlan groupname) {
        this.groupname = groupname;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
