package br.com.felipesousa.todolist.user;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Data
@Entity(name ="tb_users")
public class UserModel {
  
  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  private String username;
  private String name;
  private String password;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
