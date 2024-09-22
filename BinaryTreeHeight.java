import java.util.HashMap;
import java.util.Map;

public class BinaryTreeHeight {

    // Method to find the height of a binary tree given in dictionary form
    public static int findHeight(Map<String, Object> node) {
        if (node == null) {
            return -1; // Base case: empty node returns height of -1
        }

        // Recursively find the height of left and right subtrees
        int leftHeight = findHeight((Map<String, Object>) node.get("left"));
        int rightHeight = findHeight((Map<String, Object>) node.get("right"));

        // Return the height of the current node
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        // Constructing the binary tree in dictionary format
        Map<String, Object> tree = new HashMap<>();
        tree.put("value", 1);

        // Creating left subtree
        Map<String, Object> leftSubtree = new HashMap<>();
        leftSubtree.put("value", 2);

        Map<String, Object> leftSubtreeLeft = new HashMap<>();
        leftSubtreeLeft.put("value", 4);
        Map<String, Object> leftSubtreeLeftLeft = new HashMap<>();
        leftSubtreeLeftLeft.put("value", 7);
        leftSubtreeLeftLeft.put("left", null);
        leftSubtreeLeftLeft.put("right", null);
        leftSubtreeLeft.put("left", leftSubtreeLeftLeft);
        leftSubtreeLeft.put("right", null);
        
        leftSubtree.put("left", leftSubtreeLeft);

        Map<String, Object> leftSubtreeRight = new HashMap<>();
        leftSubtreeRight.put("value", 5);
        leftSubtreeRight.put("left", null);
        leftSubtreeRight.put("right", null);
        
        leftSubtree.put("right", leftSubtreeRight);

        // Creating right subtree
        Map<String, Object> rightSubtree = new HashMap<>();
        rightSubtree.put("value", 3);
        rightSubtree.put("left", null);

        Map<String, Object> rightSubtreeRight = new HashMap<>();
        rightSubtreeRight.put("value", 6);
        rightSubtreeRight.put("left", null);
        rightSubtreeRight.put("right", null);
        
        rightSubtree.put("right", rightSubtreeRight);

        // Adding subtrees to root
        tree.put("left", leftSubtree);
        tree.put("right", rightSubtree);

        // Finding and printing the height of the tree
        int height = findHeight(tree);
        System.out.println("Height of the tree is: " + height); // Output should be 3
    }
}
