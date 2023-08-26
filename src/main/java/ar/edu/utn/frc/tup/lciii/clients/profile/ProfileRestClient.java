package ar.edu.utn.frc.tup.lciii.clients.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProfileRestClient {

    @Autowired
    private WebClient webClient;

    //String resourceUrl = "https://my-json-server.typicode.com/TUP-UTN-FRC-LCIII/fake-apis/profile";
    String resourceUrl = "/profile";

    public Mono<ResponseEntity<ProfileDto>> getProfile() {
        return this.webClient
                .get()
                .uri(resourceUrl)
                .retrieve()
                .toEntity(ProfileDto.class);
    }
}
