package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.feign.ClienteFeignNovoUsuario;
import br.com.ebac.memelandia.utils.UsuarioUtils;
import br.com.ebac.memelandia.vo.NovoUsuarioVO;
import br.com.ebac.memelandia.vo.UsuarioVO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServicoNovoUsuario {
    private final ClienteFeignNovoUsuario clienteFeignNovoUsuario;

    public ServicoNovoUsuario(ClienteFeignNovoUsuario clienteFeignNovoUsuario) {
        this.clienteFeignNovoUsuario = clienteFeignNovoUsuario;
    }

    public UsuarioVO criarNovoUsuario(UsuarioVO usuarioVO){
        NovoUsuarioVO novoUsuarioVO = UsuarioUtils.toNovoUsuarioVO(usuarioVO);
        novoUsuarioVO = clienteFeignNovoUsuario.criarNovoUsuario(novoUsuarioVO);
        return UsuarioUtils.fromNovoUsuario(novoUsuarioVO);
    }

    public Iterable<UsuarioVO> encontrarTodos(){
        List<NovoUsuarioVO> novoUsuariosVO = clienteFeignNovoUsuario.encontrarTodos();
        List<UsuarioVO> usuariosVO = new ArrayList<>();

        for(NovoUsuarioVO novoUsuarioVO : novoUsuariosVO){
            usuariosVO.add(UsuarioUtils.fromNovoUsuario(novoUsuarioVO));
        }

        return usuariosVO;
    }
}
