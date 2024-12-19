package com.youcode.pigeonskyracev3.mapper;


import com.youcode.pigeonskyracev3.dto.competition.CompetitionRequestDTO;
import com.youcode.pigeonskyracev3.dto.competition.CompetitionResponseDTO;
import com.youcode.pigeonskyracev3.entity.Competition;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface CompetitionMapper {
    Competition toEntity(CompetitionRequestDTO competitionRequestDTO);
    CompetitionResponseDTO toResponse(Competition competition);
}
