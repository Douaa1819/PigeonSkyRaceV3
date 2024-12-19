package com.youcode.pigeonskyracev3.controller;

import com.youcode.pigeonskyracev3.dto.competition.CompetitionRequestDTO;
import com.youcode.pigeonskyracev3.dto.competition.CompetitionResponseDTO;
import com.youcode.pigeonskyracev3.service.CompetitionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3/competitions")
@RequiredArgsConstructor
public class CompetitionController {

    private final CompetitionService competitionService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CompetitionResponseDTO createCompetition(@Valid @RequestBody CompetitionRequestDTO competitionRequestDTO) {
        return competitionService.createCompetition(competitionRequestDTO);
    }
}
