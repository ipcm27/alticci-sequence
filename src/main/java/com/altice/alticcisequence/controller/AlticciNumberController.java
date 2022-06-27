package com.altice.alticcisequence.controller;

import com.altice.alticcisequence.model.AlticciNumber;
import com.altice.alticcisequence.service.AlticciNumberSevice;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/alticci")
public class AlticciNumberController {


private AlticciNumberSevice alticciNumberSevice ;

    public AlticciNumberController(AlticciNumberSevice alticciNumberSevice) {
        this.alticciNumberSevice = alticciNumberSevice;

    }

   @GetMapping(path = "/{n}")
   @ResponseBody
   @CrossOrigin(origins = "http://localhost:4200")
   @Cacheable("AlticciNumber")
   public ResponseEntity getAlticciNumber(@PathVariable(name = "n") Integer inputValue){
       System.out.println("cache do controller " + inputValue);
       AlticciNumber alticci = new AlticciNumber(alticciNumberSevice.generateAlticciResponse(inputValue)) ;
            return new ResponseEntity(alticci, HttpStatus.OK);
    }
}
