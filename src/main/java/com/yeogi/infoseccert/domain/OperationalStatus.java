package com.yeogi.infoseccert.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Operational_Status")
public class OperationalStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Sequence")
    private Long sequence;

    @ManyToOne
    @JoinColumn(name = "Detail_Item_Code")
    private CertificationDetailItem certificationDetailItem;

    @Column(name = "Status")
    private String status;

    @Column(name = "Related_Document")
    private String relatedDocument;

    @Column(name = "Evidence_Name")
    private String evidenceName;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRelatedDocument() {
        return relatedDocument;
    }

    public void setRelatedDocument(String relatedDocument) {
        this.relatedDocument = relatedDocument;
    }

    public String getEvidenceName() {
        return evidenceName;
    }

    public void setEvidenceName(String evidenceName) {
        this.evidenceName = evidenceName;
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

