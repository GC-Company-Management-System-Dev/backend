package com.yeogi.infoseccert.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Security_Certification_Master")
public class SecurityCertificationMaster {
    @Id
    @Column(name = "Document_Code")
    private String documentCode;

    @Column(name = "Classification_Code")
    private String classificationCode;

    @Column(name = "Certification_Year")
    private int certificationYear;

    @Column(name = "Item_Code")
    private String itemCode;

    @Column(name = "Certification_Type_Name")
    private String certificationTypeName;

    @Column(name = "ISO_Details")
    private String isoDetails;

    @Column(name = "PCI_DSS_Details")
    private String pciDssDetails;

    @Column(name = "Created_At", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "Updated_At")
    private LocalDateTime updatedAt;

    // Getters and setters

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
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

    public String getCertificationTypeName() {
        return certificationTypeName;
    }

    public void setCertificationTypeName(String certificationTypeName) {
        this.certificationTypeName = certificationTypeName;
    }

    public String getIsoDetails() {
        return isoDetails;
    }

    public void setIsoDetails(String isoDetails) {
        this.isoDetails = isoDetails;
    }

    public String getPciDssDetails() {
        return pciDssDetails;
    }

    public void setPciDssDetails(String pciDssDetails) {
        this.pciDssDetails = pciDssDetails;
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
}
