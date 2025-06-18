public class Test
{
public static void main(String args[])
{
System.out.println("Welcome to core java.");
System.out.println("Java is really nice.");
Runnable r = ()->{
  for(int i=1;i<=10;i++)
    {
      System.out.println("Java classes : "+i);
      try
        {
          Thread.sleep(300);
        }
      catch(InterruptedException ie){}
    }
};
  Thread t1 = new Thread(r);
  t1.start();
}
}
