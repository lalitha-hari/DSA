class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int item) {
        val = item;
        left = right = null;
    }
}

class BinaryTree {
    TreeNode root;
    int diameter=0;

    // Method to calculate the diameter of the tree
    int diameter(TreeNode root) {
        diameter=0;
        height(root);
        return diameter;
    }

    // Helper method to calculate height of tree and update the diameter
    int height(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively find the height of the left and right subtrees
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Calculate the diameter as the sum of left and right subtree heights
        diameter= Math.max(diameter, leftHeight + rightHeight);

        // Return the height of the tree
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        // Construct the binary tree
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("The diameter of the binary tree is: " + tree.diameter(tree.root));
    }
}
