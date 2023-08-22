package ar.edu.utn.frc.tup.lciii.clients.posts;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostRestClient {

    RestTemplate restTemplate = new RestTemplate();

    String baseResourceUrl = "https://my-json-server.typicode.com/TUP-UTN-FRC-LCIII/fake-apis/posts";

    public ResponseEntity<Post[]> getPosts() {
        return restTemplate.getForEntity(baseResourceUrl, Post[].class);
    }

}
