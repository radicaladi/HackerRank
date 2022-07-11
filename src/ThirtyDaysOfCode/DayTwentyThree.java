package ThirtyDaysOfCode;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Scanner;

public class DayTwentyThree {
    static void levelOrder(Node root) {
        //Write your code here
        if (root == null) {
            return;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root); //adding root to linked-list
        while (!queue.isEmpty()) {
            Node current_node = queue.poll(); //poll is last in first out

            System.out.print(current_node.data + " ");

            // will add node in left-right-left-right (so-on) pattern
            if (current_node.left != null) {
                queue.add(current_node.left); //if node is not empty add it
            }

            if (current_node.right != null) {
                queue.add(current_node.right); // if node is not empty add it
            }
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
