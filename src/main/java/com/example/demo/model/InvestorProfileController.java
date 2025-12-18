import com.example.demo.model.InvestorProfileModel;
import com.example.demo.service.InvestorProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/investors")
public class InvestorProfileController {

    private final InvestorProfileService service;

    public InvestorProfileController(InvestorProfileService service) {
        this.service = service;
    }

    @PostMapping
    public InvestorProfileModel create(@RequestBody InvestorProfileModel model) {
        return service.create(model);
    }

    @GetMapping("/{id}")
    public InvestorProfileModel getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<InvestorProfileModel> getAll() {
        return service.getAll();
    }
}
