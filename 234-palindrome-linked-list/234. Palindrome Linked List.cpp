/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        if(head==nullptr || head->next==nullptr)
        {
            return true;
        }

        ListNode* slow=head;
        ListNode* fast=head;

        while(fast!=nullptr && fast->next!=nullptr)
        {
            slow=slow->next;
            fast=fast->next->next;
        }

        ListNode* prev=nullptr;                 // < 1 2 3 | 3 2 1>  -> < 1 2 3 | 1 2 3 >->=? true:false
        while(slow!=nullptr)
        {
            ListNode* nextNode=slow->next;
            slow->next=prev;
            prev=slow;
            slow=nextNode;
        }  

        ListNode* head1=head;
        ListNode* head2=prev;

        while(head2!=nullptr)
        {
            if(head1->val!=head2->val)
            {
                return false;
            }
            head1=head1->next;
            head2=head2->next;
        }
        return true;

    }
};