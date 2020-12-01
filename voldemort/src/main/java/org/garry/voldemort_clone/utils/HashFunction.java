package org.garry.voldemort_clone.utils;

/**
 * A hash function for bytes, deterministically maps bytes into ints
 */
public interface HashFunction {

    int hash(byte[] key);
}

