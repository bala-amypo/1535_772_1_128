@Repository
public interface HoldingRecordRepository extends JpaRepository<HoldingRecord, Long> {

    // if field is marketValue
    List<HoldingRecord> findByMarketValueGreaterThan(Double marketValue);

    List<HoldingRecord> findByInvestorIdAndAssetClass(
            Long investorId,
            AssetClassType assetClass
    );
}
