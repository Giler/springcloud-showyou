package com.showyou.article.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.showyou.article.domain.Article;
import com.showyou.article.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {
	@Value("${testName}")
	private String userName;
	
	@Autowired
	private ArticleService articleService;
	
	
	@RequestMapping("/getAllArticle")
	public List<Article> getAllArticle(){
		return articleService.getAllArticle();
	}
	
	@RequestMapping("/saveArticle")
	public int saveArticle(Article article){
		articleService.saveArticle(article);
		return 0;
	}
	@RequestMapping("/show")
	public String show(Article article){
		return userName;
	}
	
	
}
