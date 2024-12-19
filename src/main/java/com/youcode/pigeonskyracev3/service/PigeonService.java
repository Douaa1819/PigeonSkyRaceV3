package com.youcode.pigeonskyracev3.service;


import com.youcode.pigeonskyracev3.dto.pigeon.PigeonRequestDTO;
import com.youcode.pigeonskyracev3.dto.pigeon.PigeonResponseDTO;

public interface PigeonService {
    PigeonResponseDTO createPigeon(PigeonRequestDTO pigeonRequestDTO);
}
