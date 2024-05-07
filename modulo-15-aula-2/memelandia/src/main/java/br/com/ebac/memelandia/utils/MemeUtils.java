package br.com.ebac.memelandia.utils;

import br.com.ebac.memelandia.entities.Meme;
import br.com.ebac.memelandia.entities.Usuario;
import br.com.ebac.memelandia.vo.MemeVO;
import br.com.ebac.memelandia.vo.NovoMemeVO;
import br.com.ebac.memelandia.vo.NovoUsuarioVO;
import br.com.ebac.memelandia.vo.UsuarioVO;

import java.util.ArrayList;
import java.util.List;

public final class MemeUtils {
    private MemeUtils(){}

    public static Meme fromMemeVO(MemeVO memeVO){
        return new Meme(memeVO.getId(), memeVO.getNome(), memeVO.getDescricao(), memeVO.getDataCadastro());
    }

    public static MemeVO toMemeVO(Meme meme){
        return new MemeVO(meme.getId(), meme.getNome(),meme.getDescricao(), meme.getDataCadastro());

    }

    public static Iterable<MemeVO> toMemeVO(Iterable<Meme> memes){
        List<MemeVO> memeVOList = new ArrayList<>();

        for(Meme meme: memes) {
            memeVOList.add(new MemeVO(meme.getId(), meme.getNome(),meme.getDescricao(), meme.getDataCadastro()));
        }

        return memeVOList;
    }

    public static MemeVO fromNovoMeme(NovoMemeVO novoMemeVO){
        MemeVO memeVO = new MemeVO(null, novoMemeVO.getNome(), novoMemeVO.getDescricao(), novoMemeVO.getDataCadastro());

        memeVO.setIdNovoMeme(novoMemeVO.getId());

        return memeVO;
    }

    public static NovoMemeVO toNovoMemeVO(MemeVO memeVO){
        return new NovoMemeVO(null, memeVO.getNome(), memeVO.getDescricao(), memeVO.getDataCadastro());
    }
}
