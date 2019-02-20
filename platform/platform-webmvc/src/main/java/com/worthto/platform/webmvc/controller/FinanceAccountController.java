package com.worthto.platform.webmvc.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.worthto.platform.facade.fina.biz.FinanceAccountService;
import com.worthto.platform.facade.fina.domain.FinanceAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gezz on 2019/2/20.
 */
@Controller
@RequestMapping("/finance")
public class FinanceAccountController {

    @Autowired
    private FinanceAccountService financeAccountService;

    @RequestMapping(value = "/getFinanceAccount", method = RequestMethod.GET)
    @ResponseBody
    public String getFinanceAccount() {
        FinanceAccount financeAccount = financeAccountService.getFinaAccount("123456");
        return financeAccount.getName();
    }
}
