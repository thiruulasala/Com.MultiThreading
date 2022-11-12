package MultiThread;
class Test extends Thread{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("welcome to thread class");
        }
    }
}
public class WlecomeClass
{
    public static void main(String[] args)
    {
        Test ts=new Test();
        ts.start();
       for(int i=0;i<10;i++)
        {
            System.out.println("Main thread");
        }
    }

}
