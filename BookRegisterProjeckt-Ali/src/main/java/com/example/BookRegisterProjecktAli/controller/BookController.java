package com.example.BookRegisterProjecktAli.controller;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.BookRegisterProjecktAli.repository.BookRepository;

@Controller
@RequestMapping("book")
public class BookController {

	@Autowired
	BookRepository bookrep;
	
	public BookController(BookRepository theBookRep) {
//ad		
		bookrep = theBookRep;
	}
	
	
	@RequestMapping("show-book")
	public String showBook(Model model) {
     List<Book> books = bookrep.findAll(); 
		
		model.addAttribute("books", books);
		
		return "book";
	} 
	
	@RequestMapping("/new-book")
	public String createBook (Model model) {
		Book book = new Book();
		
		model.addAttribute("TheBook", book);
		
		return "new-book";
	
}
	
	@RequestMapping("/save")
	public String saveBook(@ModelAttribute("theBook") Book book) {
		
		bookrep.save(book);
		
		return "redirect:/book";
	}
	
	@RequestMapping("/delete")
	public String deleteBook(@RequestParam("bookId") int theId) {
		
		bookrep.deleteById(theId);
		
		return "redirect:/book/bookShop";
	}
	@RequestMapping("/update")
	public String updateBook(@RequestParam("bookId") int theId ,Model model) {
		
		Optional<Book> book = bookrep.findById(theId);

		model.addAttribute("theBook",book);
		
		return "new-book";
	}
	
}
