package guru.qa.framework;

// for цикл
//готов

import java.util.List;

public class ListFrame {
    final int listA;
    final int listB;
    final int listC;
    List<ListFrame> perem;

    public ListFrame(int listA, int listB, int listC) {
        this.listA = listA;
        this.listB = listB;
        this.listC = listC;

    }

    public void printList() {
        System.out.println(this);
    }

    public void addPerem(List<ListFrame> perem) {
        this.perem = perem;
        for (int i = 0; i < this.perem.size(); i++) {
            System.out.print("perem: ");
            this.perem.get(i).printList();
        }


    }

    @Override
    public String toString() {
        return
                "listA = " + listA +
                        ", listB = " + listB +
                        ", listC = " + listC;
    }
}
