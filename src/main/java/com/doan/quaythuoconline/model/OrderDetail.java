package com.doan.quaythuoconline.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity 
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "orderdetails")
public class OrderDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne @JoinColumn(name = "productId")
    Product productId;

    @OneToOne @JoinColumn(name = "orderId")
    Product orderId;
    
    @Column(name = "quarity", columnDefinition = "varchar(500)", nullable = false)
    Double quarity;

    @Column(name = "totalMany", columnDefinition = "varchar(50)", nullable = false)
    Double totalMany;

    @Temporal(TemporalType.DATE)
	@Column(name = "Createdate")
	Date createDate = new Date();
}
