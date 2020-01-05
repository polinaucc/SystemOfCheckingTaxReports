package ua.polina.finalProject.SystemOfCheckingTaxReports.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name="claim")
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @JoinColumn(name="clientFK")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Client client;

    @JoinColumn(name="inspectorFK")
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    private Inspector inspector;

    @Column(name = "reason")
    private String reason;

}
