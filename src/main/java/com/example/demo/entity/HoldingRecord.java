import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "holding_record")
public class HoldingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long holdingId;

    private Long investorId;

    @Enumerated(EnumType.STRING)
    private AssetClass assetClass;

    private double currentValue;

    private LocalDateTime recordDate = LocalDateTime.now();
}
