import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "investor")
public class Investor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    private boolean active = true;

    private LocalDateTime createdAt = LocalDateTime.now();

    // getters & setters
}
