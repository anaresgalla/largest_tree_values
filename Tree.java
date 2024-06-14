import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }

        public boolean isLeaf() {
            return (this.left == null) && (this.right == null);
        }
    }

    public void insert(int value) {
        if (root == null) root = new Node(value);
        else {
            Node newNode = new Node(value);
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (queue.size() > 0) {
                Node currentNode = queue.remove();
                if (currentNode.left == null) {
                    currentNode.left = newNode;
                    break;
                } else {
                    queue.add(currentNode.left);
                }
                if (currentNode.right == null) {
                    currentNode.right = newNode;
                    break;
                } else {
                    queue.add(currentNode.right);
                }
            }
        }
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(final Node node) {
        // leitura = Raiz - Esquerda - Direita
        if (node == null) return;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(final Node node) {
        // leitura = Esquerda - Raiz - Direita
        if (node == null) return;
        inOrder(node.left);
        System.out.println(node.value);
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(final Node node) {
        // leitura = Esquerda - Direita - Raiz
        if (node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value);
    }

    public void BFS() {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);

            System.out.println(node.value);
        }
    }
}