package com.ckkqwer.index;

import org.eclipse.jdt.internal.compiler.env.IModulePathEntry;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class IndexController
{
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String toWelcomePageByRoot(ModelMap model)
    {
        model.put("name", getLoggedinUsername());
        return "welcome";
    }

    private String getLoggedinUsername()
    {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    @RequestMapping("index")
    @ResponseBody
    public String index()
    {
        return "this is a todoapp";
    }
}

//region Logger
//private Logger logger = LoggerFactory.getLogger(getClass());

//    @RequestMapping("/login")
//    public String loginView(@RequestParam String name, ModelMap model){
//        model.put("name", name);
//        logger.debug("Request Param is {}", name);
//        System.out.println(name);
//        return "login";
//    }
//endregion

//    private AuthenticationService authenticationService = new AuthenticationService();
//
//    public LoginController(AuthenticationService authenticationService)
//    {
//        this.authenticationService = authenticationService;
//    }

//    @RequestMapping(value = "login", method = RequestMethod.GET)
//    public String toLoginPage(){
//
//        return "login";
//    }

//    @RequestMapping(value = "login", method = RequestMethod.POST)
//    public String toWelcomePage(@RequestParam String name,
//                              @RequestParam String password,
//                              ModelMap model){
//        model.put("name", name);
//        model.put("password", password);
//
//        //Authentication
//        if(!authenticationService.authenticate(name, password)){
//            model.put("errorMessage", "Invalid Credentials! Please try again.");
//            return "login";
//        }
//        return "welcome";
//    }
