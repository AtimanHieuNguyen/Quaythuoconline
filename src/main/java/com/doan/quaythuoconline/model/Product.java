package com.doan.quaythuoconline.model;


import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


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
@Table(name = "products")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", columnDefinition = "varchar(500)", nullable = false)
    String name;

    @Column(name = "price", columnDefinition = "varchar(50)", nullable = false)
    Double price;

    @Column(name = "mota", columnDefinition = "varchar(5000)", nullable = false)
    String mota;

    @Column(name = "thuonghieu", columnDefinition = "varchar(500)", nullable = false)
    String thuonghieu;

    @ManyToOne @JoinColumn(name = "categoryDetailId")
    CategorysDetail categoryDetailId;
    @Column(name = "image", columnDefinition = "varchar(1000)", nullable = false)
    String image;

}
