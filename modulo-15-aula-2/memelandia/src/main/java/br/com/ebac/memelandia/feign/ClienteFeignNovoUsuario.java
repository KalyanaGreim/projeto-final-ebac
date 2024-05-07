package br.com.ebac.memelandia.feign;

import br.com.ebac.memelandia.vo.NovoUsuarioVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "cliente-novo-usuario", url = "http://localhost:8080")
public interface ClienteFeignNovoUsuario {
    @RequestMapping(method = RequestMethod.POST, path = "/usuarios")
    NovoUsuarioVO criarNovoUsuario(@RequestBody NovoUsuarioVO novoUsuarioVO);
    @RequestMapping(method = RequestMethod.GET, path = "/usuarios")
    List<NovoUsuarioVO> encontrarTodos();
}
