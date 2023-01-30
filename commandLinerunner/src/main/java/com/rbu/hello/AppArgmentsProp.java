package com.rbu.hello;

import java.util.List;
import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class AppArgmentsProp implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		String[] sourcearg=args.getSourceArgs();
		System.out.println("source");
		for(String sa:sourcearg) {
			System.out.println(sa);
		}
		System.out.println("non option");
		List<String> nonarg= args.getNonOptionArgs();
		for(String na:nonarg) {
			System.out.println(na);
		}
		
		System.out.println(" option");
		Set<String> setarg= args.getOptionNames();
		for(String key:setarg) {
			System.out.println(args.getOptionValues(key));
		}
	}

	
}
