package pk.cui.sc.finallab;

import java.util.ArrayList;
import java.util.List;

public class HTMLParentElement extends HTMLTag {

	
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HTMLTag> childrenTag;
	
	public HTMLParentElement(String tagName) {
		        this.tagName = tagName;
		        this.startTag = "";
		        this.endTag = "";
		        this.childrenTag = new ArrayList<>();
		    }

	public String getTagName() {
		return tagName;
	}

	public void setStartTag(String startTag) {
		this.startTag = startTag;
	}

	   @Override
	    public void setEndTag(String tag) {
	        this.endTag = tag;
	    }
	     
	    @Override
	    public void addChildTag(HTMLTag htmlTag){
	        childrenTag.add(htmlTag);
	    }
	     
	    @Override
	    public void removeChildTag(HTMLTag htmlTag){
	        childrenTag.remove(htmlTag);
	    }
	    
	    @Override 
	    public List<HTMLTag> getChildren(){
	        return childrenTag;
	    }
	 
	    @Override
	    public void generateHtml() {
	        System.out.println(startTag);
	        for(HTMLTag tag : childrenTag){
	            tag.generateHtml();
	        }
	        System.out.println(endTag);
	         
	    }
	
	
	
}
