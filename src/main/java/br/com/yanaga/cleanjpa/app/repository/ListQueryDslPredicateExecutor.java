package br.com.yanaga.cleanjpa.app.repository;

import java.util.List;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.mysema.query.types.OrderSpecifier;
import com.mysema.query.types.Predicate;

public interface ListQueryDslPredicateExecutor<T> extends QueryDslPredicateExecutor<T> {

	@Override
	public List<T> findAll(Predicate predicate);
	
	@Override
	public List<T> findAll(Predicate predicate, OrderSpecifier<?>... orders);
	
}