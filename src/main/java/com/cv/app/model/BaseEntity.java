package com.cv.app.model;

import javax.persistence.*;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Version
    protected Long version;

    public Long getId() {
        return id;
    }

    public Long getVersion() {
        return version;
    }
}
