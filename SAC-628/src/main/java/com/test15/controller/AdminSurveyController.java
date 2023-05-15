package com.test15.controller;

import com.test15.model.SalesforceSurvey;
import com.test15.service.AdminSurveyControllerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminSurveyController {
  
  @Autowired
  AdminSurveyControllerService adminSurveyControllerService;
  
  @PostMapping("/survey")
  public void createSurvey(@RequestBody SalesforceSurvey survey) {
    adminSurveyControllerService.createSurvey(survey);
  }

  @PutMapping("/survey")
  public void updateSurvey(@RequestBody SalesforceSurvey survey) {
    adminSurveyControllerService.updateSurvey(survey);
  }
  
  @GetMapping("/access-permissions")
  public @ResponseBody String getAccessPermissions() {
    return adminSurveyControllerService.getAccessPermissions();
  }
  
  @GetMapping("/error-message")
  public @ResponseBody String getErrorMessage() {
    return adminSurveyControllerService.getErrorMessage();
  }
  
  public void testScenarios() {
    adminSurveyControllerService.testScenarios();
  }

}