package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class InvestorProfile {

  @Entity
public class InvestorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private boolean active = true;

    @OneToMany(mappedBy = "investor", cascade = CascadeType.ALL)
    private List<HoldingRecord> holdings;

}

    // getters
    public Long getId() { return id; }
    public String getEmail() { return email; }
    public String getFullName() { return fullName; }
    public Boolean getActive() { return active; }

    // setters
    public void setId(Long id) { this.id = id; }
    public void setEmail(String email) { this.email = email; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setActive(Boolean active) { this.active = active; } // ✅ ADD THIS
}
