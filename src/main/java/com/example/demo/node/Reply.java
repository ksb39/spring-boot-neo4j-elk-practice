package com.example.demo.node;

import lombok.Data;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by ksb on 2017. 9. 2..
 */
@Data
@NodeEntity
public class Reply {

    @GraphId
    private Long id;
    private String content;

}
