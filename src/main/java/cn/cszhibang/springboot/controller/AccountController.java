package cn.cszhibang.springboot.controller;

import cn.cszhibang.springboot.pojo.Account;
import cn.cszhibang.springboot.service.AccountService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AccountController {

//    private static final logger = getlogger(Hello);

    @Resource
    private AccountService accountService;

    @RequestMapping("/show")
    public String show(){
        System.out.println("string");
        return "string";
    }

    @GetMapping ("/index")
    public List<Account> hello(){
        List<Account> list = accountService.list();
        for (Account account : list) {
            System.out.println(account);
        }
        return list;
    }

    @RequestMapping("/del/{id}")
    public boolean del(@PathVariable("id")Integer id){
        boolean b = accountService.removeById(id);
        return b;
    }

    @RequestMapping("/add")
    public boolean addingData(Account account){
        boolean save = accountService.save(account);
        return save;
    }

    @RequestMapping("/upd")
    public boolean upd(Account account){
        boolean b = accountService.updateById(account);
        return b;
    }

}
