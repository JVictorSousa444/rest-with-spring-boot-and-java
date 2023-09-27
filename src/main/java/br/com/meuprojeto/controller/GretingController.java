package br.com.meuprojeto.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.meuprojeto.Greting;

@RestController
public class GretingController {

	private static final String template = "Hello, %S!";
	private  final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greting")
	public Greting greting(
			@RequestParam(value = "name", defaultValue = "World")
			String nome) {
		return new Greting(counter.incrementAndGet(), String.format(template, nome));
	}
	
}

