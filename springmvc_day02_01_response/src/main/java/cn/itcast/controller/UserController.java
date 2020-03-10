package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 喻浩
 * @create 2019-08-22-23:20
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 返回值是字符串
     * @param model
     * @return
     */
    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString方法执行了。。。");
        //模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("妹妹");
        user.setPassword("123");
        user.setAge(30);
        //model对象
        model.addAttribute("user",user);
        
        return "success";
    }

    /**
     * 返回值是void
     * 请求转发一次请求，不用编写项目的名称
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testVoid方法执行了。。。");
        //编写请求转发的程序
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
        
//        重定向
//        response.sendRedirect(request.getContextPath()+"/index.jsp");
        
        //设置中文乱码
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        
        //直接会进行响应
        response.getWriter().print("你好 ");
        
        return;
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(Model model){
        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        System.out.println("testString方法执行了。。。");
        //模拟从数据库中查询出User对象
        User user = new User();
        user.setUsername("小风");
        user.setPassword("456");
        user.setAge(30);

        //把user对象存储到mv对象中，也会把user对象存入到request对象
        mv.addObject("user",user);
        
        //跳转到哪个页面
        mv.setViewName("success");
        
        return mv;
    }

    /**
     * 使用关键字的方式进行转发或者重定向
     * @param model
     * @return
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(Model model){
        System.out.println("testForwardOrRedirect方法执行了。。。");

        //请求的转发
//        return "forward:/WEB-INF/pages/success.jsp";
        //重定向
        return "redirect:/index.jsp";
    }
    
    /**
     * 模拟异步请求响应
     * @param user
     * @return
     */
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了。。。");
        //客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        //做响应，模拟查数据库
        user.setUsername("gaga");
        user.setAge(10);
        return user;
    }
}
