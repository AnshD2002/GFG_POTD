class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slownode = head;
        Node fastnode = head;
        while(fastnode != null && fastnode.next != null && fastnode.next != slownode){
            slownode = slownode.next;
            fastnode = fastnode.next.next;
        }
        
        if(fastnode != null && fastnode.next == slownode){
            int len = 1;
            while(slownode != fastnode){
                slownode = slownode.next;
                ++len;
            }
            return len;
        }
        
        return 0;
    }
}
