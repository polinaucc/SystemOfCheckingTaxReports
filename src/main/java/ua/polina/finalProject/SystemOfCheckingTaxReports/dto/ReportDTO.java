package ua.polina.finalProject.SystemOfCheckingTaxReports.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReportDTO {
    private Long clientId;
    private Long inspectorId;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String comment;
    private String status;
}
