package com.yeogi.infoseccert.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Download_Log")
public class DownloadLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Log_Sequence")
    private Long logSequence;

    @Column(name = "Access_ID")
    private String accessId;

    @Column(name = "File_Name")
    private String fileName;

    @Column(name = "File_Key")
    private String fileKey;

    @Column(name = "Timestamp", updatable = false, nullable = false)
    private LocalDateTime timestamp;

    // Getters and setters

    public Long getLogSequence() {
        return logSequence;
    }

    public void setLogSequence(Long logSequence) {
        this.logSequence = logSequence;
    }

    public String getAccessId() {
        return accessId;
    }

    public void setAccessId(String accessId) {
        this.accessId = accessId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileKey() {
        return fileKey;
    }

    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

