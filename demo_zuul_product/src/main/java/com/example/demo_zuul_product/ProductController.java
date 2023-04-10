package com.example.demo_zuul_product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {
    @RequestMapping( method = RequestMethod.GET)
    //@RequestBody @Valid BranchDTO branchDTO
    public ResponseEntity<Object> product() {
        return new ResponseEntity<>("Product Gateway", HttpStatus.OK);
    }
}
