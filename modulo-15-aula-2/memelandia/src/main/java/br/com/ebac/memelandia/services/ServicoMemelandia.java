package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.entities.CategoriaMeme;
import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.repositories.RepositorioCategoriaMeme;
import br.com.ebac.memelandia.repositories.RepositorioMeme;
import br.com.ebac.memelandia.repositories.RepositorioUsuario;
import br.com.ebac.memelandia.utils.MemeUtils;
import br.com.ebac.memelandia.utils.UsuarioUtils;
import br.com.ebac.memelandia.vo.MemeVO;
import br.com.ebac.memelandia.vo.UsuarioVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ServicoMemelandia {
    @Autowired
    private RepositorioMeme repositorioMeme;

    @Autowired
    private RepositorioCategoriaMeme repositorioCategoriaMeme;

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public UsuarioVO novoUsuario(UsuarioVO usuarioVO) {

        Usuario novoUsuario = UsuarioUtils.fromUsuarioVO(usuarioVO);
        novoUsuario = repositorioUsuario.save(novoUsuario);

        return UsuarioUtils.toUsuarioVO(novoUsuario);
    }

    public Iterable<UsuarioVO> listaTodosUsuarios() {
      final Iterable<Usuario> usuarioIterable = repositorioUsuario.findAll();

      return UsuarioUtils.toUsuarioVO(usuarioIterable);
    }

    public MemeVO novoMeme(MemeVO memeVO) {
        Meme novoMeme = MemeUtils.fromMemeVO(memeVO);
        novoMeme = repositorioMeme.save(novoMeme);

        return MemeUtils.toMemeVO(novoMeme);
    }


    public Iterable<MemeVO> listaTodosMemes() {
        final Iterable<Meme> memeIterable = repositorioMeme.findAll();

        return MemeUtils.toMemeVO(memeIterable);
    }

    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme) {
        return repositorioCategoriaMeme.save(categoriaMeme);
    }

    public List<CategoriaMeme> listaTodasCategorias() {
        return repositorioCategoriaMeme.findAll();
    }
}
