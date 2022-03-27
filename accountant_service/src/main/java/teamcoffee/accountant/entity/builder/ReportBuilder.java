package teamcoffee.accountant.entity.builder;

import org.springframework.beans.factory.annotation.Autowired;
import teamcoffee.accountant.entity.Report;
import teamcoffee.accountant.entity.dto.ReportDTO;

import java.util.stream.Collectors;

public class ReportBuilder {

    @Autowired
    private TrackingBuilder trackingBuilder;

    public ReportDTO buildDTO(Report report){
        ReportDTO dto = new ReportDTO();
        dto.setId(report.getId());
        dto.setDate(report.getDate());
        dto.setFullTime(report.getFullTime());
        dto.setUserChatId(report.getUserChatId());
        dto.setDayTrackings(
                report.getDayTrackings()
                .stream()
                .map(trackingBuilder::buildDTO)
                .collect(Collectors.toList())
        );
        return dto;
    }

    public Report build(ReportDTO dto){
        Report report = new Report();
        report.setId(dto.getId());
        report.setDate(dto.getDate());
        report.setFullTime(dto.getFullTime());
        report.setUserChatId(dto.getUserChatId());
        report.setDayTrackings(
                dto.getDayTrackings()
                .stream()
                .map(trackingBuilder::build)
                .collect(Collectors.toList())
        );
        return report;
    }
}
