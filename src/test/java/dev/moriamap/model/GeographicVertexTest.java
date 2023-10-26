package dev.moriamap.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

class GeographicVertexTest {

    @Test void geoPosOfGeoVertexAtNorthPoleIsNorthPole() {
        GeographicVertex sut = GeographicVertex.at(
          GeographicPosition.NORTH_POLE
        );
        assertEquals(
          GeographicPosition.NORTH_POLE,
          sut.getGeographicPosition()
        );
    }

    @Test void nullGeoPosOnGeoVertexCreationThrowsException() {
        assertThrows(
          IllegalArgumentException.class,
          () -> GeographicVertex.at(null)
        );
    }

    @Test void equalsOnItselfReturnsTrue() {
        GeographicVertex v = GeographicVertex.at(58.134, 22.4);
        assertEquals(v,v);
    }

    @Test void semanticallyEqualInstancesAreEqual() {
        GeographicVertex u = GeographicVertex.at(58.134, 22.4);
        GeographicVertex v = GeographicVertex.at(58.134, 22.4);
        assertEquals(u,v);
    }

    @Test void semanticallyUnequalInstancesAreNotEqual() {
        GeographicVertex u = GeographicVertex.at(58.134, 22.4);
        GeographicVertex v = GeographicVertex.at(58.134, 12.4);
        assertNotEquals(u,v);
    }

    @Test void GeographicVertexIsNotEqualToNull() {
        GeographicVertex v = GeographicVertex.at(58.134, 12.4);
        assertNotEquals(null,v);
    }

    @Test void instanceOfDifferentClassIsNotEqual() {
        GeographicVertex v = GeographicVertex.at(75.0,90.0);
        Object o = new Object();
        assertNotEquals(v,o);
    }

    @Test void hashCodeOfEqualObjectsIsEqual() {
        GeographicVertex u = GeographicVertex.at(88.134, 25.4);
        GeographicVertex v = GeographicVertex.at(88.134, 25.4);
        assertEquals(u.hashCode(), v.hashCode());
    }
}

