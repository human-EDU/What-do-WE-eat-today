package com.inadang.controller;

import java.security.Principal;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inadang.service.CartService;
import com.inadang.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@AllArgsConstructor
@Log4j
@RequestMapping("cart/*")
public class CartController {
	private final CartService cartService;
	
	@PostMapping("1")
	public void addCart(@AuthenticationPrincipal Principal principal){ // 장바구니 담기
		// 추가하려는 메뉴의 번호
		
		// 만약 이미 카트에 있다면 수량추가
		if(cartService.checkCart(40L, "woong2") != 0){ // 0인지
			
		}
		// 없다면 카트에 추가
//		cartService.addCarts(mno, count, principal.getName());
	}
	
	@PostMapping("2")
	public void getCart(@AuthenticationPrincipal Principal principal){ // 장바구니 조회
		
	}
	
	@PostMapping("3")
	public void modifyCart(@AuthenticationPrincipal Principal principal){ // 장바구니 수정
		
	}
	
	@PostMapping("4")
	public void removeCart(@AuthenticationPrincipal Principal principal){ // 장바구니 삭제
//		cartService.dropCart(principal.getName());
	}
	
}
