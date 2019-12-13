package app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;
    private String iban;
    private int abo;
    private String city;
    private String email;
    private int houseNumber;
    private int postcode;
    private String street;
    private String password;

    public User() {
        this.firstName = "";
        this.lastName = "";
        this.iban = "";
        this.abo = 0;
        this.city = "";
        this.email = "";
        this.houseNumber = 0;
        this.postcode = 0;
        this.street = "";
        this.password = "";
    }
    
    public User(String firstName, String lastName, String iban, int abo, String city, String email, int houseNumber, int postcode, String street, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
        this.abo = abo;
        this.city = city;
        this.email = email;
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.street = street;
        this.password = password;
    }

    public long getId() {
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIBAN() {
        return iban;
    }

    public int getAbo() {
        return abo;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public int getPostcode() {
        return postcode;
    }

    public String getStreet() {
        return street;
    }

    public String getPassword() {
        return password;
    }
    
    @Override
    public String toString() {
        return "Movie{" + "id=" + id + ", name=" + firstName + '}';
    }
}