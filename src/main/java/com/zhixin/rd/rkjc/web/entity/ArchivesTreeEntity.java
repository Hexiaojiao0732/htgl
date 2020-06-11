package com.zhixin.rd.rkjc.web.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ArchivesTreeEntity implements Serializable{

   private static final long serialVersionUID = 1L;

//tree 
   private String id;
   
   private String name;
   
   private List<ArchivesTreeEntity> children = new ArrayList<ArchivesTreeEntity>();
   
   //
   private String areaId;
   
   private String caseId;
   
   private String caseName;
   
   private String personId;
   
   private String personName;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCaseId() {
	return caseId;
}

public void setCaseId(String caseId) {
	this.caseId = caseId;
}

public String getCaseName() {
	return caseName;
}

public void setCaseName(String caseName) {
	this.caseName = caseName;
}

public String getPersonId() {
	return personId;
}

public void setPersonId(String personId) {
	this.personId = personId;
}

public String getPersonName() {
	return personName;
}

public void setPersonName(String personName) {
	this.personName = personName;
}

public void addChildren(ArchivesTreeEntity entity)
{
	if(children==null)
	{
		children=new ArrayList<ArchivesTreeEntity>();
	}
	children.add(entity);
}

public List<ArchivesTreeEntity> getChildren() {
	return children;
}

public void setChildren(List<ArchivesTreeEntity> children) {
	this.children = children;
}



public String getAreaId() {
	return areaId;
}

public void setAreaId(String areaId) {
	this.areaId = areaId;
}

@Override
public String toString() {
	return "ArchivesTreeEntity [id=" + id + ", name=" + name + ", children=" + children + ", caseId=" + caseId
			+ ", caseName=" + caseName + ", personId=" + personId + ", personName=" + personName + ", getId()="
			+ getId() + ", getName()=" + getName() + ", getCaseId()=" + getCaseId() + ", getCaseName()=" + getCaseName()
			+ ", getPersonId()=" + getPersonId() + ", getPersonName()=" + getPersonName() + ", getChildren()="
			+ getChildren() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}


   
   
   



   
}
