@GetMapping("/investor/{investorId}")
public List<AllocationSnapshotRecord> getByInvestorId(
        @PathVariable String investorId) {
    return service.getByInvestorId(investorId);
}
