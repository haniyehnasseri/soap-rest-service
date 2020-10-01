package example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class resthello {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser() {
        return "hello from rest";
    }

}
