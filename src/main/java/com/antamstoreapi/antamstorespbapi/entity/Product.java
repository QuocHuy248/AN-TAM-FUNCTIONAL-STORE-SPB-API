package com.antamstoreapi.antamstorespbapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String name;
    private BigDecimal price;
    private Long quantity;
    private Long licenseNumber;
    private String purpose;
    private String description;
    private String specification;
    @ManyToOne
    @JoinColumn(name = "unit_id", referencedColumnName = "id", nullable = false)
    private Unit unit;
    @OneToOne
    @JoinColumn(name = "dosage_form_id", referencedColumnName = "id", nullable = false)
    private DosageForm dosageForm;
    @OneToOne
    @JoinColumn(name = "avatar_id", referencedColumnName = "id", nullable = false)
    private Avatar avatar;
    @ManyToOne
    @JoinColumn(name = "brand_nationality_id", referencedColumnName = "id", nullable = false)
    private BrandNationality brandNationality;
    @ManyToOne
    @JoinColumn(name = "producer_company_id", referencedColumnName = "id", nullable = false)
    private ProducerCompany producerCompany;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false)
    private Category category;
    @ManyToOne
    @JoinColumn(name = "catagogue_id", referencedColumnName = "id", nullable = false)
    private Catalogue catalogue;
    @OneToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false)
    private Country country;

}
