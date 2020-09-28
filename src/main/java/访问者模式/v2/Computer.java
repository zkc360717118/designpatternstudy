package 访问者模式.v2;



public class Computer {
}

abstract class ComputerPart{
    abstract void accept(Visitor v);
    abstract void getPrice();
}

class CPU extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitCPU(this);
    }

    @Override
    int getPrice() {
        return 300;
    }
}


interface Visitor {
    void visitCPU(CPU c);
    void visitMemo(Memory m);
    void visitBoard(Board b);
}