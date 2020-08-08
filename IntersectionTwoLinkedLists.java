package com.AhmedSafwat;
import java.util.*;
// Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
/**
 * 160. Intersection of Two Linked Lists
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 * **/

/** First Solution O(n) runtime & O(n) space **/
public class IntersectionTwoLinkedLists {
    Set<ListNode> nodes=new HashSet<>();
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA==null|| headB==null)return null;
        /**Looping through the whole List and add all the nodes in Set **/
        while (headA!=null){
            nodes.add(headA);
            headA=headA.next;
        }
        /**check if the Set includes the the same node reference **/
        while (headB!=null){

            if(nodes.contains(headB))
                return headB;
            headB=headB.next;
        }
        return null;
    }
    /** Second Solution O(n) runtime & O(1) space **/
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA==null|| headB==null)return null;
         ListNode endA= headA;
        /**Pointer endA to the end headA**/
        while (endA.next!=null)
            endA=endA.next;
        /**Connect endA to headB to make a cycle**/
        endA.next=headB;
        /**if there is no cycle print null**/
        ListNode intersection= null;
        /**Applying floyd's cycle finder**/
        ListNode slow = headA, fast = headA;
     	while (fast != null && fast.next != null) {
     		slow = slow.next;
     		fast = fast.next.next;
     		if(slow==fast)
            {   /**get the intersection node**/
                intersection=headA;
                while (intersection!=slow){
                    slow=slow.next;
                    intersection=intersection.next;
                }
                break;
            }
     	}
     	/**remove the cycle**/
        endA.next= null;
     	return intersection;
    }
}
