package com.yeogi.infoseccert.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Evidence_Data")
public class EvidenceData {
    @Id
    @GeneratedValue
    @Column(name = "File_Key", updatable = false, nullable = false)
    private UUID fileKey;

    @ManyToOne
    @JoinColumn(name = "Detail_Item_Code")
    private CertificationDetailItem certificationDetailItem;

    @Column(name = "File_Name")
    private String fileName;

    @Column(name = "File_Size")
    private double fileSize;

    @Column(name = "File_Path")
    private String filePath;

    @Column(name = "Created_At", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "Creator")
    private String creator;

    // Getters and setters

    public UUID getFileKey() {
        return fileKey;
    }

    public void setFileKey(UUID fileKey) {
        this.fileKey = fileKey;
    }

    public CertificationDetailItem getCertificationDetailItem() {
        return certificationDetailItem;
    }

    public void setCertificationDetailItem(CertificationDetailItem certificationDetailItem) {
        this.certificationDetailItem = certificationDetailItem;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
}

