package com.example.org.generation.ItemsAPI.repository.entity;

import javax.persistence.*;

@Entity
@Table(name="User")
    public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Integer userId;

        private String firstName;
        private String lastName;
        private Integer age;
        private String email;
        private String password;
        private String place;
        private String phone;
        private String gender;
        private String work;

        public User() {

        }

        public User(String firstName, String lastName, Integer age, String email, String password, String place, String phone, String gender, String work) {
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

        public boolean getHasId() {
        }

        public void setHasId(boolean hasId) {
        }

        public boolean getEmail() {
        }

        public void setEmail(boolean email) {
        }

        public boolean getName() {
        }

        public void setName(boolean name) {
        }

        @Override
        public String toString() {
            return "User{" +
                    "userId=" + userId +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", place='" + place + '\'' +
                    ", phone='" + phone + '\'' +
                    ", gender='" + gender + '\'' +
                    ", work='" + work + '\'' +
                    '}';
        }
    }




