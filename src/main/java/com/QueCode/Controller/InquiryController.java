package com.QueCode.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QueCode.RequestComponents.InquiryRequest;
import com.QueCode.Service.InquiryService;

@RestController
@RequestMapping("/inquiry")
public class InquiryController {
	@Autowired
	private InquiryService inquiryService;
	
	@PostMapping("/save/inquiry")
	public InquiryRequest saveInquiry(@RequestBody InquiryRequest inquiryRequest)  {
		
		return inquiryService.saveInquirys(inquiryRequest);
		
	}
}
