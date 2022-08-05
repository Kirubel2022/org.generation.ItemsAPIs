package dto;

public class userDto {

    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private String password;
    private String place;
    private String phone;
    private String gender;
    private String work;

    public userDto() {

    }
    public userDto(String firstName, String lastName, Integer age, String email, String password, String place, String phone, String gender, String work) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.place = place;
        this.phone = phone;
        this.gender = gender;
        this.work = work;
    }

}

