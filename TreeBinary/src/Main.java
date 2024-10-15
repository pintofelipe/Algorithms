import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 20 50 58 59 46 48

        int data[] = {20,50,50,90,78};

        treeBinary tree = new treeBinary();

        for(int i: data){
            tree.inserTree(i);
        }

        tree.inorder();



    }



}