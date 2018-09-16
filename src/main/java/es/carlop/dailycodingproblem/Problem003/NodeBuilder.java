package es.carlop.dailycodingproblem.Problem003;

public class NodeBuilder {

    private Node node;

    public NodeBuilder() {
        this.node = new Node();
    }

    public Node build() {
        return node;
    }

    public NodeBuilder setVal(String val) {
        this.node.setVal(val);
        return this;
    }

    public NodeBuilder setLeft(Node left) {
        this.node.setLeft(left);
        return this;
    }

    public NodeBuilder setRight(Node right) {
        this.node.setRight(right);
        return this;
    }
}
