/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.ContactsSpringApp.controller;


import com.java.ContactsSpringApp.model.Contact;
import com.java.ContactsSpringApp.repository.ContactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author camilabarbosa
 */
@Controller
public class ContactList {
    
    @Autowired
    ContactRepository contactRepository;
    
    @RequestMapping ({"/contactList", "/"})
    public String contactList(Model model){
        
        List<Contact> contactList =   contactRepository.findAll();
    
        System.out.println("CONTACTLIST: " + contactList.size());
        model.addAttribute("contactList", contactList);
        
        return "contactList";
        
    }
    
     @RequestMapping ("/addContact")
    public String addContact(){
        return "addContact";
    }
    
   @RequestMapping ("/editContact")
    public String editContact(Model model, @RequestParam("id") Integer id) {

        Contact contact = contactRepository.getById(id);
 
        model.addAttribute("Contact", contact);
        return "editContact";
    } 
    
    
    @RequestMapping ("/deleteContact")
    public String deleteContact(Model model, @RequestParam("id") Integer id){

        Contact contact = contactRepository.getById(id);
        model.addAttribute("Contact", contact);
        return "deleteContact";
    } 
    
    @RequestMapping (value="/saveEdition", method= RequestMethod.POST )
    public String saveEdition(@ModelAttribute Contact contact){
        
        Contact contactToBeSaved = contactRepository.getById(contact.getId());
        contactRepository.save(contact);
        return "forward:contactList";
    }
    
    @RequestMapping (value="/confirmationDelete", method= RequestMethod.POST )
    public String confirmationDelete(@ModelAttribute Contact contact){
        
        contactRepository.deleteById(contact.getId());
        return "forward:contactList";
    }
    @RequestMapping (value="/saveAdd", method= RequestMethod.POST )
    public String saveAdd(@ModelAttribute Contact contact){

        contactRepository.save(contact);
        return "forward:contactList";
    }
    
}



