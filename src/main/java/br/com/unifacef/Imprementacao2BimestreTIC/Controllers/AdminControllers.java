package br.com.unifacef.Implementacao.Controllers;

import br.com.unifacef.Implementacao.Repository.AdminDTO;
import br.com.unifacef.Implementacao.models.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost/127.0.0.1:5500/Admin")
public class AdminControllers {
    @Autowired
    AdminDTO AdminRepository;

    @GetMapping("/")
    public List<Admin> get(){
        return AdminRepository.findAll();
    }

    @PostMapping("/")
    public String put(@RequestBody Admin admin){
        Optional<Admin> IdValuate = AdminRepository.findById(admin.getId());
        if (!IdValuate.isPresent()){
            return "Don't exist the " + admin.toString();
        }
        AdminRepository.save(admin);
        return "Admin alter successful" + admin.toString();
    }

    @DeleteMapping("/{id}")
    public String del(@PathVariable Long id){
        AdminRepository.deleteById(id);
        return "Deleted with successful";
    }

    @PutMapping("/")
    public String add(@RequestBody Admin admin){
        AdminRepository.save(admin);
        return "Cliente add with successful";
    }
}
