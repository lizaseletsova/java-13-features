package com.java.features.service;

import org.springframework.stereotype.Service;

@Service
public class SwitchCaseBreak implements ISwitchCaseBreak {

    @Override
    public String getGrade(char grade) {
        return switch (grade) {
            case 'A':
                yield "Excellent";
            case 'B':
                yield "Good";
            case 'C':
                yield "Standard";
            case 'D':
                yield "Low";
            case 'E':
                yield "Very Low";
            default:
                yield "Invalid";

        };
    }

    public String getResult(char grade) {

        return switch (grade) {

            case 'A', 'B', 'C' -> "::Success";

            case 'D', 'E' -> "::Fail";

            default -> "::No result";

        };
    }
}
