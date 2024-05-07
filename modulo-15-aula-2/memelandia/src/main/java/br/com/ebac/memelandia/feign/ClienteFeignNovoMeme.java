package br.com.ebac.memelandia.feign;

import br.com.ebac.memelandia.vo.NovoMemeVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "cliente-novo-usuario", url = "http://localhost:8082")
public interface ClienteFeignNovoMeme {
    @RequestMapping(method = RequestMethod.POST, path = "/memes")
    NovoMemeVO criarNovoMeme(@RequestBody NovoMemeVO novoMemeVO);

    @RequestMapping(method = RequestMethod.GET, path = "/usuarios")
    List<NovoMemeVO> encontrarTodos();
}
