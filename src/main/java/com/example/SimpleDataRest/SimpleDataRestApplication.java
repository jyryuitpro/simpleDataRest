package com.example.SimpleDataRest;

import com.example.SimpleDataRest.domain.Board;
import com.example.SimpleDataRest.domain.Member;
import com.example.SimpleDataRest.repository.BoardRepository;
import com.example.SimpleDataRest.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleDataRestApplication implements CommandLineRunner {

	@Autowired
	private MemberRepository memberRepository;

	@Autowired
	private BoardRepository boardRepository;

	public static void main(String[] args) {
		SpringApplication.run(SimpleDataRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Member member1 = memberRepository.save(Member.join("member1", 20));
		Member member2 = memberRepository.save(Member.join("member2", 21));
		Member member3 = memberRepository.save(Member.join("member3", 22));
		Member member4 = memberRepository.save(Member.join("member4", 23));
		Member member5 = memberRepository.save(Member.join("member5", 24));

		boardRepository.save(Board.join("title1", "content1", member1));
		boardRepository.save(Board.join("title2", "content2", member2));
		boardRepository.save(Board.join("title3", "content3", member3));
		boardRepository.save(Board.join("title4", "content4", member4));
		boardRepository.save(Board.join("title5", "content5", member5));
	}
}
