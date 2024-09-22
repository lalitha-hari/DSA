import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class BinaryTreeInOrderTraversal {

    // Method for in-order traversal
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderHelper(root, result);
        return result;
    }

    // Helper method for recursive in-order traversal
    private void inOrderHelper(TreeNode node, List<Integer> result) {
        if (node == null) {
            return; // Base case: if the node is null, return
        }
        inOrderHelper(node.left, result); // Traverse left subtree
        result.add(node.value);            // Visit the root node
        inOrderHelper(node.right, result); // Traverse right subtree
    }

    public static void main(String[] args) {
        // Constructing a binary tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        BinaryTreeInOrderTraversal traversal = new BinaryTreeInOrderTraversal();

        // Perform in-order traversal
        List<Integer> result = traversal.inOrderTraversal(root);
        System.out.println("In-order Traversal: " + result);
    }
}
