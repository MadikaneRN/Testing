package za.ac.cput.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.domain.Client;
import za.ac.cput.services.ClientService;

/**
 * Created by Scorpian on 2016-08-09.
 */
@RestController
public class ClientController {

    // Inject Service
    @Autowired
    private ClientService clientService;
    //-------------------Retrieve Single Story--------------------------------------------------------
    @RequestMapping(value = "/client/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Client> getStory(@PathVariable("id") long id) {
        Client client = clientService.readById(id);
        if (client == null) {
            return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Client>(client, HttpStatus.OK);
    }



}
