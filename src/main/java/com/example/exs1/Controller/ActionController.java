package com.example.exs1.Controller;

import com.example.exs1.Model.ModelString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ActionController {

    public ModelString modelString;

    @Autowired
    public ActionController(ModelString modelString) {
        this.modelString = modelString;
    }

    @PostMapping("/check")
    public ResponseEntity<Object> check(@RequestBody ModelString modelString) {

        for (int i = 0; i < modelString.getMessage().length(); i++) {
            System.out.print(modelString.getMessage().charAt(i) + "  ");
        }

        for (int i = 0; i < modelString.getMessage().length(); i++) {
            if(modelString.getUpperS().contains(modelString.getMessage().charAt(i))){
                System.out.print("\n" + modelString.getUpperS().indexOf(modelString.getMessage().charAt(i)));
            } else if (modelString.getDownS().contains(modelString.getMessage().charAt(i))){
                System.out.print(" " + (modelString.getDownS().indexOf(modelString.getMessage().charAt(i))));
            } else {
                System.out.print("    ");
            }
        }
        return new ResponseEntity<>(modelString.getMessage() ,HttpStatus.OK);
    }
}
