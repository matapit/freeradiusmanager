package com.example.ionlink.entities;
/***********************************************************************
 * Module:  Customer.java
 * Author:  MOULIOM
 * Purpose: Defines the Class Customer
 ***********************************************************************/

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
/** @pdOid 752508dc-af94-48e8-ad2a-2ecc5c2fed60 */
public class Customer implements Serializable {
   @Id @GeneratedValue
   /** @pdOid 6a6fa7ad-fce1-45dc-b807-f3c6feb5e881 */
   private Long id;
   /** @pdOid 68da4901-3c25-415a-bea6-319d75845d6c */
   private java.lang.String firstname;
   /** @pdOid 0806a188-1918-425c-a44c-4b9e45da418a */
   private java.lang.String lastname;
   /** @pdOid cad7db11-7c6e-4a86-a6be-8f68d6cd04e4 */
   private java.lang.String email;
   /** @pdOid 3e0c34c4-1fda-4d7e-abb0-1b6a14996133 */
   private java.lang.String department;
   /** @pdOid 9263b5ca-53e6-47b9-b4cd-627907235073 */
   private java.lang.String city;
   /** @pdOid f7be059c-b6dd-41b3-bc4b-7bdc3a59a834 */
   private java.lang.String address;
   /** @pdOid 5297f60c-fb4d-468c-85d0-721c2aa5c543 */
   private String mobilephone;
   /** @pdOid 5d5ffa49-7c78-4fce-ade2-d93a550c654f */
   private java.lang.String username;
   /** @pdOid e56d7061-a8dd-4819-ac75-d7e570ebedf9 */
   private String password;
   private String role;
   private boolean active;

   public Customer() {
   }

   public Customer(String firstname, String lastname, String email, String department, String city, String address, String mobilephone, String username, String password) {
      this.firstname = firstname;
      this.lastname = lastname;
      this.email = email;
      this.department = department;
      this.city = city;
      this.address = address;
      this.mobilephone = mobilephone;
      this.username = username;
      this.password = password;

   }

   @OneToOne
   /** @pdRoleInfo migr=no name=Radcheck assc=association7 mult=1..1 */
   public Radcheck radcheck;
   @ManyToOne
   /** @pdRoleInfo migr=no name=BillingPlan assc=association2 mult=1..1 */
   public BillingPlan billingPlan;
   @OneToMany(mappedBy = "customer")
   /** @pdRoleInfo migr=no name=Operation assc=association8 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Operation> operation;
   @OneToMany(mappedBy = "customer")
   /** @pdRoleInfo migr=no name=Recharge assc=association9 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Recharge> recharge;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstname() {
      return firstname;
   }

   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }

   public String getLastname() {
      return lastname;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getDepartment() {
      return department;
   }

   public void setDepartment(String department) {
      this.department = department;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getMobilephone() {
      return mobilephone;
   }

   public void setMobilephone(String mobilephone) {
      this.mobilephone = mobilephone;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getRole() {
      return role;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public boolean isActive() {
      return active;
   }

   public void setActive(boolean active) {
      this.active = active;
   }

   public Radcheck getRadcheck() {
      return radcheck;
   }

   public void setRadcheck(Radcheck radcheck) {
      this.radcheck = radcheck;
   }

   public BillingPlan getBillingPlan() {
      return billingPlan;
   }

   public void setBillingPlan(BillingPlan billingPlan) {
      this.billingPlan = billingPlan;
   }

   /** @pdGenerated default getter */
   public java.util.Collection<Operation> getOperation() {
      if (operation == null)
         operation = new java.util.HashSet<Operation>();
      return operation;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorOperation() {
      if (operation == null)
         operation = new java.util.HashSet<Operation>();
      return operation.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newOperation */
   public void setOperation(java.util.Collection<Operation> newOperation) {
      removeAllOperation();
      for (java.util.Iterator iter = newOperation.iterator(); iter.hasNext();)
         addOperation((Operation)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newOperation */
   public void addOperation(Operation newOperation) {
      if (newOperation == null)
         return;
      if (this.operation == null)
         this.operation = new java.util.HashSet<Operation>();
      if (!this.operation.contains(newOperation))
      {
         this.operation.add(newOperation);
         newOperation.setCustomer(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldOperation */
   public void removeOperation(Operation oldOperation) {
      if (oldOperation == null)
         return;
      if (this.operation != null)
         if (this.operation.contains(oldOperation))
         {
            this.operation.remove(oldOperation);
            oldOperation.setCustomer((Customer)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllOperation() {
      if (operation != null)
      {
         Operation oldOperation;
         for (java.util.Iterator iter = getIteratorOperation(); iter.hasNext();)
         {
            oldOperation = (Operation)iter.next();
            iter.remove();
            oldOperation.setCustomer((Customer)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Recharge> getRecharge() {
      if (recharge == null)
         recharge = new java.util.HashSet<Recharge>();
      return recharge;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorRecharge() {
      if (recharge == null)
         recharge = new java.util.HashSet<Recharge>();
      return recharge.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newRecharge */
   public void setRecharge(java.util.Collection<Recharge> newRecharge) {
      removeAllRecharge();
      for (java.util.Iterator iter = newRecharge.iterator(); iter.hasNext();)
         addRecharge((Recharge)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newRecharge */
   public void addRecharge(Recharge newRecharge) {
      if (newRecharge == null)
         return;
      if (this.recharge == null)
         this.recharge = new java.util.HashSet<Recharge>();
      if (!this.recharge.contains(newRecharge))
      {
         this.recharge.add(newRecharge);
         newRecharge.setCustomer(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param oldRecharge */
   public void removeRecharge(Recharge oldRecharge) {
      if (oldRecharge == null)
         return;
      if (this.recharge != null)
         if (this.recharge.contains(oldRecharge))
         {
            this.recharge.remove(oldRecharge);
            oldRecharge.setCustomer((Customer)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllRecharge() {
      if (recharge != null)
      {
         Recharge oldRecharge;
         for (java.util.Iterator iter = getIteratorRecharge(); iter.hasNext();)
         {
            oldRecharge = (Recharge)iter.next();
            iter.remove();
            oldRecharge.setCustomer((Customer)null);
         }
      }
   }

}