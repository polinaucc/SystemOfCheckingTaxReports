package ua.polina.finalProject.SystemOfCheckingTaxReports.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "renouncement")
public class Renouncement {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private Long id;

    @NotNull
    @ManyToOne
    @JoinColumn(name="report_id")
    private Report report;

    @Column(name="date")
    private Date date;

    @NotNull
    @Column(name="reason")
    private String reason;
}
