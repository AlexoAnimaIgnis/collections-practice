package collections;

import collections.list.Shipment;
import org.junit.Test;

import static collections.ProductFixtures.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ShipmentTest {
    private Shipment shipment = new Shipment();

    @Test
    public void shouldAddItems() throws Exception {
        shipment.add(door);
        shipment.add(window);

        assertThat(shipment, contains(door, window));
    }

    @Test
    public void shouldReplaceItems() throws Exception {
        shipment.add(door);
        shipment.add(window);

        assertTrue(shipment.replace(door, floor));

        assertThat(shipment, contains(floor, window));
    }

    @Test
    public void shouldNotReplaceItems() {
        shipment.add(window);

        assertFalse(shipment.replace(door, floor));

        assertThat(shipment, contains(window));

    }

    @Test
    public void shouldIdentifyVanRequirements() {
        shipment.add(door);
        shipment.add(window);
        shipment.add(floor);

        shipment.prepare();

        assertThat(shipment.getLightVanProducts(), contains(window));
        assertThat(shipment.getHeavyVanProducts(), contains(floor, door));
    }
}
