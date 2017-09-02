package com.example.demo.node;

import lombok.Data;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ksb on 2017. 9. 2..
 */
@Data
@NodeEntity
public class User {

    @GraphId
    private Long id;
    private String email;
    private String name;
    private String password;

    @Relationship(type = "FRIEND", direction = Relationship.UNDIRECTED)
    public Set<User> friends;

    public void makeFriend(User user) {
        if(friends == null) {
            friends = new HashSet<>();
        }
        friends.add(user);
    }

}
