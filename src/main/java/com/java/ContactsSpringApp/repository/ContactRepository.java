/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.ContactsSpringApp.repository;

import com.java.ContactsSpringApp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author camilabarbosa
 */
public interface ContactRepository extends JpaRepository<Contact, Integer>{
    
}
