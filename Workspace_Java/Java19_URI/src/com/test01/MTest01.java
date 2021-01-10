package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {
	
	public static void main(String[] args) throws URISyntaxException {
		URI u = new URI("http://localhost:8787/Java_19_URI_Web/res.jsp?name=%EC%A0%95%EC%88%98+&addr=%EC%95%88%EC%96%91");
	
		System.out.println(u.getScheme());
		System.out.println(u.getHost());
		System.out.println(u.getPort());
		System.out.println(u.getPath());
		System.out.println(u.getQuery());
	
	}

}
