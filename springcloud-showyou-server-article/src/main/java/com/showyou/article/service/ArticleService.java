package com.showyou.article.service;

import java.util.List;

import com.showyou.article.domain.Article;

public interface ArticleService {
	
	
	public List<Article> getAllArticle();//获取所有文章
	public int saveArticle(Article article);//保存文章
}
