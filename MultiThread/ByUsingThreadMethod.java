package MultiThread;

import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte0.runnable;

class HelloThread implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hello Thread");
        }
    }
}
public class ByUsingThreadMethod
{
    public static void main(String[] args)
    {
        HelloThread ht=new HelloThread();
        Thread t=new Thread(ht);
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main Thread");
        }
    }
}
