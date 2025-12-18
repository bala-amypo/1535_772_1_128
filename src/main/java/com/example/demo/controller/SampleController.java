import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sample")
public class SampleController {

    @GetMapping
    public String hello() {
        return "API is working";
    }

    @GetMapping("/{id}")
    public String getById(@PathVariable Long id) {
        return "ID = " + id;
    }

    @PostMapping
    public String create(@RequestBody String data) {
        return "Received: " + data;
    }
}
