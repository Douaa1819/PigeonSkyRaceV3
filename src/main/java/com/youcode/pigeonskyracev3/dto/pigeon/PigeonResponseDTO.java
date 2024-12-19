package com.youcode.pigeonskyracev3.dto.pigeon;


import com.youcode.pigeonskyracev3.entity.enums.Gender;

public record PigeonResponseDTO(
        Long id,
        String numberBague,
        Gender gender,
        int age,
        String color
) {}
