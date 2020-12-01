package org.garry.voldemort_clone.routing;

import org.garry.voldemort_clone.cluster.Node;

import java.util.List;
import java.util.Set;

/**
 * A routing strategy maps puts and gets to an ordered "preference list" of
 * servers. The preference list is the order under which operations will be
 * completed in the absence of failures.
 *
 * 没有故障下的"有序"
 */
public interface RoutingStrategy {

    /**
     * Get the node preference list for the given key. The preference list is
     * a list of nodes to perform an operation on
     * @param key
     * @return
     */
    List<Node> routeRequest(byte[] key);

    /**
     * Get the collection of nodes that are candidates for routing
     * @return the collection of nodes
     */
    Set<Node> getNodes();
}
