package dto;

import java.util.Date;

public class UserRequest {
    private Integer userId;
    private  String firstName;
    private  String lastName;
    private  String place;
    private Date dateOfRequest;

    public UserRequest(Integer userId, String firstName, String lastName, String place, Date dateOfRequest) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.place = place;
        this.dateOfRequest = dateOfRequest;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPlace() {
        return place;
    }

    public Date getDateOfRequest() {
        return dateOfRequest;
    }
}
