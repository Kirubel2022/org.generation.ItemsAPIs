package com.example.org.generation.ItemsAPI.repository.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Comment ")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer commentId;

    private String typeOfComment;
    private Integer numberOfComment;
    private Date commentDate;

    public Comment() {
    }

    public Comment(Integer commentId, String typeOfComment, Integer numberOfComment, Date commentDate) {
        this.commentId=commentId;
        this.typeOfComment = typeOfComment;
        this.numberOfComment= numberOfComment;
        this.commentDate = commentDate;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public String getTypeOfComment() {
        return typeOfComment;
    }

    public void setTypeOfComment(String typeOfComment) {
        this.typeOfComment = typeOfComment;
    }

    public Integer getNumberOfComment() {
        return numberOfComment;
    }

    public void setNumberOfComment(Integer numberOfComment) {
        this.numberOfComment = numberOfComment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", typeOfComment='" + typeOfComment + '\'' +
                ", numberOfComment=" + numberOfComment +
                ", commentDate=" + commentDate +
                '}';
    }
}
