package br.com.unifacef.Imprementacao2BimestreTIC.Controllers;

import br.com.unifacef.Imprementacao2BimestreTIC.Models.Montador;
import br.com.unifacef.Imprementacao2BimestreTIC.Repository.MontadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MontadorControllers  {
    @Autowired
    MontadorRepository injecao;

    @GetMapping("/Montador")
    public List<Montador> get(){
        return injecao.findAll();
    }

    @PostMapping("/Montador")
    public String add(@RequestBody Montador montador){
        injecao.save(montador);
        return "Adicionado com sucesso";
    }

    @DeleteMapping("/Montador/{id}")
    public String delete(@PathVariable Long id){
        injecao.deleteById(id);
        return "Deletado com sucesso";
    }

    @PutMapping("/Montador/{id}")
    public String alter(@RequestBody Montador montador){
        Optional<Montador> validarId = injecao.findById(montador.getId());
        if (!validarId.isPresent()) {
            return "Não existe";
        }
        injecao.save(montador);
        return "Alterado Com Sucesso";
    }
}
