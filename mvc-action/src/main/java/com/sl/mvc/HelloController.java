package com.sl.mvc;

import com.sl.dao.PayMntContactMapper;
import com.sl.dao.payMntTypeMapper;
import com.sl.domain.PayMntContact;
import com.sl.domain.PayMntType;
import com.sl.service.biz.RateService;
import com.sl.service.remote.DubboTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private payMntTypeMapper payMntTypeMapper;

    @Autowired
    private PayMntContactMapper payMntContactMapper;

    @Resource
    private RateService rateService;

    @Resource
    private DubboTestService dubboTestService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
//        List<PayMntType> payMntType = payMntTypeMapper.find(Arrays.asList("1", "2"));
        PayMntContact payMntType = payMntContactMapper.selectByPrimaryKey("majl");
        model.addAttribute("message", rateService.calRate());
//        model.addAttribute("message", dubboTestService.queryDog(""));
        model.addAttribute("message", payMntType);
		return "hello";
	}

    public payMntTypeMapper getPayMntTypeMapper() {
        return payMntTypeMapper;
    }

    public void setPayMntTypeMapper(payMntTypeMapper payMntTypeMapper) {
        this.payMntTypeMapper = payMntTypeMapper;
    }
}