package com.example.demo.repository;

import com.example.demo.node.Tag;
import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * Created by ksb on 2017. 9. 2..
 */
public interface TagRepository extends GraphRepository<Tag> {
}
