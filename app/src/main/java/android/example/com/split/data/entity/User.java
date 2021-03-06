package android.example.com.split.data.entity;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * User
 */
@IgnoreExtraProperties
public class User implements Serializable {

    // firebase authentiction id
    private String authId;

    /**
     * User UD
     */
    private String id;
    /**
     * User's first name
     */
    private String firstName;
    /**
     * User's last name
     */
    private String lastName;
    /**
     * User's email
     */
    private String email;
    /**
     * User's phone number
     */
    private String phoneNumber;

    private List<String> contactList;

    /**
     * User
     */

    public User() {

    }

    //
    public User(String firstName, String lastName, String email, String phoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        contactList = new ArrayList<String>();
    }

    // constructor with auth id
    public User(String authId, String firstName, String lastName, String email, String phoneNumber) {
        this.authId = authId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        contactList = new ArrayList<String>();
    }

    public List<String> getContactList() {
        return contactList;
    }

    @Exclude
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthId() {
        return authId;
    }

    public String getFirstName() {
        return firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // add new member to my contact list
    public void addToContactList(String user) {
        contactList.add(user);
    }
}
