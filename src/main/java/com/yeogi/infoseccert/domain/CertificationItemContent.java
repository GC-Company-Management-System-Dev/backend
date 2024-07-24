package com.yeogi.infoseccert.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Certification_Item_Content")
public class CertificationItemContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Sequence")
    private Long sequence;

    @ManyToOne
    @JoinColumn(name = "Detail_Item_Code")
    private CertificationDetailItem certificationDetailItem;

    @Column(name = "Certification_Criteria")
    private String certificationCriteria;

    @Column(name = "Key_Checkpoints")
    private String keyCheckpoints;

    @Column(name = "Relevant_Laws")
    private String relevantLaws;

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

    public String getCertificationCriteria() {
        return certificationCriteria;
    }

    public void setCertificationCriteria(String certificationCriteria) {
        this.certificationCriteria = certificationCriteria;
    }

    public String getKeyCheckpoints() {
        return keyCheckpoints;
    }

    public void setKeyCheckpoints(String keyCheckpoints) {
        this.keyCheckpoints = keyCheckpoints;
    }

    public String getRelevantLaws() {
        return relevantLaws;
    }

    public void setRelevantLaws(String relevantLaws) {
        this.relevantLaws = relevantLaws;
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
