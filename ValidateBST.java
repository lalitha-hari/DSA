class TreeNode {
    int value;
    TreeNode left, right;

    public TreeNode(int value) {
        this.value = value;
        left = right = null;
    }
}

public class ValidateBST {

    // Helper function to validate BST with range constraints
    public static boolean isValidBST(TreeNode node, Integer min, Integer max) {
        // An empty node is a valid BST
        if (node == null) {
            return true;
        }

        // Check if the current node's value violates the min/max constraints
        if ((min != null && node.value <= min) || (max != null && node.value >= max)) {
            return false;
        }

        // Recursively check the left subtree with an updated max constraint
        // Recursively check the right subtree with an updated min constraint
        return isValidBST(node.left, min, node.value) && isValidBST(node.right, node.value, max);
    }

    // Public method to start the validation from the root
    public static boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
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

        // Validate if the tree is a valid BST
        boolean isValid = isValidBST(root);
        System.out.println("The tree is a valid BST: " + isValid); // Output should be true

        // Example of an invalid BST
        root.right.left.left = new TreeNode(10); // This creates an invalid BST
        isValid = isValidBST(root);
        System.out.println("The tree is a valid BST: " + isValid); // Output should be false
    }
}
