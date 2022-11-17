package com.example.userprofile.cotroller;

import com.example.userprofile.model.DisplayName;
import com.example.userprofile.service.DisplayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Display")
public class DisplayController {


    DisplayService  displayService;


    public DisplayController(DisplayService displayService) {
        this.displayService = displayService;
    }
    @GetMapping("/getName")
public DisplayName getDisplayName(){

      return   displayService.getDisplayName();

    }

}
