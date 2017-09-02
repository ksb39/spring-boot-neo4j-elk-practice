package com.example.demo.repository;

import com.example.demo.node.Post;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by ksb on 2017. 9. 2..
 */
public interface PostRepository extends GraphRepository<Post> {
}
