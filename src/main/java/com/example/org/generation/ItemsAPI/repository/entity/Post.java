package com.example.org.generation.ItemsAPI.repository.entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer PostId;
    private String Liked;
    private String disliked;
    private String typeOfPost;
    private String postDescription;
    private Date dateOfPost;

    public Post(String s, String liked, String no, String romantic, String well_described, String s1){

    }
    public Post( Integer PostId, String liked, String disliked, String typeOfPost, String postDescription,
                 Date dateOfPost) {
       this.PostId=PostId;
        this.Liked = liked;
        this.disliked = disliked;
        this.typeOfPost = typeOfPost;
        this.postDescription = postDescription;
        this.dateOfPost = dateOfPost;
    }

    public Integer getPostId() {
        return PostId;
    }

    public void setPostId(Integer postId) {
        PostId = postId;
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
}
