package com.report_automation.report_automation.models;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.report_automation.report_automation.enums.UserRole;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Table(name="users")
public class User {
  public User() {};

  
  // Columns

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "username", nullable = false, unique = true, length = 20)
  @Setter
  private String username;

  @Column(name = "email", nullable = false, unique = true)
  @Setter
  private String email;

  @Column(name = "hashed_password", nullable = false)
  @Setter
  private String hashedPassword;

  @Enumerated(EnumType.STRING)
  @Column(name = "user_role", nullable = false)
  @Setter
  private UserRole userRole = UserRole.ROLE_USER;

  @Column(name = "is_active", nullable = false)
  @Setter
  private Boolean isActive = true;

  @CreationTimestamp
  @Column(name = "created_at")
  private LocalDateTime createdAt;

  @UpdateTimestamp
  @Column(name = "updated_at")
  private LocalDateTime updatedAt;
}
