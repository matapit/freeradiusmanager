package com.example.ionlink.entities;
/***********************************************************************
 * Module:  Recharge.java
 * Author:  MOULIOM
 * Purpose: Defines the Class Recharge
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.*;
@Entity
/** @pdOid ded9b542-1d14-4b82-bb71-6a1c86fabb60 */
public class Recharge implements Serializable {
   @Id @GeneratedValue
   /** @pdOid 4b652847-f4a7-4e46-9d82-4a2578a0c18f */
   private int id;
   /** @pdOid da549cd3-f5ff-4656-ad51-40586df3db5b */
   private int mobilemoney;
   /** @pdOid f87b2f69-5110-4352-a285-db2190604db7 */
   private int amount;
   @ManyToOne
   /** @pdRoleInfo migr=no name=Customer assc=association9 mult=1..1 side=A */
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
            oldCustomer.removeRecharge(this);
         }
         if (newCustomer != null)
         {
            this.customer = newCustomer;
            this.customer.addRecharge(this);
         }
      }
   }

}