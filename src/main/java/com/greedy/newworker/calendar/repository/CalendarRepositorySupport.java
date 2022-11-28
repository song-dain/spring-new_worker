package com.greedy.newworker.calendar.repository;

import java.util.List;
//import static com.greedy.newworker.calendar.entity.QCalendar.calendar;
import org.springframework.stereotype.Repository;
import com.greedy.newworker.calendar.dto.Criteria;
import com.greedy.newworker.calendar.entity.Calendar;
import com.greedy.newworker.employee.entity.Employee;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;

@Repository
public class CalendarRepositorySupport implements CalendarRepositoryCustom {

	private final JPAQueryFactory queryFactory;

	public CalendarRepositorySupport(JPAQueryFactory queryFactory) {
		this.queryFactory = queryFactory;
	}

	@Override
	public List<Calendar> scheduleFilter(Criteria criteria, Employee employee) {

		BooleanBuilder builder = new BooleanBuilder();

//		 연차 체크, 연차나 내 일정이 체크되어 있으면 본인 확인 (안 씀)
//		 if(criteria.getDayOff() != null) {
//			 builder.and(calendar.calendarCategory.calendarCategoryName.eq(criteria.getDayOff()));
//		 } 
//		 if(criteria.getMySchedule() != null || criteria.getDayOff() != null ) {
//			builder.and(calendar.employee.eq(employee));
//		 }
//
//		if(criteria.getMySchedule() != null) {
//			builder.or(calendar.calendarCategory.calendarCategoryName.eq(criteria.getMySchedule()));
//			builder.and(calendar.employee.eq(employee));
//		}
//		 if(criteria.getDeptSchedule() != null) {
//			 builder.or(calendar.calendarCategory.calendarCategoryName.eq(criteria.getDeptSchedule()));
//			 builder.and(calendar.dep.eq(employee.getDep()));
//		 }
//		 if(criteria.getComSchedule() != null) {
//			 builder.or(calendar.calendarCategory.calendarCategoryName.eq(criteria.getComSchedule()));
//		 }
//		 List<Calendar> fetch = queryFactory
//				 .selectFrom(calendar)
//				 .where(builder)
//				 
//				 .fetch();
//		return fetch;
		
		return null;
	}

}
