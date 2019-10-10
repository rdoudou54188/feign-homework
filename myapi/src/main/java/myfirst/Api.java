package myfirst;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/one")
public interface Api {
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    String getName(@RequestParam("name") String name);
}
