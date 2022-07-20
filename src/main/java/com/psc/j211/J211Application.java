package com.psc.j211;

import com.psc.j211.domain.Dept;
import com.psc.j211.domain.DeptRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
@AllArgsConstructor
@SpringBootApplication
public class J211Application implements ApplicationListener<ApplicationStartedEvent> {

	private final DeptRepository deptRepository;
	public static void main(String[] args) {
		SpringApplication.run(J211Application.class, args);
	}

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		log.debug("START !!!");

		deptRepository.save(new Dept(3, "3", "3"));

	}
}
