import java.util.Stack;

public class treeBinary {


    Node root = null;



    public void inserTree(int value) {

        Node node = new Node(value);

        if (root == null){
            root = node;
            return;
        };

        Node current = root;
        Node parent = null;

        while (current != null){
            parent = current;

            if (value < current.value) current = current.left;
            else if (value > current.value) current = current.right;
            else return;
        }


        node.parent = parent;

        if(value < parent.value) parent.left = node;
        else parent.right = node;


    }



    public void inorder() {
        if (root == null) return;

        Stack<Node> stack = new Stack<Node>();

        Node current = root;

        while(current != null || !stack.isEmpty()){


            while(current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.println(current.value+ " ");

            current = current.right;

        }

    }



}
