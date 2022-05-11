package com.inadang.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.inadang.domain.Payment;
import com.inadang.service.OrderMenuService;
import com.inadang.service.OrderService;
import com.inadang.service.PaymentService;
import com.siot.IamportRestClient.IamportClient;
import com.siot.IamportRestClient.exception.IamportResponseException;
import com.siot.IamportRestClient.response.IamportResponse;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@AllArgsConstructor
@RequestMapping("order/*")
@Log4j
public class OrderController {
	private final PaymentService paymentService; 
	private final OrderService orderService;
	private final OrderMenuService orderMenuService;
	
	//Model객체 >> JSP에 컨트롤러에서 생성된 데이터를 담아서 전달하는 역할 (JSP같은 뷰로 전달해야하는 데이터를 담아서 보냄)
	//void -> 호출하는 URL과 동일한 이름의 jsp
	// String -> jsp 파일의 경로와 파일이름 나타내기위해 사용
	
	@GetMapping ("payment")
	public void order(String ono, Model model){
		model.addAttribute("orderMenu", orderMenuService.findBy(ono));
		model.addAttribute("order", orderService.get(ono));
//		log.info(ono);
	}
	
	@PostMapping("payment")  
	public String payments(Payment payments){
		paymentService.insert(payments);
		log.info("payment" + payments);
		
		return "redirect:/order/history?pno=" + payments.getPno();
	}
		

	@GetMapping("history")	public void history(Payment payments, Model model){
		model.addAttribute("history", paymentService.findSpecific(payments.getOno(), payments.getId()));

	}
	
	
	/*아이엠포트자리*/

	//IAMPORT API
	@ResponseBody
	@RequestMapping(value="payments/{imp_uid}")
	public IamportResponse<com.siot.IamportRestClient.response.Payment> paymentByImpUid(
			Payment payments,
			 Model model
			, @PathVariable(value= "imp_uid") String imp_uid) throws IamportResponseException, IOException
	{	
													// REST API,와 REST API secret.
		IamportClient api = new IamportClient("3036721238050964","ab08095efeceb5826011a8f75016182bc8065fa2093e2435ccebfd05083238ae3f34017a42ff1fa0");
		api.paymentByImpUid(imp_uid);
		log.info("imp_uid" + imp_uid);
//		log.info("iam payments" + payments);
//		paymentService.insert(payments);
		return api.paymentByImpUid(imp_uid);
	}	
}
