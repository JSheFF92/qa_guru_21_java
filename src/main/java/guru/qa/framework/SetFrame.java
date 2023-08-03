package guru.qa.framework;


// for each цикл
//готов

import java.util.Objects;
import java.util.Set;

public class SetFrame {
    int setA;
    int setB;
    int setC;
    Set<SetFrame> setPerem;

    public SetFrame(int setA, int setB, int setC) {
        this.setA = setA;
        this.setB = setB;
        this.setC = setC;
    }

    public void printSet() {
        System.out.println(this);
    }

    public void addSetPerem(Set<SetFrame> setPerem) {
        this.setPerem = setPerem;
        for (SetFrame setPeremen : this.setPerem) {
            System.out.print("setPerem: ");
            setPeremen.printSet();
        }


    }

    @Override
    public String toString() {
        return
                "setA = " + setA +
                        ", setB = " + setB +
                        ", setC = " + setC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetFrame setFrame = (SetFrame) o;
        return setA == setFrame.setA && setB == setFrame.setB && setC == setFrame.setC && Objects.equals(setPerem, setFrame.setPerem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(setA, setB, setC, setPerem);
    }
}
