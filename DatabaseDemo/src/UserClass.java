/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author San
 */
public class UserClass {
    
    private int id;
    private String name;
    private String faculty;
    private String contact;
    
    public UserClass(){       
    }
    
    public UserClass(int Id,String Name, String Faculty, String Contact){
        this.name    = Name;
        this.faculty = Faculty;
        this.contact = Contact;
        this.id = Id;
    }
     public void set_name(String Name){
        this.name = Name;
    }
    public void set_faculty(String Faculty){
        this.faculty  = Faculty;
    }
    public void set_contact(String Contact){
        this.contact = Contact;
    }    
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }    public String getContact(){
        return contact;
    }
    public String getFaculty(){
        return faculty;
    }
}
