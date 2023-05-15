package com.example.ionlink.entities;
/***********************************************************************
 * Module:  BillingPlan.java
 * Author:  MOULIOM
 * Purpose: Defines the Class BillingPlan
 ***********************************************************************/

import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.*;
@Entity
/** @pdOid 403f7122-23ec-4f2d-afea-57e4db039133 */
public class BillingPlan implements Serializable {
   @Id @GeneratedValue
   /** @pdOid 733d3ab0-c12a-4a85-a3b0-82f4bbbc50a1 */
   private Long id;
   /** @pdOid 38907cd4-0df7-4539-a870-1b6d4c4f2c2b */
   @NotNull
   @Size(min=3, max= 20)
   private String label;
   /** @pdOid a932bd8c-b26b-4f6c-a587-661bd58b7606 */
   private int price;
   /** @pdOid 8ca5e64d-10ae-4f7a-89cd-107e01b5c486 */
   private String description;
   /** @pdOid e1043bbf-c9a8-4af4-b233-9018f5e2ef17 */
   @NotNull
   private int bandwhithUp;
   /** @pdOid 49adb33c-630e-4ee2-ad3a-c4a23abc49e2 */
   @NotNull
   private int bandwhidthdown;
   @NotNull
   private long duration;
   @NotNull
   private int priority;
   private boolean sav;
   @OneToMany(mappedBy = "groupname")
   /** @pdRoleInfo migr=no name=Radgroupcheck assc=association6 mult=1..1 */
   public Collection<Radgroupcheck> radgroupchecks;

   @OneToMany(mappedBy = "groupname")
   /** @pdRoleInfo migr=no name=Radgroupcheck assc=association6 mult=1..1 */
   public Collection<Radgroupreply> radgroupreplies;
   @OneToMany(mappedBy = "billingPlan")
   /** @pdRoleInfo migr=no name=Customer assc=association2 mult=0..* side=A */
   public Collection<Customer>  customers;
   @OneToMany(mappedBy = "billingPlan")
   /** @pdRoleInfo migr=no name=Operation assc=association5 mult=0..* side=A */
   public Collection<Operation> operations;

   public BillingPlan() {
   }

   public BillingPlan(String label, int price, String description, int bandwhithUp, int bandwhidthdown, long duration, int priority, boolean sav) {
      this.label = label;
      this.price = price;
      this.description = description;
      this.bandwhithUp = bandwhithUp;
      this.bandwhidthdown = bandwhidthdown;
      this.duration = duration;
      this.priority = priority;
      this.sav = sav;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getLabel() {
      return label;
   }

   public void setLabel(String label) {
      this.label = label;
   }

   public int getPrice() {
      return price;
   }

   public void setPrice(int price) {
      this.price = price;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getBandwhithUp() {
      return bandwhithUp;
   }

   public void setBandwhithUp(int bandwhithUp) {
      this.bandwhithUp = bandwhithUp;
   }

   public int getBandwhidthdown() {
      return bandwhidthdown;
   }

   public void setBandwhidthdown(int bandwhidthdown) {
      this.bandwhidthdown = bandwhidthdown;
   }

   public Collection<Radgroupcheck> getRadgroupchecks() {
      return radgroupchecks;
   }

   public void setRadgroupcheck(Collection<Radgroupcheck> radgroupcheck) {
      this.radgroupchecks = radgroupcheck;
   }

   public Collection<Customer> getCustomer() {
      return customers;
   }

   public void setCustomer(Collection<Customer> customers) {
      this.customers = customers;
   }

   public Collection<Operation> getOperations() {
      return operations;
   }

   public void setOperation(Collection<Operation> operation) {
      this.operations = operation;
   }

   public long getDuration() {
      return duration;
   }

   public void setDuration(long duration) {
      this.duration = duration;
   }

   public int getPriority() {
      return priority;
   }

   public void setPriority(int priority) {
      this.priority = priority;
   }

   public boolean isSav() {
      return sav;
   }

   public void setSav(boolean sav) {
      this.sav = sav;
   }
}