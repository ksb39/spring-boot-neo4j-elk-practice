package com.example.demo.node;

import com.example.demo.node.NodeContent;
import lombok.Data;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

/**
 * Created by ksb on 2017. 9. 2..
 */
@Data
@NodeEntity
public class Tag {

    @GraphId
    private Long id;

    private String text;

    @Relationship(type="TAGGING")
    private List<Post> postList;

}
