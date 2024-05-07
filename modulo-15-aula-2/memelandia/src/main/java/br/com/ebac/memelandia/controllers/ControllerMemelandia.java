package br.com.ebac.memelandia.controllers;

import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.services.ServicoNovoMeme;
import br.com.ebac.memelandia.services.ServicoNovoUsuario;
import br.com.ebac.memelandia.vo.MemeVO;
import br.com.ebac.memelandia.vo.NovoUsuarioVO;
import br.com.ebac.memelandia.vo.UsuarioVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.com.ebac.memelandia.services.ServicoMemelandia;

import java.util.List;

@RestController
@RequestMapping("/memelandia")
public class ControllerMemelandia {
    @Autowired
    private ServicoMemelandia servicoMemelandia;
    @Autowired
    private ServicoNovoUsuario servicoNovoUsuario;
    @Autowired
    private ServicoNovoMeme servicoNovoMeme;

    @GetMapping("/usuarios")
    public Iterable<UsuarioVO> buscaUsuarios() {
        return servicoNovoUsuario.encontrarTodos();
    }

    @PostMapping("/usuarios")
    public UsuarioVO novoUsuario(@RequestBody UsuarioVO usuario) {

        return servicoNovoUsuario.criarNovoUsuario(usuario);
    }

    @GetMapping("/categorias")
    public List<CategoriaMeme> buscaCategorias() {
        return servicoMemelandia.listaTodasCategorias();
    }

    @PostMapping("/categorias")
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return servicoMemelandia.novaCategoriaMeme(categoriaMeme);
    }

    @GetMapping("/memes")
    public Iterable<MemeVO> buscaMemes() {
        return servicoNovoMeme.encontrarTodos();
    }

    @PostMapping("/memes")
    public MemeVO novoMeme(@RequestBody MemeVO meme) {

        return servicoNovoMeme.criarNovoMeme(meme);

    }
}
