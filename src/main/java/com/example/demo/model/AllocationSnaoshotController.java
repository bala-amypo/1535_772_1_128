import com.example.demo.model.AllocationSnapshotRecordModel;
import com.example.demo.service.AllocationSnapshotRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/snapshots")
public class AllocationSnapshotRecordController {

    private final AllocationSnapshotRecordService service;

    public AllocationSnapshotRecordController(AllocationSnapshotRecordService service) {
        this.service = service;
    }

    @PostMapping("/generate/{investorId}")
    public List<AllocationSnapshotRecordModel> generate(@PathVariable Long investorId) {
        return service.generate(investorId);
    }

    @GetMapping("/investor/{investorId}")
    public List<AllocationSnapshotRecordModel> getByInvestor(@PathVariable Long investorId) {
        return service.getByInvestor(investorId);
    }
}
