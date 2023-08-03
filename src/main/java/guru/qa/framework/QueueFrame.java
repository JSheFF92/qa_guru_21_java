package guru.qa.framework;


import java.util.*;


// переделать
// цикл while
public class QueueFrame {
    int queueA;
    int queueB;
    int queueC;

    //    Queue<QueueFrame> queuePerem;
    List<Queue> queuePerem;

//    QueueFrame[] hashPerem;

    public QueueFrame(int queueA, int queueB, int queueC) {
        this.queueA = queueA;
        this.queueB = queueB;
        this.queueC = queueC;


    }

    public void addQueuePerem(List<Queue> queuePerem) {
        this.queuePerem = queuePerem;
        int i = 0;
        while (i < this.queuePerem.size()) {
            System.out.print(" perem get: " + this.queuePerem.get(i));
            i++;
        }
    }

    @Override
    public String toString() {
        return
                "queueA = " + queueA +
                        ", queueB = " + queueB +
                        ", queueC = " + queueC;
    }

}
