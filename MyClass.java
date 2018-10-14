package com.demo2;

public class MyClass {

	public static void main(String[] args) {
		NodeList node = new NodeList();
		node.add(2);
		node.add(3);
		node.add(5);
		node.delete(15);
		node.printData();
	}
}

class Node{
	 Node next;
	 int data;
	 
	 public Node(int data) {
		 this.data=data;
	 }
	 
}
class NodeList{

	public Node head;
	public NodeList() {
		this.head=null;
	}
	
	public void add(int data) {
		
		Node n= new Node(data);
		n.next=head;
		head=n;
	}
	public void delete(int data) {
		Node t=head;
		int found=0;
		if(t.data==data) {
			found=1;
			head=head.next;
		}
		else{
			Node t1=head;
			while(t!=null){
				if(t.data==data){
					found=1;
					break;
				}
				t1=t;
				t=t.next;
			}
			if(found==1){
				t1.next=t.next;
			}
		}
		if(found==0){
			System.out.println("number not found in linked list");
		}
		
	}
	public void printData(){
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}
}
