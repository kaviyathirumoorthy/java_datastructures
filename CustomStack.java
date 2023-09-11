public class CustomStack
{
   private  int [] stackarray;
   private int top;
   private int capacity;
   public CustomStack(int capacity){
       this.capacity=capacity;
       this.stackarray=new int[capacity];
       this.top=-1;
   }
   public void push(int value){
       if(isfull()){
           System.out.println("stack is full");
           
       }
       else {
           stackarray[++top]=value;
           System.out.println("Value "+value+" is pushed to array");
       }
   }
   public void pop(){
       if(isempty()){
           System.out.println("stack is empty");
           
       }
       else {
           --top;
       }
   }
   public boolean isfull(){
       return top==capacity-1;
   }
   public boolean isempty(){
       return top==-1;
   }
   public void display(){
       System.out.print("[");
       for(int i=0;i<=top;i++){
       System.out.print(stackarray[i]);
       if(i!=top) System.out.print(",");
       }
       System.out.print("]");
   }
   public void peek(){
       System.out.println();
       System.out.println(stackarray[top]);
   }
	public static void main(String[] args) {
		CustomStack s1=new CustomStack(5);
		s1.push(4);s1.push(3);s1.push(5);s1.push(1);s1.push(2);s1.push(6);s1.push(10);
		//System.out.print(s1);
		s1.display();
		s1.peek();
		s1.pop();s1.pop();s1.pop();s1.pop();s1.pop();s1.pop();s1.pop();s1.pop();
			s1.display();
	}
}