package com.yeogi.infoseccert.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Certification_Detail_Item")
public class CertificationDetailItem {
    @Id
    @Column(name = "Detail_Item_Code")
    private String detailItemCode;

    @ManyToOne
    @JoinColumn(name = "Document_Code")
    private SecurityCertificationMaster securityCertificationMaster;

    @Column(name = "Classification_Code")
    private String classificationCode;

    @Column(name = "Certification_Year")
    private int certificationYear;

    @Column(name = "Item_Code")
    private String itemCode;

    @Column(name = "Detail_Item_Type_Name")
    private String detailItemTypeName;

    @Column(name = "Completed")
    private boolean completed;

    @Column(name = "Created_At", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "Updated_At")
    private LocalDateTime updatedAt;

    @Column(name = "Monthly_Index")
    private int monthlyIndex;

    // Getters and setters

    public String getDetailItemCode() {
        return detailItemCode;
    }

    public void setDetailItemCode(String detailItemCode) {
        this.detailItemCode = detailItemCode;
    }

    public SecurityCertificationMaster getSecurityCertificationMaster() {
        return securityCertificationMaster;
    }

    public void setSecurityCertificationMaster(SecurityCertificationMaster securityCertificationMaster) {
        this.securityCertificationMaster = securityCertificationMaster;
    }

    public String getClassificationCode() {
        return classificationCode;
    }

    public void setClassificationCode(String classificationCode) {
        this.classificationCode = classificationCode;
    }

    public int getCertificationYear() {
        return certificationYear;
    }

    public void setCertificationYear(int certificationYear) {
        this.certificationYear = certificationYear;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDetailItemTypeName() {
        return detailItemTypeName;
    }

    public void setDetailItemTypeName(String detailItemTypeName) {
        this.detailItemTypeName = detailItemTypeName;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
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

    public int getMonthlyIndex() {
        return monthlyIndex;
    }

    public void setMonthlyIndex(int monthlyIndex) {
        this.monthlyIndex = monthlyIndex;
    }
}

