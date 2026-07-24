// Last updated: 7/25/2026, 12:24:37 AM
1class MyStack {
2    Queue<Integer> q1;
3    Queue<Integer> q2;
4    public MyStack() {
5        q1 = new LinkedList<>();
6        q2 = new LinkedList<>();
7    }
8    
9    public void push(int x) {
10        q1.offer(x);
11    }
12    
13    public int pop() {
14        int el=-1;
15        while(q1.size()!=1){
16            q2.offer(q1.poll());
17        }
18        if(q1.size()==1){
19            el = q1.poll();
20        }
21        while(!q2.isEmpty()){
22            q1.offer(q2.poll());
23        }
24        return el;
25    }
26    
27    public int top() {
28        int el=-1;
29        while(q1.size()!=1){
30            q2.offer(q1.poll());
31        }
32        if(q1.size()==1){
33            el = q1.peek();
34            q2.offer(q1.poll());
35        }
36        while(!q2.isEmpty()){
37            q1.offer(q2.poll());
38        }
39        return el;
40    }
41    
42    public boolean empty() {
43        return q1.isEmpty();
44    }
45}
46
47/**
48 * Your MyStack object will be instantiated and called as such:
49 * MyStack obj = new MyStack();
50 * obj.push(x);
51 * int param_2 = obj.pop();
52 * int param_3 = obj.top();
53 * boolean param_4 = obj.empty();
54 */