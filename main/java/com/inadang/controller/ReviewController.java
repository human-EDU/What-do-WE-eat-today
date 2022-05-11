package com.inadang.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inadang.domain.CriteriaReview;
import com.inadang.domain.Review;
import com.inadang.service.ReviewService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
/**
 * 
 * @author hungry(kch)
 *
 */
@RestController
@AllArgsConstructor
@Log4j
@RequestMapping("reviews/*")
public class ReviewController {
	
	private ReviewService service;
	
	@GetMapping({"pages/{sno}", "pages/{sno}/{lastRno}", "pages/{sno}/{lastRno}/{amount}"})
	public List<Review> getList(
			@PathVariable Long sno,
			@PathVariable(required=false) Optional<Long> lastRno,
			@PathVariable(required=false) Optional<Integer> amount
			) {
		CriteriaReview cri = new CriteriaReview();
		
		cri.setLastRno(lastRno.orElse(cri.getLastRno()));
		cri.setAmount(amount.orElse(cri.getAmount()));
		List<Review> reviews = service.list(sno, cri);
		for(Review r : reviews) {
			r.setAttachs(service.getAttach(r.getRno()));
		}
		
		return reviews;
	}
	
	@DeleteMapping("{rno}")
	public String remove(@PathVariable Long rno,@RequestBody Review review) {
		return service.remove(rno) ? "success" : null;
	}
}
