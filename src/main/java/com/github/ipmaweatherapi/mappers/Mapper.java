package com.github.ipmaweatherapi.mappers;

/**
 * Map data between an origin and a destination object.
 * @param <O> The origin class where the data is fetched from.
 * @param <D> THe destination object where the data is mapped to.
 */
public interface Mapper<O,D> {

    /**
     * Map data from the origin object to a destination object.
     * @param o The origin object where the data is fetched from.
     * @return a destination object with the refactored data written into it.
     */
    D mapTo(O o);
}
