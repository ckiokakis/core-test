package eu.marketplace.market.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "postalCode")
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "notes")
    private String notes;

    @Column(name = "mainPhoneNumber")
    private String mainPhoneNumber;

    @Column(name = "personOfContact")
    private String personOfContact;

    @Column(name = "personOfContactPhoneNumber")
    private String personOfContactPhoneNumber;

    @JsonBackReference("company-address")
    @ManyToOne
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    @Column(name = "new_attr")
    private String new_attr;
}
