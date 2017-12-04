package com.showyou.article.dao;

import java.util.List;

import com.showyou.article.domain.Article;

public interface ArticleDao{
	public List<Article> selectAllArticle();//查询所有文章
	public int addArticle(Article article);//增加文章
}
