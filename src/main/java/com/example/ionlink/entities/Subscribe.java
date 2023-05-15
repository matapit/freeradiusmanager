package com.example.ionlink.entities; /***********************************************************************
 * Module:  Subscribe.java
 * Author:  MOULIOM
 * Purpose: Defines the Class Subscribe
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.*;

/** @pdOid d9e23793-c0e2-42d1-bd44-be25e2f0aa41 */
public class Subscribe {
   @Id
   @GeneratedValue
   /** @pdOid 7671a839-b268-441b-9688-2e3e5152a973 */
   private int id;
   /** @pdOid 37e1836d-6883-4f7c-88fd-1e38f63704d7 */
   private java.util.Date dateStart;
   /** @pdOid deb1fb0e-9e13-4154-8477-bb50a554fed3 */
   private java.util.Date dateEnd;

   /** @pdRoleInfo migr=no name=billing_plan assc=association10 mult=1..1 */
   public BillingPlan billing_plan;
   /** @pdRoleInfo migr=no name=radusergroup assc=association11 mult=1..1 */
   public Radusergroup radusergroup;
   /** @pdRoleInfo migr=no name=customer assc=association2 mult=1..1 side=A */
   public Customer customer;

}