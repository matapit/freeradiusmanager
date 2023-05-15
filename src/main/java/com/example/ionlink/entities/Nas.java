package com.example.ionlink.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/***********************************************************************
 * Module:  nas.java
 * Author:  MOULIOM
 * Purpose: Defines the Class nas
 ***********************************************************************/
@Entity
/** @pdOid 34bcd72f-3707-412b-b7b7-ede0d6685e2d */
public class Nas implements Serializable {
   @Id @GeneratedValue
   /** @pdOid 6d21ec9d-9aa1-47bb-872a-ca7b36aedc92 */
   private Long Id;
   /** @pdOid 25d6dbae-de2e-4c76-b738-ac3f5c28b4c6 */
   private java.lang.String nasname;
   /** @pdOid 0f66bae9-c77f-4825-b701-9624022df151 */
   private java.lang.String shortname;
   /** @pdOid e6782201-3fff-4dba-b02b-be0c12ec7ba6 */
   private java.lang.String Type;
   /** @pdOid 0ac6567b-9bfb-4717-9389-e2cc4555589a */
   private int ports;
   /** @pdOid 166e427b-338a-44fe-bd03-aa4ecae1117e */
   private java.lang.String secret;
   /** @pdOid 6b3dce2a-e438-42db-b43c-a30a07b0c0f5 */
   private java.lang.String server;
   /** @pdOid f3299a44-80ae-45d8-b43c-e3148a9a0637 */
   private java.lang.String community;
   /** @pdOid 59612983-83b2-4b31-be38-1b3b51dc0ffb */
   private int Description;

}