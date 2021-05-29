package br.com.unifacef.Implementacao.Controllers;

import br.com.unifacef.Implementacao.Repository.ChoresDTO;
import br.com.unifacef.Implementacao.models.Assembler;
import br.com.unifacef.Implementacao.models.Chores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost/127.0.0.1:5500/Admin")
public class ChoresControllers {
    @Autowired
    ChoresDTO ChoresRepository;

    @GetMapping("/")
    public List<Chores> get(){
        return ChoresRepository.findAll();
    }

    @PutMapping("/")
    public Chores add(@RequestBody Chores chores){
        ChoresRepository.save(chores);
        return chores;
    }

    @DeleteMapping("/{id}")
    public String del(@PathVariable Long id){
        if (!ChoresRepository.existsById(id)) {
            return "Cannot Delete";
        }
        ChoresRepository.deleteById(id);
        return "Deleted";
    }

    @PostMapping("/")
    public Chores alter(@RequestBody Chores chores){
        Optional<Chores> IdValuate = ChoresRepository.findById(chores.getId());
        if (!IdValuate.isPresent()){
            return chores;
        }
        ChoresRepository.save(chores);
        return chores;
    }
}

