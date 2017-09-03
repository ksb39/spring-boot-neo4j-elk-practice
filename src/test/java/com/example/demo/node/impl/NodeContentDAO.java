package com.example.demo.node.impl;

public interface NodeContentDAO
//        extends GraphRepository<NodeContent>
{
/*    @Query( "MATCH (m { subject: {subject} })<-[r1:TAGGING|CODE]-(NodeTag)-[r2:TAGGING|CODE]->(c:Content)" +
            "RETURN c,(r1.relationTagPoint+count(r1=r2 AND r1='TAGGING')) AS TAG_POINT," +
            "(r1.relationCodePoint*count(r1='CODE')) AS CODE_POINT," +
            "(r1.relationTagPoint+count(r1=r2 AND r1='TAGGING')+r1.relationCodePoint*count(r1='CODE')) AS TOTAL_POINT\n" +
            "ORDER BY TOTAL_POINT DESC")
            */
/*
@Query("MATCH (m)<-[r1:TAGGING|CODE]-(f)-[r2:TAGGING|CODE]->(c:Content)" +
        "WHERE m.subject = {subject} AND type(r1)=type(r2)" +
        "WITH  c,(r1.relationTagPoint+count(r1=r2='TAGGING')) AS TAG_POINT,(r1.relationCodePoint*count(r1=r2='CODE')) AS CODE_POINT\n" +
        "RETURN c,TAG_POINT,CODE_POINT")
        */
//    @Query("MATCH (m{contentIdx:{contentIdx}})<-[r1:TAGGING|CODE]-(n)-[r2:TAGGING|CODE]->(c:NodeContent)\n" +
//            "WITH c\n" +
//            "ORDER BY c.view DESC\n" +
//            "WITH collect(distinct c) as nct\n" +
//            "UNWIND range(0, size(nct)-1) as pos\n" +
//            "SET (nct[pos]).view_point = 10-pos,(nct[pos]).tag_point=0,(nct[pos]).code_point=0,(nct[pos]).total_point=0\n" +
//            "WITH distinct nct\n" +
//            "MATCH (m{contentIdx:{contentIdx}})<-[r1:TAGGING]-(n)-[r2:TAGGING]->(c:NodeContent)\n" +
//            "WITH  c,(r1.relationTagPoint+count(r1=r2='TAGGING')) AS TAG_POINT \n" +
//            "SET c.tag_point = TAG_POINT,c.total_point = c.view_point+c.code_point+c.tag_point\n" +
//            "RETURN c ORDER BY c.total_point DESC LIMIT 6\n" +
//            "UNION MATCH (m{contentIdx:{contentIdx}})<-[r1:CODE]-(n)-[r2:CODE]->(c:NodeContent)\n" +
//            "WITH c,r1.relationCodePoint*count(r1=r2='CODE') AS CODE_POINT SET c.code_point = CODE_POINT\n" +
//            "SET c.total_point = c.view_point+c.code_point+c.tag_point\n" +
//            "RETURN c ORDER BY c.total_point DESC LIMIT 6")
//    List<Object> findRelationContents(@Param("contentIdx") long contentIdx);
//
//    @Query("MATCH (m:NodeContent) WHERE m.contentIdx = {contentIdx} RETURN m LIMIT 1")
//    List<NodeContent> findByContentIdx(@Param("contentIdx") long contentIdx);
//
//    @Query("MATCH (n{contentIdx:{contentIdx}})<-[r:CODE|TAGGING]-(c) \n" +
//            "DELETE r RETURN n")
//    List<NodeContent> initNodeContentRelation(@Param("contentIdx") long contentIdx);
//
//    @Query("MATCH (n:NodeContent) WHERE n.contentIdx = {contentIdx} SET n.view = n.view+1 RETURN n")
//    List<Object> updateContentView(@Param("contentIdx") long contentIdx);
//
//    @Query("MATCH (n:NodeContent) WHERE n.contentIdx = {contentIdx} SET n.view = {count} RETURN n")
//    List<Object> updateContentViewCnt(@Param("contentIdx") long contentIdx, @Param("count") long count);
}
