package com.nubeero.demodigitalocean;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@AllArgsConstructor
public class HomeController {

    HomeService homeService;
    @GetMapping("/init")
    public ResponseEntity getInitialization(){
        Initializers obj = homeService.getInitializers();
        return ResponseEntity.ok(obj);
    }
}
