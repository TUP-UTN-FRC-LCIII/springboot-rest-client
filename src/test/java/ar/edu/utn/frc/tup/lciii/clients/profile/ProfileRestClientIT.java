package ar.edu.utn.frc.tup.lciii.clients.profile;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class ProfileRestClientIT {

    @Autowired
    private ProfileRestClient profileRestClient;

    @Test
    void getPostsIntegrationTest() {
        Mono<ResponseEntity<ProfileDto>> result = profileRestClient.getProfile();
        ProfileDto profile = result.blockOptional().get().getBody();
        assertEquals("typicode", profile.getName());
    }
}