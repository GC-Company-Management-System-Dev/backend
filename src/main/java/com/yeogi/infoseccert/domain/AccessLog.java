package com.yeogi.infoseccert.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Access_Log")
public class AccessLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Log_Sequence")
    private Long logSequence;

    @Column(name = "Access_ID")
    private String accessId;

    @Column(name = "Action")
    private String action;

    @Column(name = "Access_Path")
    private String accessPath;

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

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAccessPath() {
        return accessPath;
    }

    public void setAccessPath(String accessPath) {
        this.accessPath = accessPath;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

