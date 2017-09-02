package com.example.demo.config;

import org.springframework.boot.autoconfigure.data.neo4j.Neo4jRepositoriesAutoConfiguration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by ksb on 2017. 9. 2..
 */
@EnableNeo4jRepositories
@EnableTransactionManagement
public class Neo4jConfig {
}
