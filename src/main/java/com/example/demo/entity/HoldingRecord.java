import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "holding_record")
public class HoldingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long investorId;

    @Enumerated(EnumType.STRING)
    private AssetClass assetClass;

    private double currentValue;

    private LocalDateTime snapshotDate = LocalDateTime.now();

    // getters & setters
}
