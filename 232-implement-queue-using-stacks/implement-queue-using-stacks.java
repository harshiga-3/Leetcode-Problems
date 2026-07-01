class MyQueue {
public Stack<Integer>q;
    public MyQueue() {
        q=new Stack<>();
    }
    
    public void push(int x) {
         if(q.isEmpty())  {
            q.push(x);
            return;
         }
         int top=q.pop();
         push(x);
         q.push(top);
    }
    
    public int pop() {
        return q.pop();
    }
    
    public int peek() {
       return q.peek(); 
    }
    
    public boolean empty() {
       return q.isEmpty(); 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */