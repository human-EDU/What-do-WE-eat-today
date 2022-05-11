package com.inadang.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.inadang.domain.CriteriaReview;
import com.inadang.domain.Review;
import com.inadang.domain.ReviewAttach;
import com.inadang.mapper.ReviewMapper;

import lombok.AllArgsConstructor;
@Service @AllArgsConstructor
public class ReviewServiceImpl implements ReviewService{

	private ReviewMapper mapper;
	
	@Override
	public List<Review> list(Long sno, CriteriaReview cri) {
		return mapper.selectAll(sno, cri);
	}
	
	@Override
	public List<Review> list(String id) {
		return mapper.selectMine(id);
	}

	@Override
	public Review get(Long rno) {
		return mapper.select(rno);
	}

	@Override
	public int register(Review review) {
		return mapper.insert(review);
	}

	@Override
	public boolean remove(Long rno) {
		return mapper.delete(rno);
	}

	@Override
	public int addAttach(ReviewAttach attach) {
		return mapper.insertAttach(attach);
	}

	@Override
	public boolean removeAttach(Long rno) {
		return mapper.deleteAttach(rno);
	}

	@Override
	public boolean removeAll(Long sno) {
		return mapper.deleteAll(sno);
	}

	@Override
	public int replyRegister(Review review) {
		return mapper.insertReply(review);
	}

	@Override
	public boolean replyModify(Review review) {
		return mapper.updateReply(review);
	}

	@Override
	public List<ReviewAttach> getAttach(Long rno) {
		return mapper.selectAttach(rno);
	}

	
	
}
