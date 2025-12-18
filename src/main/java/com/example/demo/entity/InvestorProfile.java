import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "investor_profile")
public class InvestorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long investorId;

    private String fullName;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;

    private boolean active = true;

    private LocalDateTime createdAt = LocalDateTime.now();
}
