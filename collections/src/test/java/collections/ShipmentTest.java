package collections;

import collections.list.Shipment;
import org.junit.Test;

import static collections.ProductFixtures.door;
import static collections.ProductFixtures.window;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;


public class ShipmentTest {
    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() throws Exception {
        shipment.add(door);
        shipment.add(window);

        assertThat(shipment, contains());
    }

    public void shouldReplaceItems() throws Exception {

    }
}
