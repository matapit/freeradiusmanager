package com.example.ionlink.entities;
/***********************************************************************
 * Module:  Radcheck.java
 * Author:  MOULIOM
 * Purpose: Defines the Class Radcheck
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.*;
@Entity
/** @pdOid 61ff46a5-7fb5-43ae-a867-eea34f4018f2 */
public class Radcheck implements Serializable {
   @Id @GeneratedValue
   /** @pdOid 7a45b6c0-720a-4532-9bcb-08a8c4e13074 */
   private Long id;
   /** @pdOid 56257656-9280-4acd-a50f-643216147fc6 */
   private java.lang.String Username;
   /** @pdOid 400056aa-f265-4291-9f06-45fefef46b2d */
   private java.lang.String attribute;
   /** @pdOid 15e2929c-7566-46bd-842a-31f8abcd3f0b */
   private String op;
   /** @pdOid 4ea4c3c2-b90e-4ab4-bd7f-cb9923af0292 */
   private java.lang.String value;

   public Radcheck(String username, String attribute, String op, String value) {
      Username = username;
      this.attribute = attribute;
      this.op = op;
      this.value = value;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getUsername() {
      return Username;
   }

   public void setUsername(String username) {
      Username = username;
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