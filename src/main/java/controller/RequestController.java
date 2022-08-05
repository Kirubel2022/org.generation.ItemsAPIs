package controller;

import com.example.org.generation.ItemsAPI.repository.entity.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ItemsAPI")
public class RequestController {

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public Request createRequest() {
  }


    @RequestMapping(value= "/get", method = RequestMethod.GET)

    public Request getRequest() {

    }
}
