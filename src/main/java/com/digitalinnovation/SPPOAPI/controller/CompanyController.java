package com.digitalinnovation.SPPOAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fellipe Toledo
 * @created 30/12/2021
 */

@RestController
@RequestMapping("/api/v1/sppo/company")
public class CompanyController {

    @GetMapping
    public String getCompany(){
        return "Empresas:";
    }








}
