package com.cognizant.orm_learn.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "attempt")
public class Attempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "at_id")
    private int id;

    @Column(name = "at_date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "at_score")
    private double score;

    @ManyToOne
    @JoinColumn(name = "at_us_id")
    private User user;

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public double getScore() { return score; }
    public void setScore(double score) { this.score = score; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
