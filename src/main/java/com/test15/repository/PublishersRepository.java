·       Ability to access the sub screens like edit, view and download.·       Ability to view the data in formatted CSV format.·       Ability to add/ edit the publication.·       User should have Submit and Reset buttons on this screen.·       Submit and reset buttons should be functional.·       Name should be unique and not be empty.·       If user has permission then user should able to access this page.·       If user didn’t have permission then redirect to login page.

import org.springframework.data.jpa.repository.JpaRepository;

import com.test15.model.Publishers;

public interface PublishersRepository extends JpaRepository<Publishers, Long> {
    public List<Publishers> findByName(String name);
    public List<Publishers> findByActive(Boolean active);
    public void deleteByName(String name);
    public void deleteByActive(Boolean active);
    public Publishers save(Publishers publishers);
    public List<Publishers> findAll();
    public List<Publishers> findByNameAndActive(String name, Boolean active);
    public void downloadDataAsCSV(String name);
}