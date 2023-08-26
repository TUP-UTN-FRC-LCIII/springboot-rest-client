package ar.edu.utn.frc.tup.lciii.clients.posts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostRestClient {

    @Autowired
    private RestTemplate restTemplate;

    String baseResourceUrl = "https://my-json-server.typicode.com/TUP-UTN-FRC-LCIII/fake-apis/posts";

    public ResponseEntity<PostDto[]> getPosts() {
        return restTemplate.getForEntity(baseResourceUrl, PostDto[].class);
    }

    public ResponseEntity<PostDto> getPost(Long id) {
        return restTemplate.getForEntity(baseResourceUrl + "/" + id, PostDto.class);
    }

}
