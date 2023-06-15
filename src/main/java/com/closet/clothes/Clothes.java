package com.closet.clothes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "CLOTHES")
public class Clothes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull private String name;
//    @JsonIgnore
//    @ManyToOne
//    @JoinColumn(
//            name = "idLocation",
//            nullable = false,
//            foreignKey = @ForeignKey(name = "fk_clothes_location")
//    )
//    private Locatº

}
