package com.youcode.pigeonskyracev3.dto.competition;


import java.time.LocalDateTime;

public record CompetitionResponseDTO(
        Long id,
        String name,
        LocalDateTime startTime,
        LocalDateTime endTime,
        double latitudeGPS,
        double longitudeGPS,
        int pigeonCount
) {}
