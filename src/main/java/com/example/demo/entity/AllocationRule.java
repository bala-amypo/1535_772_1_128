@Entity
public class AllocationRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String assetClass;

    @Min(0) @Max(100)
    private Double targetPercentage;

    @ManyToOne
    private InvestorProfile investor;
}
