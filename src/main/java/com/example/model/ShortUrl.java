package com.example.model;

import lombok.*;
import org.springframework.data.util.ProxyUtils;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "short_url")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ShortUrl {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "source_ur", nullable = false)
    private String sourceUr;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || ProxyUtils.getUserClass(this) != ProxyUtils.getUserClass(o))
            return false;
        ShortUrl shortUrl = (ShortUrl) o;
        return id != null && Objects.equals(id, shortUrl.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}