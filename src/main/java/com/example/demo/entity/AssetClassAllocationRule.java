import jakarta.persistence.*;

@Entity
@Table(name = "allocation_rule")
public class AllocationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long investorId;

    @Enumerated(EnumType.STRING)
    private AssetClass assetClass;

    private double targetPercentage;

    private boolean active = true;

    // getters & setters
}
