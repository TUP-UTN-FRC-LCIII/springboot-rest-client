package ar.edu.utn.frc.tup.lciii.clients.posts;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PostRestClientTest {


    @SpyBean
    private PostRestClient postRestClient;

    @Test
    void getPostsIntegrationTest() {
        ResponseEntity<Post[]> result = postRestClient.getPosts();
        assertEquals(3, Objects.requireNonNull(result.getBody()).length);
    }
}