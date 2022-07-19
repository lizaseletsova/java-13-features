package com.java.features.controller;

import com.java.features.service.ISwitchCaseBreak;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SwitchCaseBreakController {

    private final ISwitchCaseBreak switchCaseBreak;

    @GetMapping("/grade")
    ResponseEntity getGrade(@PathVariable("grade") char grade) {
        return ResponseEntity.ok(switchCaseBreak.getGrade(grade));
    }

    @GetMapping("/result")
    ResponseEntity getResult(@PathVariable("grade") char grade) {
        return ResponseEntity.ok(switchCaseBreak.getResult(grade));
    }
}
