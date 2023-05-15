public class SurveyQuestionChoices {
 
 private String labelName;
 private String pluralLabel;
 private String recordName;
 private String autoNumberFormat;
 private int startingString;
 private String choiceName;
 private String pageLayout;
 private boolean customTab;
 private List view;
 
 public SurveyQuestionChoices(String labelName, String pluralLabel, String recordName,
  String autoNumberFormat, int startingString, String choiceName, String pageLayout, 
  boolean customTab, List view) {
  this.labelName = labelName;
  this.pluralLabel = pluralLabel;
  this.recordName = recordName;
  this.autoNumberFormat = autoNumberFormat;
  this.startingString = startingString;
  this.choiceName = choiceName;
  this.pageLayout = pageLayout;
  this.customTab = customTab;
  this.view = view;
 }
 
 public String getLabelName() {
  return labelName;
 }
 
 public void setLabelName(String labelName) {
  this.labelName = labelName;
 }
 
 public String getPluralLabel() {
  return pluralLabel;
 }
 
 public void setPluralLabel(String pluralLabel) {
  this.pluralLabel = pluralLabel;
 }
 
 public String getRecordName() {
  return recordName;
 }
 
 public void setRecordName(String recordName) {
  this.recordName = recordName;
 }
 
 public String getAutoNumberFormat() {
  return autoNumberFormat;
 }
 
 public void setAutoNumberFormat(String autoNumberFormat) {
  this.autoNumberFormat = autoNumberFormat;
 }
 
 public int getStartingString() {
  return startingString;
 }
 
 public void setStartingString(int startingString) {
  this.startingString = startingString;
 }
 
 public String getChoiceName() {
  return choiceName;
 }
 
 public void setChoiceName(String choiceName) {
  this.choiceName = choiceName;
 }
 
 public String getPageLayout() {
  return pageLayout;
 }
 
 public void setPageLayout(String pageLayout) {
  this.pageLayout = pageLayout;
 }
 
 public boolean isCustomTab() {
  return customTab;
 }
 
 public void setCustomTab(boolean customTab) {
  this.customTab = customTab;
 }
 
 public List getView() {
  return view;
 }
 
 public void setView(List view) {
  this.view = view;
 }
 
}