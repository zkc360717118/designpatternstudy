package 访问者模式.v2;



public class Computer {
    CPU cpu = new CPU();
    Memory memory = new Memory();
    Board board = new Board();

    public void accept(Visitor v) {
        cpu.accept(v);
        memory.accept(v);
        board.accept(v);
    }

    public static void main(String[] args) {
        // 个人用户 去电脑城买
        PersonalVistor personalVistor = new PersonalVistor();
        Computer computer = new Computer();
        computer.accept(personalVistor);
        System.out.println(personalVistor.totalPrice);

        //企业用户 去电脑城买
        CompanyVistor companyVistor = new CompanyVistor();
        new Computer().accept(companyVistor);
        System.out.println(companyVistor.totalPrice);

    }
}

abstract class ComputerPart{
    abstract void accept(Visitor v);
    abstract int getPrice();
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

 class Memory extends ComputerPart{
     @Override
     void accept(Visitor v) {
         v.visitMemo(this);
     }

     @Override
     int getPrice() {
         return 500;
     }
 }
class Board extends ComputerPart{
    @Override
    void accept(Visitor v) {
        v.visitBoard(this);
    }

    @Override
    int getPrice() {
        return 100;
    }
}

interface Visitor {
    void visitCPU(CPU c);
    void visitMemo(Memory m);
    void visitBoard(Board b);
}

class PersonalVistor implements Visitor {
    double totalPrice = 0;

    @Override
    public void visitCPU(CPU c) {
        totalPrice += c.getPrice()*0.9; //个人用户打九折
    }

    @Override
    public void visitMemo(Memory m) {
        totalPrice += m.getPrice()*0.9; //个人用户打九折

    }

    @Override
    public void visitBoard(Board b) {
        totalPrice += b.getPrice()*0.9; //个人用户打九折
    }
}

class CompanyVistor implements Visitor {
    double totalPrice = 0;

    @Override
    public void visitCPU(CPU c) {
        totalPrice += c.getPrice()*0.6; //企业用户打6折
    }

    @Override
    public void visitMemo(Memory m) {
        totalPrice += m.getPrice()*0.6; //企业用户打6折

    }

    @Override
    public void visitBoard(Board b) {
        totalPrice += b.getPrice()*0.6; //企业用户打6折
    }
}


