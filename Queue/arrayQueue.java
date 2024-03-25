public class arrayQueue{
    static class Queue{
        static int[] arr;
        static int rear;
        static int size;
        Queue(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
        }
    
    public static boolean isEmpty()
    {
        return rear==-1;
    }
    public static void add(int n)
    {
        if(rear==size-1)
        {
            System.out.println("the stack is full");
            return;
        }
            rear++;
            arr[rear]=n;
        
    }
    public static int remove()
    {
        if(isEmpty())
        {
            System.out.println("the stack is empty : ");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++)
        {
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }
    public static int peek()//return front
    {       
         if(isEmpty())
        {
            System.out.println("the stack is empty : ");
            return -1;
        }
        return  arr[0];
    }
    }
    public static void main(String args[])
    {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.remove());
        }
    }
}