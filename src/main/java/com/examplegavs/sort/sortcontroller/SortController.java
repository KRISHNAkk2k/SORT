package com.examplegavs.sort.sortcontroller;

import java.lang.reflect.Array;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplegavs.sort.insertionservice.IsService;
import com.examplegavs.sort.sortservice.bsService;

@RestController

public class SortController {
	
	@Autowired
	bsService bsservice;

	@GetMapping("/bubblesort")
	public int[] run(@RequestBody int[] array) {
		bsservice.bubblesort(array);
		return array; 
	}

	@GetMapping("/insertionsort")
	public int[] msort(@RequestBody int[] arr) {
		IsService.sort(arr);
		return arr; 
	}
	

}


