package com.example.userprofile.service;

import com.example.userprofile.model.DisplayName;
import org.springframework.stereotype.Service;

@Service
public class DisplayServiceImpl implements DisplayService {


    @Override
    public DisplayName getDisplayName() {
        DisplayName displayName=DisplayName.builder()
                .display("TALENT PLUS")
                .build();

        return displayName;
    }
}
