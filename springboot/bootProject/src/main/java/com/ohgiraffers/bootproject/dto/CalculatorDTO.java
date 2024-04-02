package com.ohgiraffers.bootproject.dto;

import lombok.Data;

@Data
public class CalculatorDTO {

    int num1;
    int num2;
    int sum;

    public CalculatorDTO(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
