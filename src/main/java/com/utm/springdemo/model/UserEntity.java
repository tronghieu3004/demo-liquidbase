package com.utm.springdemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "username", length = 30, unique = true, nullable = false)
    @Size(min = 8,max = 50)
    private String username;

    @Column(name = "password", nullable = false)
    @Size(min = 8,max = 50)
    private String password;

    @Column(name = "created_date")
    @CreatedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    protected Instant createdDate;

    @Column(name = "modified_date")
    @LastModifiedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    protected Instant modifiedDate;

    @Column(name = "created_by")
    @CreatedBy
    protected String createdBy;

    @Column(name = "modified_by")
    @LastModifiedBy
    protected String modifiedBy;

}
