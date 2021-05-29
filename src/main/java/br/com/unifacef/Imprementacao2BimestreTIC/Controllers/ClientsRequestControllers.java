package br.com.unifacef.Implementacao.Controllers;

import br.com.unifacef.Implementacao.Repository.ClientsRequestDTO;
import br.com.unifacef.Implementacao.models.Admin;
import br.com.unifacef.Implementacao.models.ClientsRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost/127.0.0.1:5500/ClientsRequests")
public class ClientsRequestControllers {
    @Autowired
    ClientsRequestDTO Request;

    @GetMapping("/")
    public List<ClientsRequest> get(){
        return Request.findAll();
    }

    @DeleteMapping("/{id}")
    public String del(@PathVariable Long id){
        Request.deleteById(id);
        return "Successful Delete";
    }

    @PostMapping("/")
    public ClientsRequest alter(@RequestBody ClientsRequest clientsRequest){
        Optional<ClientsRequest> IdValuate = (Request.findById(clientsRequest.getCode()));
        if (!IdValuate.isPresent()){
            return null;
        }
        Request.save(clientsRequest);
        return clientsRequest;
    }

    @PutMapping("/")
    public ClientsRequest add(@RequestBody ClientsRequest clientsRequest){
        Request.save(clientsRequest);
        return clientsRequest;
    }
}
