/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Squizz;

/**
 *
 * @author user
 */
public class Person {

	//database of user

    private int id;
    private String name;
    private String pass;
    private String email;
    private String phone;
    private String type;
    private String registration_number;
    private Boolean is_certified;
    
    Person(int id,String name,String pass,String email,String phone,String type,String registration_number, Boolean is_cert){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
        this.registration_number = registration_number;
        this.type = type;
        this.is_certified = is_certified;
    }

    Person() {
    }
    
   
    public void setter(int id,String name,String pass,String email,String phone,String type,String registration_number, Boolean is_cert) {
 
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
        this.registration_number = registration_number;
        this.type = type;
        this.is_certified = is_certified;
 
    }
     public void set_id(int id){
        
        this.id = id;
    }
    
    public void set_name(String name){
        
        this.name = name;
    }
    public void set_pass(String pass){
        
         this.pass = pass;
    }
    
    
    public void set_email(String email){
        
       this.email = email;
    }
       
    public void set_phone(String phone){
        
        this.phone = phone;
    }
       
    public  void set_type(String type){
        
             this.type = type;
    }
    public void  set_registration_number(String registration_number){
        
        this.registration_number = registration_number;
    }
    
    public void set_is_certified(Boolean is_certified){
        this.is_certified = is_certified;
        
    }
    
        public int get_id() {

           return (this.id);
        }
       
       public String get_name(){
           
           return (this.name);
       }
    
    
       public String get_email(){
           
           return(this.email);
       }
       
       public String get_phone(){
           
           return(this.phone);
       }
       
        public String get_pass(){
            
            return(this.pass);
        }
        
        public String get_registration_number(){
            
        return(this.registration_number);
        }
        
        public String get_type(){
            
            return(this.type);
        }
        
        public Boolean get_is_certified(){
            
           return(this.is_certified);
        }
    }
    

