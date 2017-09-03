package com.example.demo.node.impl;

//@Slf4j
//@Service("nodeContentService")
public class NodeContentServiceImpl {

//	@Autowired
//	private NodeContentDAO nodeContentDAO;
//	@Autowired
//	private NodeTagDAO nodeTagDAO;
//	@Autowired
//	private NodeCarCodeDAO nodeCarCodeDAO;
//	@Autowired
//	private ModelMapper modelMapper;
//
//	@Transactional(timeout = 10)
//	public void saveContent(kr.co.carlab.domain.Content content) {
//
//		NodeContent c = selectNodeConetent(content);
//
//		List<RelationTagging> relationTaggingList = new ArrayList<RelationTagging>();
//		List<RelationCode> relationCodeList = new ArrayList<>();
//
//		if(!ObjectUtils.isEmpty(content.getTagList())) {
//			content.getTagList().forEach(tag ->
//				{
//					RelationTagging relationTagging = new RelationTagging();
//					relationTagging.setNodeContent(c);
//					relationTagging.setNodeTag(makeNodeTag(tag.getText()));
//					relationTaggingList.add(relationTagging);
//				}
//			);
//		}
//
//		c.setTaggingList(relationTaggingList);
//
//		RelationCode relationCode = new RelationCode();
//		relationCode.setNodeContent(c);
//		relationCode.setNodeCarCode(makeNodeCarCode(content.getCarCode()));
//		relationCodeList.add(relationCode);
//
//		c.setCarCd(relationCodeList);
//		c.setSubject(content.getSubject());
//		c.setContentIdx(content.getIdx());
//		c.setView((long)content.getView());
//
//		//NodeContent returnContent = selectNodeConetent(content);
//		try{
//			nodeContentDAO.save(c);
//		} catch (Exception e){
//			log.error("NodeContentServiceImpl Exception", e);
//		}
//
//		/*
//		List<NodeContent> nodeContentList = nodeContentDAO.findByContentIdx(content.getIdx());
//		if(nodeContentList.size() == 0 || ObjectUtils.isEmpty(nodeContentList)) {
//			nodeContentDAO.save(c);
//		}*/
//	}
//
//	public NodeContent selectNodeConetent(kr.co.carlab.domain.Content content){
//		//NodeContent c = modelMapper.map(content,NodeContent.class);
//		List<NodeContent> nodeContentList = nodeContentDAO.findByContentIdx(content.getIdx());
//		if(nodeContentList.size() == 0 || ObjectUtils.isEmpty(nodeContentList)){
//			NodeContent c = new NodeContent();
//			c.setSubject(content.getSubject());
//			c.setContentIdx(content.getIdx());
//			c.setView((long)content.getView());
//
//			return c;
//		}else{
//			nodeContentDAO.initNodeContentRelation(nodeContentList.get(0).getContentIdx());
//			return nodeContentList.get(0);
//		}/*
//		NodeContent c = new NodeContent();
//		c.setSubject(content.getSubject());
//		c.setContentIdx(content.getIdx());
//		c.setView((long)content.getView());
//
//		return nodeContentDAO.save(c);
//		*/
//	}
//	public NodeTag makeNodeTag(String text){
//		List<NodeTag> taglist = nodeTagDAO.findByText(text);
//		if(taglist.size() == 0 || ObjectUtils.isEmpty(taglist)){
//			NodeTag nodeTag = new NodeTag();
//			nodeTag.setText(text);
//			return nodeTag;
//		}else{
//			return taglist.get(0);
//		}
//	}
//	public NodeCarCode makeNodeCarCode(String carCode){
//		List<NodeCarCode> carCodeList = nodeCarCodeDAO.findByText(carCode);
//		if(carCodeList.size() == 0 || ObjectUtils.isEmpty(carCodeList)){
//			NodeCarCode nodeCarCode = new NodeCarCode(carCode);
//			return nodeCarCode;
//		}else{
//			return carCodeList.get(0);
//		}
//	}
//	public RelationTagging saveRelationTagging(NodeContent from,NodeTag to){
//		RelationTagging relationTagging = new RelationTagging();
//		relationTagging.setNodeContent(from);
//		relationTagging.setNodeTag(to);
//		Collection<String> tagNames = new HashSet();
//		tagNames.add("FROM "+from.getIdx()+" TO "+to.getText());
//		relationTagging.setRelationTaggings(tagNames);
//
//		return relationTagging;
//	}
//
//	public void updateContentView(long contentIdx) {
//		/*
//		List<NodeContent> contentList= nodeContentDAO.findByContentIdx(content.getIdx());
//		contentList.get(0).setView(content.getView());
//		nodeContentDAO.save(contentList.get(0));
//		log.debug("UPDATE CONTENT VIEW : "+contentList.get(0).toString());
//		*/
//		try{
//			List<Object> contentList = nodeContentDAO.updateContentView(contentIdx);
//		} catch (Exception e){
//			log.error("NodeContentServiceImpl Exception", e);
//		}
//	}
//	public void updateContentViewCnt(long contentIdx,long count) {
//		/*
//		List<NodeContent> contentList= nodeContentDAO.findByContentIdx(content.getIdx());
//		contentList.get(0).setView(content.getView());
//		nodeContentDAO.save(contentList.get(0));
//		log.debug("UPDATE CONTENT VIEW : "+contentList.get(0).toString());
//		*/
//		try{
//			List<Object> contentList = nodeContentDAO.updateContentViewCnt(contentIdx,count);
//		} catch (Exception e){
//			log.error("NodeContentServiceImpl Exception", e);
//		}
//	}
//
//	@Transactional(readOnly = true, timeout = 5)
//	public List<Object> findRelationContents(Content content) {
//		List<Object>relationConntentList =  nodeContentDAO.findRelationContents(content.getIdx());
//		return relationConntentList;
//	}
}
