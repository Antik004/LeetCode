/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    void deleteNode(ListNode* node) {
        ListNode* temp=node->next;   // the given *node is actually the link part of the prev node
        node->val=temp->val;         //we copy the link part and get the actual node which contains the value to delete; next to that we take that link part and attach it to the next node to the deletable node    
        node->next=temp->next;//here the node val is changed to the next node's val cuz we did node->val=temp->val where temp is actually the third node
    }
};