package com.test15.service;

import com.test15.repository.AdminSurveyControllerRepository;
import com.test15.model.SalesforceSurvey;

public class AdminSurveyControllerService {
  
  private AdminSurveyControllerRepository adminSurveyControllerRepository;

  public AdminSurveyControllerService(AdminSurveyControllerRepository adminSurveyControllerRepository) {
    this.adminSurveyControllerRepository = adminSurveyControllerRepository;
  }

  public void createSurvey(SalesforceSurvey survey) {
    adminSurveyControllerRepository.createSurvey(survey);
  }

  public void updateSurvey(SalesforceSurvey survey) {
    adminSurveyControllerRepository.updateSurvey(survey);
  }
  
  public String getAccessPermissions() {
    return adminSurveyControllerRepository.getAccessPermissions();
  }
  
  public String getErrorMessage() {
    return adminSurveyControllerRepository.getErrorMessage();
  }
  
  public void testScenarios() {
    adminSurveyControllerRepository.testScenarios();
  }

}