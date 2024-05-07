package br.com.ebac.memelandia.services;

import br.com.ebac.memelandia.feign.ClienteFeignNovoMeme;
import br.com.ebac.memelandia.utils.MemeUtils;
import br.com.ebac.memelandia.utils.UsuarioUtils;
import br.com.ebac.memelandia.vo.MemeVO;
import br.com.ebac.memelandia.vo.NovoMemeVO;
import br.com.ebac.memelandia.vo.NovoUsuarioVO;
import br.com.ebac.memelandia.vo.UsuarioVO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServicoNovoMeme {
    private final ClienteFeignNovoMeme clienteFeignNovoMeme;

    public ServicoNovoMeme(ClienteFeignNovoMeme clienteFeignNovoMeme) {
        this.clienteFeignNovoMeme = clienteFeignNovoMeme;
    }

    public MemeVO criarNovoMeme(MemeVO memeVO){
        NovoMemeVO novoMemeVO = MemeUtils.toNovoMemeVO(memeVO);
        novoMemeVO = clienteFeignNovoMeme.criarNovoMeme(novoMemeVO);
        return MemeUtils.fromNovoMeme(novoMemeVO);
    }

    public Iterable<MemeVO> encontrarTodos(){
        List<NovoMemeVO> novosMemeVO = clienteFeignNovoMeme.encontrarTodos();
        List<MemeVO> memesVO = new ArrayList<>();

        for(NovoMemeVO novoMemeVO : novosMemeVO){
            memesVO.add(MemeUtils.fromNovoMeme(novoMemeVO));
        }

        return memesVO;
    }
}
