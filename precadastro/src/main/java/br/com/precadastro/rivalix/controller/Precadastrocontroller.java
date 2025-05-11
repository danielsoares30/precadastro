package br.com.precadastro.rivalix.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;  // Importando a classe List
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.precadastro.rivalix.DAO.IPrecadastro;
import br.com.precadastro.rivalix.model.Precadastro;  // Certifique-se de importar a classe Precadastro corretamente // Importando o repositório

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/usuarios")
public class Precadastrocontroller {

    @Autowired
    private IPrecadastro dao;  // Injetando o repositório

    @GetMapping
    public List<Precadastro> listaPrecadastro() {
        return (List<Precadastro>) dao.findAll();
        }
    @PostMapping
public Precadastro criarUsuario(@RequestBody Precadastro usuario) {
    Precadastro usuarioNovo = dao.save(usuario);
    return usuarioNovo;
}

    @PutMapping
    public Precadastro editarUsuario(@RequestBody Precadastro usuario) {
    Precadastro usuarioNovo = dao.save(usuario);
    return usuarioNovo;
}

    @DeleteMapping("/{id}")
    public Optional<Precadastro> deletarUsuario(@PathVariable Integer id) {
    Optional<Precadastro> usuario = dao.findById(id);
    dao.deleteById(id);
    return usuario;
}
}
