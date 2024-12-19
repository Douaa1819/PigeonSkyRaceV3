package com.youcode.pigeonskyracev3.service;


import com.youcode.pigeonskyracev3.dto.competition.CompetitionRequestDTO;
import com.youcode.pigeonskyracev3.dto.competition.CompetitionResponseDTO;

public interface CompetitionService {
    CompetitionResponseDTO createCompetition(CompetitionRequestDTO competitionRequestDTO);

}
