package br.com.ebac.memelandia.utils;

import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.vo.NovoUsuarioVO;
import br.com.ebac.memelandia.vo.UsuarioVO;

import java.util.ArrayList;
import java.util.List;

public final class UsuarioUtils {
    private UsuarioUtils(){}

    public static Usuario fromUsuarioVO(UsuarioVO usuarioVO){
        return new Usuario(usuarioVO.getId(), usuarioVO.getNome(), usuarioVO.getEmail(), usuarioVO.getDataCadastro());
    }

    public static UsuarioVO toUsuarioVO(Usuario usuario){
        return new UsuarioVO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getDataCadastro());

    }

    public static Iterable<UsuarioVO> toUsuarioVO(Iterable<Usuario> usuarios){
        List<UsuarioVO> usuarioVOList = new ArrayList<>();

        for(Usuario usuario: usuarios) {
            usuarioVOList.add(new UsuarioVO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getDataCadastro()));
        }

        return usuarioVOList;
    }

    public static UsuarioVO fromNovoUsuario(NovoUsuarioVO novoUsuarioVO){
        UsuarioVO usuarioVO = new UsuarioVO(null, novoUsuarioVO.getNome(), novoUsuarioVO.getEmail(), novoUsuarioVO.getDataCadastro());

        usuarioVO.setIdNovoUsuario(novoUsuarioVO.getId());

        return usuarioVO;
    }

    public static NovoUsuarioVO toNovoUsuarioVO(UsuarioVO usuarioVO){
        return new NovoUsuarioVO(null, usuarioVO.getNome(), usuarioVO.getEmail(), usuarioVO.getDataCadastro());
    }
}
