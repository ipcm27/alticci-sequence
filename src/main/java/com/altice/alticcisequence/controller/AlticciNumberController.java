package com.altice.alticcisequence.controller;

import com.altice.alticcisequence.model.AlticciNumber;
import com.altice.alticcisequence.service.AlticciNumberSevice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/alticci")
public class AlticciNumberController {


private AlticciNumberSevice alticciNumberSevice ;

    public AlticciNumberController(AlticciNumberSevice alticciNumberSevice) {
        this.alticciNumberSevice = alticciNumberSevice;

    }

    @GetMapping(path = "/{n}")
   public ResponseEntity getAlticciNumber(@PathVariable(name = "n") int alticiiNumber){
        int mynumber = alticciNumberSevice.getNumber(alticiiNumber);
            return new ResponseEntity<Integer>(mynumber, HttpStatus.OK);

    }
}
