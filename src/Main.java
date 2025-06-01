import java.io.*;
import java.util.Properties;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\news.txt");
        System.out.println(file.length());
//        FileOutputStream fileOutputStream = new FileOutputStream("D:\\news.txt");
//        byte[] bytes="hello world".getBytes();
//        fileOutputStream.write(8);
//        fileOutputStream.close();
//
//        byte[] bytes = new byte[8];
//        FileInputStream fileInputStream = new FileInputStream("D:\\news.txt");
//        fileInputStream.read(bytes);
////
//        System.out.println(new String(bytes));
//        System.out.println((char)fileInputStream.read());
//        fileInputStream.close();
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//        objectOutputStream.write(1);
//        PrintWriter pw = new PrintWriter();
//        System.out.println();
//        BufferedInputStream br = new BufferedInputStream(new FileInputStream("D:\\news.txt"));
//        byte[] bytes = new byte[100];
//        System.out.println(br.read(bytes));
//        System.out.println(new String(bytes,"gbk"));
//        Reader reader = new FileReader("D:\\news.txt");
//        char[] buf = new char[1024];
//        int read=reader.read(buf);
//        System.out.println(read);
//        System.out.println(new String(buf,0,read));
        Properties properties = new Properties();
        properties.load(new FileReader("..\\..\\..\\xiangmu1.qq\\aa.properties"));
        properties.list(System.out);


    }
}
class sscount implements Runnable,Serializable
{
    static final InputStream in=null;
    static  int count =11;
    static  Object lock = new Object();
    public synchronized void m(){
        while(true){
            if(count<=0){
                break;
             }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count--;
            System.out.println(count);
        }
    }
    @Override
    public synchronized void run() {
        m();
    }

}