package cn.bdqn.controller;

import cn.bdqn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.logging.Logger;


@Controller
@RequestMapping(value = "/hello")
public class SpringController {
    private static Logger logger = Logger.getLogger(String.valueOf(SpringController.class));

    @RequestMapping(value = "/word")
    public String helloWord() {

        return "index";
    }

    @RequestMapping(value = "/test01", method = RequestMethod.POST)
    public ModelAndView test01(User user) {
        ModelAndView view = new ModelAndView();
        view.setViewName("success");
        view.addObject(user);
        view.addObject("test");
        return view;
    }

    @RequestMapping(value = "/test02", method = RequestMethod.POST)
    public String test02(User user, Model model) {
        model.addAttribute(user);
        return "success";
    }

    @RequestMapping(value = "/test03", method = RequestMethod.POST)
    public String test03(String name, Map<String, Object> map) {
        map.put("name", name);
        return "success";
    }

}
