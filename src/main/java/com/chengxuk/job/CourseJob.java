package com.chengxuk.job;

import com.chengxuk.domain.repository.CourseRepository;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Random;

public class CourseJob extends QuartzJobBean {

	@Autowired
	private CourseRepository courseRepository;


	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		courseRepository.findAll().forEach(
				course ->{
					course.setFavNum(course.getFavNum()+ new Random().nextInt(5));
					course.setJoinNum(course.getJoinNum()+ new Random().nextInt(3));
					course.setWorkNum(course.getJoinNum()+ new Random().nextInt(1));
					courseRepository.save(course);
				}
		);
	}

}
