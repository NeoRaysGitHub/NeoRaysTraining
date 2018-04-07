package com.clust;

import org.springframework.stereotype.Component;

@Component
public class HellImpl implements Bean {

	@Override
	public void print() {
		System.out.println("executing in "+getClass().getSimpleName());
	}

}
