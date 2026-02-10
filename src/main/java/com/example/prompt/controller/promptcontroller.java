package com.example.prompt.controller;

import com.example.prompt.DTO.promptresponseDTO;
import com.example.prompt.service.promptservice;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/prompt")
@CrossOrigin
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
