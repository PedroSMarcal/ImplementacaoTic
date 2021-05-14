package br.com.unifacef.Imprementacao2BimestreTIC.Controllers;

import br.com.unifacef.Imprementacao2BimestreTIC.Models.Admin;
import br.com.unifacef.Imprementacao2BimestreTIC.Repository.AdminInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminControllers {
    @Autowired
    AdminInterface injecao;

    @GetMapping("/Admin")
    public List<Admin> get(){
        return injecao.findAll();
    }

    @DeleteMapping("/Admin/{id}")
    public String delete(@PathVariable Long id){
        injecao.deleteById(id);
        return "Deletado com sucesso";
    }

    @PostMapping("/Admin")
    public String add(@RequestBody Admin admin){
        injecao.save(admin);
        return "Sucesso";
    }

    @PutMapping("/Admin")
    public String alter(@RequestBody Admin admin){
        injecao.save(admin);
        return "Alterado com sucesso";
    }
}
