package com.youcode.pigeonskyracev3.controller;

import com.youcode.pigeonskyracev3.dto.pigeon.PigeonRequestDTO;
import com.youcode.pigeonskyracev3.dto.pigeon.PigeonResponseDTO;
import com.youcode.pigeonskyracev3.service.PigeonService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3/pigeons")
@RequiredArgsConstructor
public class PigeonController {

    private final PigeonService pigeonService;

    @PostMapping
    public ResponseEntity<PigeonResponseDTO> createPigeon(@Valid @RequestBody PigeonRequestDTO pigeonRequestDTO) {
        PigeonResponseDTO createdPigeon = pigeonService.createPigeon(pigeonRequestDTO);
        return new ResponseEntity<>(createdPigeon, HttpStatus.CREATED);
    }

}
