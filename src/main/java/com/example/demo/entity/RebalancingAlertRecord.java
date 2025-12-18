import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "rebalancing_alert_record")
public class RebalancingAlertRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long alertId;

    private Long investorId;

    @Enumerated(EnumType.STRING)
    private AssetClass assetClass;

    private double currentPercentage;

    private double targetPercentage;

    @Enumerated(EnumType.STRING)
    private AlertSeverity severity;

    private boolean resolved = false;

    private LocalDateTime alertDate = LocalDateTime.now();
}
