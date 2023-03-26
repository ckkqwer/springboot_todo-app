package com.ckkqwer.test.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController
{
    /*summary
    path: /say-hello
    return: sayHello()

     */

//    @RequestMapping("/")
//    public String root(){
//        return "redirect:login";
//    }

//    @RequestMapping("index")
//    @ResponseBody
//    public String index(){
//        return "this is a todoapp";
//    }

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello()
    {
        return "Hello!";
    }

    @RequestMapping("say-hello-in-html")
    @ResponseBody
    public String sayHello_html()
    {
        StringBuffer sb = new StringBuffer();
        String content = """
                <!DOCTYPE html>
                 <html lang="en">
                 <head>
                     <meta charset="UTF-8">
                     <meta http-equiv="X-UA-Compatible" content="IE=edge">
                     <meta name="viewport" content="width=device-width, initial-scale=1.0">
                     <title>todoapp</title>
                 </head>
                 <body>
                    <p>This is a todoapp</p>
                    
                 </body>
                 </html>                
                """;
        sb.append(content);

        return sb.toString();
    }

    @RequestMapping("say-hello-in-jsp")
    public String sayHello_jsp()
    {
        //jsp should in following dir:
        //src/main/resources/META-INF/resources/WEB-INF/jsp/
        return "sayHello";
    }
}
