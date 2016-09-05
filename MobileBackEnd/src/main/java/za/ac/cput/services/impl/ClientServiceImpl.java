package za.ac.cput.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Client;
import za.ac.cput.repository.ClientRepository;
import za.ac.cput.services.ClientService;

import java.util.HashSet;
import java.util.Set;


/**
 * Created by Scorpian on 2016-08-08.
 */

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository repository;

    @Override
    public Client create(Client entity)
    {
        return repository.save(entity);
    }

    @Override
    public Set<Client> readAll()
    {
        Set<Client> result = new HashSet<Client>();
        while(repository.findAll().iterator().hasNext())
        {
            result.add(repository.findAll().iterator().next());
        }
        return result;
    }

    @Override
    public Client update(Client entity)
    {
        return repository.save(entity);
    }

    @Override
    public Client readById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public void delete(Client entity) {
        repository.delete(entity);

    }

}
