package za.ac.cput.services;

import java.util.Set;

/**
 * Created by Scorpian on 2016-08-06.
 */


public interface Services<E, ID> {

    E create(E entity);

    E readById(ID id);

    Set<E> readAll();

    E update(E entity);

    void delete(E entity);

}
