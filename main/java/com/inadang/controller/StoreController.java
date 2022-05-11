package com.inadang.controller;

import java.util.ArrayList;
import java.security.Principal;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inadang.domain.CriteriaReview;
import com.inadang.domain.CriteriaScroll;
import com.inadang.domain.MemberVO;
import com.inadang.domain.Menu;
import com.inadang.domain.Review;
import com.inadang.domain.Store;
import com.inadang.mapper.MemberMapper;
import com.inadang.service.MemberService;
import com.inadang.service.MenuService;
import com.inadang.service.ReviewService;
import com.inadang.service.StoreService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@AllArgsConstructor
@Log4j
@RequestMapping("store/*")
public class StoreController {
	private final StoreService storeService;
	private final MenuService menuService;
	private final ReviewService reviewService;
	private final MemberService memberService;
	
	
	/**
	 * @author 김치형
	 * @param model
	 * @param category
	 * @return
	 * 가게 리스트
	 */
	@GetMapping("list/{category}") 
	public String list(
			Model model, 
			@PathVariable Long category, 
			Optional<String> condition
		) {
		CriteriaScroll cri = new CriteriaScroll();
		List<Store> ad = storeService.listAd(category);
		
		String cdn = condition.orElse("");
		List<Store> list = storeService.list(category, cri, cdn);
		list.forEach(log::info);
		
		for(Store s : ad) {
			if(storeService.getLogo(s.getSno()) != null) {
				s.setLogo(storeService.getLogo(s.getSno()).getOrigin());
			}
		}
		for(Store s : list) {
			if(storeService.getLogo(s.getSno()) != null) {
				s.setLogo(storeService.getLogo(s.getSno()).getOrigin());
			}
		}
		model.addAttribute("ad", ad);
		model.addAttribute("stores", list);
		model.addAttribute("category", category);
		return "store/list";
		
	}
	
	/**
	 * @author 김치형
	 * @param sno
	 * @param model
	 * @return
	 * 가게 상세보기
	 */
	@GetMapping("detail/{sno}")
	public String detail(@PathVariable Long sno, Model model) {
		CriteriaReview cri = new CriteriaReview();
		Store store = storeService.get(sno);
		if(storeService.getLogo(sno) != null) {
			store.setLogo(storeService.getLogo(sno).getOrigin());
		}
		model.addAttribute("store", store);
		CriteriaScroll criMenu = new CriteriaScroll();
		List<Menu> list = menuService.list(sno, criMenu);
		for(Menu m : list) {
			m.setAttach(menuService.getAttach(m.getMno()));
		}
		model.addAttribute("menus", list);
		List<Review> reviews = reviewService.list(sno, cri);
		log.info(reviews);
		for(Review r : reviews) {
			r.setAttachs(reviewService.getAttach(r.getRno()));
		}
		
		
		model.addAttribute("reviews", reviews);
		
		return "store/detail";
	}
	
	/**
	 * @author 김치형
	 * @param sno
	 * @param lastNo
	 * @param amount
	 * @return
	 * menu 더보기
	 */
	@GetMapping({"menu/{sno}", "menu/{sno}/{lastNo}", "menu/{sno}/{lastNo}/{amount}"})
	@ResponseBody
	public List<Menu> getList(
			@PathVariable Long sno,
			@PathVariable(required=false) Optional<Long> lastNo,
			@PathVariable(required=false) Optional<Integer> amount
			) {
		CriteriaScroll cri = new CriteriaScroll();
		
		cri.setLastNo(lastNo.orElse(cri.getLastNo()));
		cri.setAmount(amount.orElse(cri.getAmount()));
		
		List<Menu> menus = menuService.list(sno, cri);
		
		for(Menu m : menus) {
			if(menuService.getAttach(m.getMno()) != null) {
				m.setAttach(menuService.getAttach(m.getMno()));
			}
		}
		return menus;
	}
	
	/**
	 * @author 김치형
	 * @param category
	 * @param lastNo
	 * @param amount
	 * @return
	 * 가게 더보기
	 */
	@GetMapping({"pages/{category}", "pages/{category}/{lastNo}", "pages/{category}/{lastNo}/{amount}", "pages/{category}/{lastNo}/{amount}/{condition}"})
	@ResponseBody
	public List<Store> getStoreList(
			@PathVariable Long category,
			@PathVariable(required=false) Optional<Long> lastNo,
			@PathVariable(required=false) Optional<Integer> amount,
			@PathVariable(required=false) Optional<String> condition
			) {
		CriteriaScroll cri = new CriteriaScroll();
		
		cri.setLastNo(lastNo.orElse(cri.getLastNo()));
		cri.setAmount(amount.orElse(cri.getAmount()));
		
		List<Store> stores = storeService.list(category, cri, condition.orElse(""));
		
		for(Store s : stores) {
			if(storeService.getLogo(s.getSno()) != null) {
				s.setLogo(storeService.getLogo(s.getSno()).getOrigin());
			}
		}
		return stores;
	}
	
	

	
	
	/**
	 * 
	 * @author ksj000417
	 *
	 */
	
	// notice
	@GetMapping("notice")
	public void notice(){
		log.info("storeManagement notice get");
	}
	
	// register
	@GetMapping("register")
	public void register(@AuthenticationPrincipal Principal principal, Model model){
		model.addAttribute("member", memberService.get(principal.getName()));
	}
	
	@PostMapping("register")
	public String register(@AuthenticationPrincipal Principal principal, Store store) {
		storeService.register(store);		
		memberService.updateSno(principal.getName(), store.getSno());
		
		return "/store/notice";
		// redirect
	}
	
	// detail
	@GetMapping({"get", "modify"})
	public void get(@AuthenticationPrincipal Principal principal, Model model){
		model.addAttribute("member", memberService.get(principal.getName()));
		model.addAttribute("store", storeService.getStoreById(principal.getName()));
		
//		model.addAttribute("store", storeService.getStoreById(principal.getName()));
		
	}

	// ad
	@GetMapping("ad")
	public void ad(){
		log.info("storeManagement ad get");
	}

	// history
	@GetMapping("history")
	public void history(){
		log.info("storeManagement history get");
	}
	
	
	
	
	
	
	
	
	// 메뉴
	@GetMapping("menu")
	public void menu() {
		
	}
	
	// 옵션
	@GetMapping("option")
	public void option() {
		
	}
}
