package com.laptrinhjavaweb.api;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class NewAPI {

       @GetMapping("/test")

       public String testAPI() {

             return "Sang Test ssa&checkmark;";

   }

}