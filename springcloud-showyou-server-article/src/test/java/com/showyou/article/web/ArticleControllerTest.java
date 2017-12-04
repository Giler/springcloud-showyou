package com.showyou.article.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.showyou.article.controller.ArticleController;
import com.showyou.article.domain.Article;
import com.showyou.article.service.ArticleService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArticleControllerTest {
	
	@Autowired
	ArticleService articleService;
	
	@Autowired
	ArticleController articleController;
	
		
	@Test
	public void testSaveArticleService(){
		Article a = new Article();
		a.setLabel("springcloud");
		a.setTitle("LeanSpringCloud");
		a.setArticleAbstract("this is a simpl project222");
		
		articleService.saveArticle(a);
		
	}
	
	@Test
	public void testSaveArticleController(){
		Article a = new Article();
		a.setLabel("springcloud");
		a.setTitle("LeanSpringCloud");
		a.setArticleAbstract("this is a simpl project222");
		
		articleController.saveArticle(a);
	}
}
