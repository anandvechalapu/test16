import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test15.model.Publishers;
import com.test15.service.PublishersService;

@RestController
public class PublishersController {

    @Autowired
    private PublishersService publishersService;

    @GetMapping("/publishers")
    public List<Publishers> getAllPublishers() {
        return publishersService.getAllPublishers();
    }

    @GetMapping("/publishers/name/{name}")
    public Publishers getPublisherByName(@PathVariable String name) {
        return publishersService.getPublisherByName(name);
    }

    @GetMapping("/publishers/active")
    public List<Publishers> getPublisherByActive(@RequestParam Boolean active) {
        return publishersService.getPublisherByActive(active);
    }

    @DeleteMapping("/publishers/name/{name}")
    public void deletePublisherByName(@PathVariable String name) {
        publishersService.deletePublisherByName(name);
    }

    @DeleteMapping("/publishers/active")
    public void deletePublisherByActive(@RequestParam Boolean active) {
        publishersService.deletePublisherByActive(active);
    }

    @PostMapping("/publishers")
    public Publishers savePublisher(@RequestBody Publishers publishers) {
        return publishersService.savePublisher(publishers);
    }

    @PutMapping("/publishers/name/{name}/active")
    public List<Publishers> getPublisherByNameAndActive(@PathVariable String name, @RequestParam Boolean active) {
        return publishersService.getPublisherByNameAndActive(name, active);
    }
    
    @GetMapping("/publishers/download/{name}")
    public void downloadDataAsCSV(@PathVariable String name) {
        publishersService.downloadDataAsCSV(name);
    }
    
    @GetMapping("/publishers/checkuser")
    public boolean checkUserPermission() {
        return publishersService.checkUserPermission();
    }
    
    @GetMapping("/publishers/unique")
    public boolean isNameUnique(@RequestParam String name) {
        return publishersService.isNameUnique(name);
    }
    
    @PostMapping("/publishers/reset")
    public void resetForm() {
        publishersService.resetForm();
    }
}