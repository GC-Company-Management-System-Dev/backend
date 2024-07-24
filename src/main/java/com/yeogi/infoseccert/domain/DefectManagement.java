package com.yeogi.infoseccert.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Defect_Management")
public class DefectManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Sequence")
    private Long sequence;

    @ManyToOne
    @JoinColumn(name = "Detail_Item_Code")
    private CertificationDetailItem certificationDetailItem;

    @Column(name = "ISMS_P")
    private String ismsP;

    @Column(name = "ISO27K")
    private String iso27k;

    @Column(name = "PCI_DSS")
    private String pciDss;

    @Column(name = "Created_At", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "Updated_At")
    private LocalDateTime updatedAt;

    @Column(name = "Modifier")
    private String modifier;

    // Getters and setters

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public CertificationDetailItem getCertificationDetailItem() {
        return certificationDetailItem;
    }

    public void setCertificationDetailItem(CertificationDetailItem certificationDetailItem) {
        this.certificationDetailItem = certificationDetailItem;
    }

    public String getIsmsP() {
        return ismsP;
    }

    public void setIsmsP(String ismsP) {
        this.ismsP = ismsP;
    }

    public String getIso27k() {
        return iso27k;
    }

    public void setIso27k(String iso27k) {
        this.iso27k = iso27k;
    }

    public String getPciDss() {
        return pciDss;
    }

    public void setPciDss(String pciDss) {
        this.pciDss = pciDss;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }
}

