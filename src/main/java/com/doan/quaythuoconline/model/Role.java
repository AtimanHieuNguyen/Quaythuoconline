package com.doan.quaythuoconline.model;


import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "roles")
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "sdt", columnDefinition = "varchar(50)", nullable = false)
    String sdt;

    @Column(name = "password", columnDefinition = "varchar(50)", nullable = false)
    String password;

    @Column(name = "name", columnDefinition = "varchar(500)", nullable = false)
    String name;
    @Column(name = "guider", columnDefinition = "varchar(50)", nullable = false)
    String guider;

    @OneToOne @JoinColumn(name = "authorityId")
    Authority authorityid;

}
