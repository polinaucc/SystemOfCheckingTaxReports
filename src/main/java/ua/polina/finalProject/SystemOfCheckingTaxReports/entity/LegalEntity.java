package ua.polina.finalProject.SystemOfCheckingTaxReports.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "legal_entity")
public class LegalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private Long id;

    @NotNull
    @OneToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name="client_fk")
    private Client client;

    @NotBlank(message = "Name is mandatory")
    @Column(name="name")
    private String name;

    @NotBlank(message = "Edrpou is mandatory")
    @Column(name="edrpou")
    private String edrpou;

    @NotBlank(message = "MFO is mandatory")
    @Column(name="mfo")
    private String mfo;

    @NotBlank(message = "Address is mandatory")
    @Column(name="address")
    private String address;
}
