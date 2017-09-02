package com.example.demo.node;

import com.example.demo.node.NodeContent;
import com.example.demo.node.NodeTag;
import lombok.Data;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.Collection;

/**
 * Created by ksb on 2017. 9. 2..
 */
@Data
@RelationshipEntity(type = "TAGGING")
public class Tagging {

    @GraphId
    Long idx;

    private Collection<String> taggingList;

    @StartNode
    private Post post;

    @EndNode
    private Tag tag;

}
