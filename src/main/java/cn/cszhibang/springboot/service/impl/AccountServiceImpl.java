package cn.cszhibang.springboot.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.cszhibang.springboot.pojo.Account;
import cn.cszhibang.springboot.service.AccountService;
import cn.cszhibang.springboot.mapper.AccountMapper;
import org.springframework.stereotype.Service;

/**
* @author LIXU
* @description 针对表【t_account】的数据库操作Service实现
* @createDate 2023-11-22 18:55:05
*/
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account>
    implements AccountService{

}




