package com.example.prompt.controller;

import com.example.prompt.DTO.promptresponseDTO;
import com.example.prompt.service.promptservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/prompt")
public class promptcontroller {
    private final promptservice promptservice;
    public promptcontroller(promptservice promptservice){
        this.promptservice=promptservice;
    }
    @PostMapping
    public promptresponseDTO saveprompt(@RequestBody promptresponseDTO requestDTO){
        String generated="This is the reponse from Gemini";
        promptservice.addrequest(requestDTO.getResponse(),generated);
        return new promptresponseDTO(generated);
    }
}
