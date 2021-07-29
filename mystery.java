public class mystery {

    public void run () 
    {
        int result = compute(4);
        System.out.println(result);
    }

    public int compute (int n)
    {
        if(n==1)
        return 1;
        else
        return n *compute(n-1);
    }

    public static void main(String args[]) 
    {
        mystery m1 = new mystery();
        m1.run();
    }

}