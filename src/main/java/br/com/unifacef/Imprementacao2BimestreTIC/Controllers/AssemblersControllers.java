package br.com.unifacef.Implementacao.Controllers;

import br.com.unifacef.Implementacao.Repository.AssemblerDTO;
import br.com.unifacef.Implementacao.models.Assembler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost/127.0.0.1:5500/Admin")
public class AssemblersControllers {
    @Autowired
    AssemblerDTO AssemblerRepository;

    @GetMapping("/")
    public List<Assembler> get(){
        return AssemblerRepository.findAll();
    }

    @PostMapping("/")
    public String put(@RequestBody Assembler assembler){
        Optional<Assembler> IdValuate = AssemblerRepository.findById(assembler.getId());
        if (!IdValuate.isPresent()){
            return "Don't exist the " + assembler.toString();
        }
        AssemblerRepository.save(assembler);
        return "Admin alter successful" + assembler.toString();
    }

    @DeleteMapping("/{id}")
    public String del(@PathVariable Long id){
        AssemblerRepository.deleteById(id);
        return "Deleted with successful";
    }
}
