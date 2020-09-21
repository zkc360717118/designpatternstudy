package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");
        LeafNode c11 = new LeafNode("c11");
        LeafNode c12 = new LeafNode("c12");
        BranchNode b21 = new BranchNode("b21");
        LeafNode c211 = new LeafNode("c211");
        LeafNode c212 = new LeafNode("c212");

        root.add(chapter1);
        root.add(chapter2);
        chapter1.add(c11);
        chapter1.add(c12);
        chapter2.add(b21);
        b21.add(c211);
        b21.add(c212);

        tree(root,1);
    }

    static void tree(Node b,int depth) {
        //打印出层级关系
        for (int x = 1; x < depth;x++) {
            System.out.print("--");
        }

        //无论你是文件夹还是文件，进来先自报家门
        b.p();

        //如果是文件夹，把里面的的文件、文件夹打印出来
        if (b instanceof BranchNode) {
            for (Node n : ((BranchNode) b).node) {
                tree(n,depth+1);
            }
        }



    }
}

abstract class  Node{
    abstract public void p();
}


class LeafNode extends Node {
    String content;

    public LeafNode(String conent) {
        this.content = conent;
    }

    @Override
    public void p() {
        System.out.println(content);
    }
}

class BranchNode extends Node {
    List<Node> node = new ArrayList<>();
    String content;

    public BranchNode(String content) {
        this.content = content;
    }

    @Override
    public void p() {
        System.out.println(content);
    }

    public void add(Node node) {
        this.node.add(node);
    }
}