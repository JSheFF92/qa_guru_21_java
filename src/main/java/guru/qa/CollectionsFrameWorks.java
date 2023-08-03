package guru.qa;

import guru.qa.framework.*;

import java.util.*;


public class CollectionsFrameWorks {

    public static void main(String[] args) {

        SetFrame set = new SetFrame(11, 12, 13);
        SetFrame set1 = new SetFrame(12, 13, 14);
        SetFrame set2 = new SetFrame(13, 14, 15);

        ListFrame list = new ListFrame(1, 2, 3);
        ListFrame list1 = new ListFrame(2, 5, 8);
        ListFrame list2 = new ListFrame(3, 8, 13);

        QueueFrame queue = new QueueFrame(21, 22, 23);
        QueueFrame queue1 = new QueueFrame(22, 25, 28);
        QueueFrame queue2 = new QueueFrame(23, 28, 33);

        CustomMap<String, String> custoMap = new CustomMap<>();

        Queue hashPerem = new LinkedList();


        //List
        List<ListFrame> perem = List.of(list, list2);
        list1.printList();
        list1.addPerem(perem);

        //Set
        set1.printSet();
        Set<SetFrame> perems = Set.of(set, set2);
        set1.addSetPerem(perems);

        //Map
        custoMap.put("testKey", "testValue");
        System.out.println(custoMap.get("testKey"));

        //Queue
        hashPerem.add("1");
        hashPerem.add("2");
        hashPerem.add("3");
        queue1.addQueuePerem((List<Queue>) hashPerem);

    }
}
