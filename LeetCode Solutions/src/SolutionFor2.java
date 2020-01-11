public class SolutionFor2 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    private int size(ListNode l){
        int size=0;
        while(l!=null){
            l=l.next;
            size++;
        }
        return size;
    }



    public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
        int size1=size(l1);
        int size2=size(l2);
        if(size1<size2){
            ListNode sub = l1;
            l1=l2;
            l2=sub;
        }


        ListNode head = new ListNode(0);
        int digit =0;
        ListNode res = head;

        while(l1!=null&&l2!=null){

            int ans = l1.val+l2.val+digit;
            ListNode newNode =new ListNode((ans)%10);
            digit=0;
            res.next=newNode;
            if((ans)>=10){
                digit=1;
            }else{
                digit=0;
            }
            l1=l1.next;
            l2=l2.next;
            res=res.next;
        }

        while(l1!=null){
            ListNode newNode = new ListNode((l1.val+digit)%10);
            if(l1.val+digit>=10){
                digit=1;
            }else{
                digit=0;
            }
            res.next=newNode;

            res=res.next;
            l1=l1.next;
        }

        if(digit!=0){
            ListNode newNode = new ListNode(1);
            res.next=newNode;
        }

        return head.next;

    }
}
