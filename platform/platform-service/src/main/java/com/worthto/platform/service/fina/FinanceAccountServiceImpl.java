package com.worthto.platform.service.fina;

import com.worthto.platform.facade.fina.biz.FinanceAccountService;
import com.worthto.platform.facade.fina.domain.FinanceAccount;

import java.util.Date;

/**
 * Created by gezz on 2019/2/20.
 */
public class FinanceAccountServiceImpl implements FinanceAccountService {

    @Override
    public FinanceAccount getFinaAccount(String id) {
        System.out.println("调用platform-service服务的FinanceAccountServiceImpl接口的getFinaAccount方法，id:" + id);
        FinanceAccount financeAccount = new FinanceAccount();
        financeAccount.setName("gezz");
        financeAccount.setId(id);
        financeAccount.setBirthday(new Date());
        financeAccount.setCreateTime(new Date());
        return financeAccount;
    }
}
