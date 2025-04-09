package eu.marketplace.market.model;

import eu.marketplace.market.utils.EquipmentType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "productName", nullable = false)
    private String productName;

    @Column(name = "description", length = 500)
    private String description;

    @Lob
    @Column(name = "detailedDescription", columnDefinition="TEXT")
    private String detailedDescription;

    @Column(name = "price")
    private Float price; // If its -1 then front displays "Upon Request"

    @Column(name = "currency")
    private String currency;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "paymentInfo", length = 500)
    private String paymentInfo;

    @Column(name = "url")
    private String url;
}
