import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test15.model.Publishers;
import com.test15.repository.PublishersRepository;

@Service
public class PublishersService {
    
    @Autowired
    private PublishersRepository publishersRepo;
    
    public List<Publishers> getAllPublishers() {
        return publishersRepo.findAll();
    }
    
    public Publishers getPublisherByName(String name) {
        return publishersRepo.findByName(name);
    }
    
    public List<Publishers> getPublisherByActive(Boolean active) {
        return publishersRepo.findByActive(active);
    }
    
    public void deletePublisherByName(String name) {
        publishersRepo.deleteByName(name);
    }
    
    public void deletePublisherByActive(Boolean active) {
        publishersRepo.deleteByActive(active);
    }
    
    public Publishers savePublisher(Publishers publishers) {
        return publishersRepo.save(publishers);
    }
    
    public List<Publishers> getPublisherByNameAndActive(String name, Boolean active) {
        return publishersRepo.findByNameAndActive(name, active);
    }
    
    public void downloadDataAsCSV(String name) {
        publishersRepo.downloadDataAsCSV(name);
    }
    
    public boolean checkUserPermission() {
        // code to check user permission
        return true;
    }
    
    public boolean isNameUnique(String name) {
        // code to check if the entered name is unique or not
        return true;
    }
    
    public void resetForm() {
        // code to reset the form
    }
}