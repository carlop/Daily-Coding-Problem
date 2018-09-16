package es.carlop.dailycodingproblem;

import es.carlop.dailycodingproblem.Problem003.Node;
import es.carlop.dailycodingproblem.Problem003.NodeBuilder;
import es.carlop.dailycodingproblem.Problem003.Problem003;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Problem 003")
public class DailyCodingProblem003Test {
    // node = Node('root', Node('left', Node('left.left')), Node('right'))
    private Node node = new NodeBuilder()
            .setVal("root")
            .setLeft(new NodeBuilder()
                    .setVal("left")
                    .setLeft(new NodeBuilder()
                            .setVal("left.left")
                            .build()
                    )
                    .build()
            )
            .setRight(new NodeBuilder()
                    .setVal("right")
                    .build())
            .build();

    @Test
    @DisplayName("Test serialize")
    public void testSerialize() {
        // Given examples
        assertEquals("root left left.left # # # right # # ", Problem003.serialize(node));
    }

    @Test
    @DisplayName("Test deserialize")
    public void testDeserialize() {
        // Given examples
        assertEquals(" root left left.left right", Problem003.preOrder(Problem003.deserialize(Problem003.serialize(node))));
    }

    @Test
    @DisplayName("Test deserialize(serialize)")
    public void testDeserializeSerialize() {
        assertEquals("left.left", Problem003.deserialize(Problem003.serialize(node)).getLeft().getLeft().getVal());
    }
}