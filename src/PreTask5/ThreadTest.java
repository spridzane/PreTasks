package PreTask5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channel;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread(0, 3, 100);
        MyThread t2 = new MyThread(1,3,100);
        MyThread t3 = new MyThread(2,3,100);

        try {
            URL website = new URL("https://dribbble.com/");

            ReadableByteChannel channel = Channels.newChannel(website.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream("dribbble.html");
            fileOutputStream.getChannel().transferFrom(channel,0,Long.MAX_VALUE);

        }catch (IOException e){
            e.printStackTrace();
        }

        t1.start();
        t2.start();
        t3.start();



        String info[] = {
                " String info for Thread ....1",
                " String info for Thread ....2",
                " String info for Thread ....3",
                " String info for Thread ....4",
        };

        for(int i = 0; i < info.length; i++){
            Thread.sleep(2000);
            System.out.println("info: " + info[i]);
        }

    }//end main
}
