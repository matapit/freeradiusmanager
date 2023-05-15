package com.example.ionlink.dao;

import com.example.ionlink.entities.Radusergroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RadusergroupRepository extends JpaRepository<Radusergroup, Long> {
    Radusergroup findByUsernameAndGroupname(String name,  String groupname);
}
