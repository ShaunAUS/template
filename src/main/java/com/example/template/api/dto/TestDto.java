package com.example.template.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Schema(title = "TestDto", description = "Test DTO 입니다")
public class TestDto {

    @Schema(description = "field", example = "String data")
    private String field;

}
