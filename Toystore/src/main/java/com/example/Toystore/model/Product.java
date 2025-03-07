package com.example.Toystore.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data
@Entity
@Setter
@Getter
@Builder
@Table(name = "Product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String productName;
    private int toyNo;
    private String description;
    private BigDecimal price;
    private String color;
    private byte[] image;
//
//    public byte[] getImage() {
//        return image;
//    }
//@
//    public void setImage(byte[] image) {
//        this.image = image;
//    }


}
