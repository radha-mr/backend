package com.netflax.login.db.model;

import javax.persistence.*;

@Entity
@Table(name = "user",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "username"),
                @UniqueConstraint(columnNames = "email")
        })
public class EUser {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;

        private String username;

        private String email;

        private String password;

        private String role;

        public EUser() {
        }

        public EUser(String username, String email, String password, String role) {
                this.username = username;
                this.email = email;
                this.password = password;
                this.role = role;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getUsername() {
                return username;
        }

        public void setUsername(String username) {
                this.username = username;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getRole() {
                return role;
        }

        public void setRole(String role) {
                this.role = role;
        }
}
