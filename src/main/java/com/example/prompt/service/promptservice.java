package com.example.prompt.service;

import com.example.prompt.model.promptmodel;
import com.example.prompt.repository.promptrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public class promptservice {
    private final promptrepository repository;
    public promptservice(promptrepository repository){
        this.repository=repository;
    }

    public void addrequest(String request,String response){
        promptmodel model=new promptmodel();
        model.setRequest(request);
        model.setResponse(response);
        repository.save(model);
    }
}
