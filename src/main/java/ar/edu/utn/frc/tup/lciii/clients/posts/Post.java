package ar.edu.utn.frc.tup.lciii.clients.posts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Post(Long id, String title) {
}
