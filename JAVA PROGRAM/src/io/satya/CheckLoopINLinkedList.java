package io.satya;

import java.util.HashSet;
	  
public class CheckLoopINLinkedList { 
	  
	    static Node head; // head of list 
	  
	    /* Linked list Node*/
	    static class Node { 
	        int data; 
	        Node next; 
	        Node(int d) 
	        { 
	            data = d; 
	            next = null; 
	        } 
	    } 
	  
	    /* Inserts a new Node at front of the list. */
	    static public void push(int new_data) 
	    { 
	        Node new_node = new Node(new_data); 
	        new_node.next = head; 
	        head = new_node; 
	    } 
	    
	    static boolean detectLoop(Node h) 
	    { 
	    	System.out.println(h.data);
	        HashSet<Node> s = new HashSet<Node>(); 
	        while (h != null) {
	            if (s.contains(h)) 
	                return true; 
	            s.add(h); 
	  
	            h = h.next; 
	        } 
	        return false; 
	    } 
	    /* Driver program to test above function */
	    public static void main(String[] args) 
	    { 
	    	CheckLoopINLinkedList llist = new CheckLoopINLinkedList(); 
	  
	        llist.push(20); 
	        llist.push(4); 
	        llist.push(15); 
	        llist.push(10); 
	  
	        /*Create loop for testing */
	        System.out.println("what is lis.head "+llist.head.data);
	        llist.head.next.next.next.next = llist.head; 
	  
	        if (detectLoop(head)) 
	            System.out.println("Loop found"); 
	        else
	            System.out.println("No Loop"); 
	    } 
	} 
	

