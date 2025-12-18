import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rebalancing_alert")
public class RebalancingAlert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long investorId;

    @Enumerated(EnumType.STRING)
    private AssetClass assetClass;

    private double currentPercentage;

    private double targetPercentage;

    @Enumerated(EnumType.STRING)
    private AlertSeverity severity;

    private String message;

    private boolean resolved = false;

    private LocalDateTime alertDate = LocalDateTime.now();

    // getters & setters
}
