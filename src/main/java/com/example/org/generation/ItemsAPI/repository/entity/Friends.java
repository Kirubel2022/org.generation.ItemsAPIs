package com.example.org.generation.ItemsAPI.repository.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Friends")
public class Friends {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer FriendId;
    private String Liked;
    private String disliked;
    private String typeOfPost;
    private String postDescription;
    private Date dateOfPost;

    public Friends() {
    }

    public Friends(Integer friendId,String liked, String disliked, String typeOfPost, String postDescription, Date dateOfPost) {
        this.FriendId=friendId;
        this.Liked = liked;
        this.disliked = disliked;
        this.typeOfPost = typeOfPost;
        this.postDescription = postDescription;
        this.dateOfPost = dateOfPost;
    }

    public Integer getFriendId() {
        return FriendId;
    }

    public void setFriendId(Integer friendId) {
        FriendId = friendId;
    }

    public String getLiked() {
        return Liked;
    }

    public void setLiked(String liked) {
        Liked = liked;
    }

    public String getDisliked() {
        return disliked;
    }

    public void setDisliked(String disliked) {
        this.disliked = disliked;
    }

    public String getTypeOfPost() {
        return typeOfPost;
    }

    public void setTypeOfPost(String typeOfPost) {
        this.typeOfPost = typeOfPost;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public Date getDateOfPost() {
        return dateOfPost;
    }

    public void setDateOfPost(Date dateOfPost) {
        this.dateOfPost = dateOfPost;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "FriendId=" + FriendId +
                ", Liked='" + Liked + '\'' +
                ", disliked='" + disliked + '\'' +
                ", typeOfPost='" + typeOfPost + '\'' +
                ", postDescription='" + postDescription + '\'' +
                ", dateOfPost=" + dateOfPost +
                '}';
    }
}
