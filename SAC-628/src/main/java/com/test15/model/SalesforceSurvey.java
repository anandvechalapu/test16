@Entity
@Table(name = "salesforce_survey")
public class SalesforceSurvey {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "survey_name")
    private String surveyName;
    
    @Column(name = "survey_state")
    private String surveyState;
    
    @Column(name = "questions")
    private List<String> questions;
    
    @Column(name = "rating_range")
    private int ratingRange;
    
    @Column(name = "selected_users")
    private List<String> selectedUsers;
    
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getSurveyName() {
        return surveyName;
    }
 
    public void setSurveyName(String surveyName) {
        this.surveyName = surveyName;
    }
 
    public String getSurveyState() {
        return surveyState;
    }
 
    public void setSurveyState(String surveyState) {
        this.surveyState = surveyState;
    }
 
    public List<String> getQuestions() {
        return questions;
    }
 
    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }
 
    public int getRatingRange() {
        return ratingRange;
    }
 
    public void setRatingRange(int ratingRange) {
        this.ratingRange = ratingRange;
    }
 
    public List<String> getSelectedUsers() {
        return selectedUsers;
    }
 
    public void setSelectedUsers(List<String> selectedUsers) {
        this.selectedUsers = selectedUsers;
    }
 
}