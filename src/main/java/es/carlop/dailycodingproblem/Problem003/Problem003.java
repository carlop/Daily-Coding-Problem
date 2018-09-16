package es.carlop.dailycodingproblem.Problem003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * To deserialize a binary tree we need to "serialize" both Inorder and Preorder traversals
 * but we can save space storing Preorder traversal and mark null leafs.
 *
 * @author Carlos López [yo@carlop.es]
 */

public class Problem003 {

    // Keep for testing
    public static String preOrder(Node node) {
        String t = "";
        if (node != null) {
            t = " " + node.getVal();
            t += preOrder(node.getLeft());
            t += preOrder(node.getRight());
        }
        return t;
    }

    public static String serialize(Node node) {
        StringBuilder serializedNode = new StringBuilder();
        serializeNodes(node, serializedNode);
        return serializedNode.toString();
    }

    public static void serializeNodes(Node node, StringBuilder stringBuilder) {
        if (node == null) {
            stringBuilder.append("#").append(" ");
        } else {
            stringBuilder.append(node.getVal()).append(" ");
            serializeNodes(node.getLeft(), stringBuilder);
            serializeNodes(node.getRight(), stringBuilder);
        }
    }

    public static Node deserialize(String serializedNode) {
        List<String> nodes = new ArrayList<String>();
        nodes.addAll(Arrays.asList(serializedNode.split(" ")));
        return deserializeArray(nodes);
    }

    public static Node deserializeArray(List<String> nodes) {
        String temp = nodes.remove(0);

        if (temp.equals("#")) {
            return null;
        }
        Node node = new NodeBuilder()
                .setVal(temp)
                .build();
        node.setLeft(deserializeArray(nodes));
        node.setRight(deserializeArray(nodes));

        return node;
    }
}