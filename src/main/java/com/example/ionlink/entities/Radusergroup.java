package com.example.ionlink.entities;
/***********************************************************************
 * Module:  radusergroup.java
 * Author:  MOULIOM
 * Purpose: Defines the Class radusergroup
 ***********************************************************************/

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
/** @pdOid 4bf61f45-c2e6-461e-b195-bc0134629147 */
public class  Radusergroup implements Serializable {
   @Id @GeneratedValue
   /** @pdOid 7671a839-b268-441b-9688-2e3e5152a973 */
   private int id;
   /** @pdOid abc45d2e-98ef-4d5f-8d48-43785ce61e9b */
   private String username;
   /** @pdOid df92b675-f767-45cf-9df9-c5ad294b2d86 */
   private String groupname;
   /** @pdOid 7d962405-2641-4c9e-a533-e4f9a5d89314 */
   private int priority;

   public Radusergroup(String username, String groupname, int priority) {
      this.username = username;
      this.groupname = groupname;
      this.priority = priority;
   }

   public Radusergroup() {
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      username = username;
   }

   public String getGroupname() {
      return groupname;
   }

   public void setGroupname(String groupname) {
      groupname = groupname;
   }

   public int getPriority() {
      return priority;
   }

   public void setPriority(int priority) {
      this.priority = priority;
   }
}