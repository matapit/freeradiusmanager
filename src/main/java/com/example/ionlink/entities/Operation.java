package com.example.ionlink.entities;
/***********************************************************************
 * Module:  Operation.java
 * Author:  MOULIOM
 * Purpose: Defines the Class Operation
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.*;
@Entity
/** @pdOid 1a7c9a18-3a28-4219-a817-2c208d4c93ae */
public class Operation implements Serializable {
   @Id
   /** @pdOid 03048986-75c4-42ff-b670-89889f53f2d4 */
   private String code;
   /** @pdOid 47603347-0fb3-4c73-9060-b134cc8be5fe */
   private int date;
   /** @pdOid 11fdc7ac-ff80-41c6-ac4e-202017be98ce */
   private int amount;
   @ManyToOne
   /** @pdRoleInfo migr=no name=BillingPlan assc=association5 mult=1..1 */
   public BillingPlan billingPlan;
   @ManyToOne
   /** @pdRoleInfo migr=no name=Customer assc=association8 mult=1..1 side=A */
   public Customer customer;
   
   
   /** @pdGenerated default parent getter */
   public Customer getCustomer() {
      return customer;
   }
   
   /** @pdGenerated default parent setter
     * @param newCustomer */
   public void setCustomer(Customer newCustomer) {
      if (this.customer == null || !this.customer.equals(newCustomer))
      {
         if (this.customer != null)
         {
            Customer oldCustomer = this.customer;
            this.customer = null;
            oldCustomer.removeOperation(this);
         }
         if (newCustomer != null)
         {
            this.customer = newCustomer;
            this.customer.addOperation(this);
         }
      }
   }

}