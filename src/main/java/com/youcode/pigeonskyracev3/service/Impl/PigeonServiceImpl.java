package com.youcode.pigeonskyracev3.service.Impl;
import com.youcode.pigeonskyracev3.dto.pigeon.PigeonRequestDTO;
import com.youcode.pigeonskyracev3.dto.pigeon.PigeonResponseDTO;
import com.youcode.pigeonskyracev3.entity.Pigeon;
import com.youcode.pigeonskyracev3.mapper.PigeonMapper;
import com.youcode.pigeonskyracev3.repository.PigeonRepository;
import com.youcode.pigeonskyracev3.service.PigeonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PigeonServiceImpl implements PigeonService {

    private final PigeonRepository pigeonRepository;
    private final PigeonMapper pigeonMapper;

    @Override
    public PigeonResponseDTO createPigeon(PigeonRequestDTO pigeonRequestDTO) {
        if (pigeonRequestDTO.gender() == null) {
            throw new IllegalArgumentException("Gender cannot be null");
        }

        Pigeon pigeon = pigeonMapper.toEntity(pigeonRequestDTO);

        Pigeon savedPigeon = pigeonRepository.save(pigeon);
        return pigeonMapper.toResponse(savedPigeon);
    }

}