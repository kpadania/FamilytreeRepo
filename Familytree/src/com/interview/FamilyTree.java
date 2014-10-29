package com.interview;

public class FamilyTree {
    Person Grandparent;
	public FamilyTree(Person grandparent) {
		Grandparent = grandparent;
	}
	
	public FamilyTree(String grandparentname) {
		Person grandParent = new Person( grandparentname);
		this.Grandparent=grandParent;
	}
	
	public void addMember(Person newmember,Person parent){
		
	}
	public void deleteMember(Person member){
		
	}
	public void renameMember(Person member, String newname){
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
