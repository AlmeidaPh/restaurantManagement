package com.phillipealmeida.restaurant.infrastructure.entitys;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Orders_Table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "status")
    private String status;

    @Column(name = "total_amount")
    private float totalAmount;

    @Column(name = "created_at")
    private LocalDate createdAt;

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public float getTotalAmount(){
        return totalAmount;
    }
    public void setTotalAmount(float totalAmount){
        this.totalAmount = totalAmount;
    }

    public LocalDate getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(LocalDate createdAt){
        this.createdAt = createdAt;
    }

}
