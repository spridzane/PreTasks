package PreTask5;

public class MyThread extends Thread{

    private int startIdx, nThread, maxIdx;

    public MyThread(int start, int number, int maxCount){
        this.startIdx = start;
        this.nThread = number;
        this.maxIdx = maxCount;
    }

    @Override
    public void run(){
        for(int i = this.startIdx; i < this.maxIdx; i += this.nThread){
            System.out.println("(Thread id: " + this.getName() + ")" + i);
        }
    }

}
