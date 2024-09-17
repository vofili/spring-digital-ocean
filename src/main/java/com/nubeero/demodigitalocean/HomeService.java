package com.nubeero.demodigitalocean;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public Initializers getInitializers(){
        Initializers init = new Initializers(1,"site name","welcome to broker site");
        return init;
    }

}
