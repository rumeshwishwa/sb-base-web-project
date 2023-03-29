package dev.dilru.bkpipelinetest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matrix")
public class MatrixController {

    @GetMapping()
    public String success() {
        return "Application successfully started";
    }
}

