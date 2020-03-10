package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @author 喻浩
 * @create 2019-08-26-0:16
 */
public interface AccountService {
    /**
     * 查询所有账户
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    public void saveAccount(Account account);
}
